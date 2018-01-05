SELECT * FROM zawodnicy;

SeLecT * fRoM zaWodNicY;

/* to jest kometarz
blokowy */

-- komentarz jendolinijkowy

-- wielkość liter w nazwach tabel i kolumn czasami ma znaczenie
-- np. w MySQL na Windows wielkość liter ma znaczenie
-- w innych bazach gdy nazwy się "cytuje" (w MySQL i SQLite tak się `cytuje`)

-- Klauzula SELECT

-- * wszystkie kolumny z tabeli
SELECT * FROM zawodnicy;

-- nazwy kolumn, które mają być odczytane
SELECT kraj, imie, nazwisko FROM zawodnicy;

-- moża wpisywać wyrażenia
SELECT imie, nazwisko, wzrost / 100.0, length(nazwisko)
FROM zawodnicy;

SELECT imie, nazwisko, wzrost, waga,
       waga / ((wzrost / 100.0) * (wzrost / 100.0))
FROM zawodnicy;

SELECT imie || ' ' || nazwisko as zawodnik,
       wzrost,
	   waga as masa_ciala,
       10000.0 * waga / wzrost / wzrost as bmi
FROM zawodnicy;

-- WHERE

SELECT * FROM zawodnicy
WHERE kraj = 'POL';  -- pojedyncze =

SELECT * FROM zawodnicy
WHERE wzrost = 180;

SELECT * FROM zawodnicy
WHERE wzrost >= 180;

SELECT * FROM zawodnicy
WHERE wzrost >= 180 AND kraj = 'POL';

SELECT * FROM zawodnicy
WHERE wzrost >= 180 OR kraj = 'POL';

SELECT * FROM zawodnicy
WHERE wzrost >= 180 AND NOT kraj = 'POL';

SELECT * FROM zawodnicy
WHERE wzrost BETWEEN 175 AND 180;

SELECT * FROM zawodnicy
WHERE wzrost NOT BETWEEN 175 AND 180;

SELECT * FROM zawodnicy
WHERE kraj IN ('AUT', 'GER');

SELECT * FROM zawodnicy
WHERE lower(kraj) IN ('aut', 'ger');

SELECT * FROM trenerzy;

-- porównania w jedną i w drugś stonę pominą rekordy z NULL
SELECT * FROM trenerzy WHERE data_ur_t >= '1970-01-01';
SELECT * FROM trenerzy WHERE data_ur_t < '1970-01-01';

-- Nie powinno się porównywać wartości z NULL-em - to zawsze daje wynik FALSE
SELECT * FROM trenerzy WHERE data_ur_t = NULL;
SELECT * FROM trenerzy WHERE data_ur_t != NULL;

-- To jest poprawne:
SELECT * FROM trenerzy WHERE data_ur_t IS NULL;
SELECT * FROM trenerzy WHERE data_ur_t IS NOT NULL;

-- Znajdz zawodnikow o nazwiskach co najmniej 8-literowych

SELECT * FROM zawodnicy WHERE length(nazwisko) >= 8;

SELECT * FROM zawodnicy WHERE imie LIKE 'M%';

SELECT * FROM zawodnicy WHERE imie LIKE 'Ma%';

SELECT * FROM zawodnicy WHERE imie LIKE 'Mar_in';

-- Znajdz zawodnikow, ktorych druga litera imienia to 'a'
SELECT * FROM zawodnicy WHERE imie LIKE '_a%';

-- ORDER BY
SELECT * FROM zawodnicy
ORDER BY nazwisko;

SELECT * FROM zawodnicy
ORDER BY length(nazwisko);

SELECT imie, nazwisko
FROM zawodnicy
WHERE kraj = 'GER'
ORDER BY length(nazwisko);

SELECT * FROM zawodnicy
ORDER BY kraj;

SELECT * FROM zawodnicy
ORDER BY kraj, nazwisko, imie;

-- Rosnąco (to jest domyślne i nie trzeba pisać ASC) lub malejąco
-- Pisze się oddzielnie dla każdej kolumny
SELECT * FROM zawodnicy
ORDER BY kraj ASC, wzrost DESC;

SELECT imie, nazwisko, kraj, wzrost, waga
FROM zawodnicy
ORDER BY wzrost, nazwisko;

-- W ORDER BY można podać nr kolumny
SELECT imie, nazwisko, kraj, wzrost, waga
FROM zawodnicy
ORDER BY 4, 2;

SELECT imie || ' ' || nazwisko AS zawodnik,
       wzrost,
	   waga as masa_ciala,
       10000.0 * waga / wzrost / wzrost AS bmi
FROM zawodnicy
ORDER BY bmi DESC;


-- grupowanie / agregacja

-- funkcje agregujące - z wielu wartości wyliczają jedną
-- To jest 5 klasycznych funkcji agregujących
SELECT count(waga), sum(waga), avg(waga), min(waga), max(waga)
FROM zawodnicy;

-- Szczegóły działania count. 3 sposoby użycia
SELECT * FROM trenerzy;

-- ile rekordów, ile nienullowych wartości, ile _różnych_ nienullowych wartości
SELECT count(*), count(data_ur_t), count(DISTINCT data_ur_t)
FROM trenerzy;

SELECT count(*), sum(waga), avg(wzrost)
FROM zawodnicy;

SELECT count(*), sum(waga), avg(wzrost)
FROM zawodnicy
WHERE kraj = 'POL';

-- GROUP BY pozwala policzyć funkcje agregujące dla całych "grup"
SELECT kraj, count(*), sum(waga), avg(wzrost)
FROM zawodnicy
GROUP BY kraj;

-- HAVING to jakby WHERE, ale działający na całych grupach
-- Tylko w WHERE mogę odwoływać się do pojedynczych rekordów
-- Tylko w HAVING mogę stosować funkcje agregujące
SELECT kraj, count(*), sum(waga), avg(wzrost)
  FROM zawodnicy
  GROUP BY kraj
  HAVING avg(wzrost) >= 180;

SELECT kraj, count(*), sum(waga), avg(wzrost)
  FROM zawodnicy
  WHERE imie LIKE '_a%'
  GROUP BY kraj
  HAVING avg(wzrost) >= 180;
  
-- FROM i JOINy

-- Podanie kilku tabel po przecinku - "każdy z każdym"
SELECT *
FROM zawodnicy, trenerzy;

SELECT *
FROM zawodnicy, trenerzy
WHERE zawodnicy.kraj = trenerzy.kraj;

--- Aliasy tabel - krótsze nazwy pisane po tabelach, aby się wygodniej odwoływać
SELECT *
FROM zawodnicy zaw, trenerzy tr
WHERE zaw.kraj = tr.kraj;

SELECT z.imie || ' ' || z.nazwisko AS zawodnik,
  t.imie_t || ' ' || t.nazwisko_t AS trener
FROM zawodnicy z, trenerzy t
WHERE z.kraj = t.kraj;

-- Efekt "każdy z każdym" daje też notacja CROSS JOIN
SELECT *
FROM zawodnicy CROSS JOIN trenerzy;

SELECT *
FROM zawodnicy z JOIN trenerzy t ON z.kraj = t.kraj;

-- Pierwsza zaleta JOIN: warunki złączenia są pisane bezpośrednio obok samego złączenia
SELECT *
FROM zawodnicy z
  JOIN trenerzy t ON t.kraj = z.kraj
  JOIN skocznie s ON s.kraj_s = z.kraj
WHERE z.wzrost >= 180;

-- Zapis z przecinkiem i WHERE wciąż możliwy, ale mniej "ładny"
SELECT *
FROM zawodnicy z, trenerzy t, skocznie s
WHERE t.kraj = z.kraj
    AND s.kraj_s = z.kraj
	AND z.wzrost >= 180;

-- Druga korzyść z JOINa - różne sposoby podawania kryterium złączenia
-- 1) JOIN ON - dowolny warunek logiczny
SELECT *
FROM zawodnicy
  JOIN trenerzy ON trenerzy.kraj = zawodnicy.kraj;

-- 2) JOIN USING - dobieranie ze względu na wartości w wybranej kolumnie
SELECT *
FROM zawodnicy
  JOIN trenerzy USING(kraj);

-- 3) NATURAL JOIN - porównuje wszystkie kolumny, które mają takie same nazwy w lewej i prawej tabeli
SELECT *
FROM zawodnicy
  NATURAL JOIN trenerzy;
  
-- Trzecia "korzyść" z JOIN - różne 'kierunki' dołączania
-- (kiedy w jednej tabeli jest rekord bez swojego odpowiednika w drugiej)

-- INNER JOIN - wypisuje tylko rekordy, które mają swoje odpowiedniki
-- INNER JOIN jest domyślny i słowa INNER można nie pisać

-- nie ma Alana Ablorna
SELECT *
FROM zawodnicy
  JOIN trenerzy USING(kraj);

SELECT *
FROM zawodnicy
  INNER JOIN trenerzy USING(kraj);
  
-- złączenia zewnętrzne - `OUTER JOIN`
-- słowo OUTER jest opcjonalne i można go nie pisać
-- ale trzeba podać 'kierunek' złączenia: LEFT, RIGHT albo FULL

-- jest Alan Alborne
SELECT *
FROM zawodnicy
  LEFT JOIN trenerzy USING(kraj);

SELECT *
FROM zawodnicy
  OUTER LEFT JOIN trenerzy USING(kraj);

-- RIGHT zwrocilby Hirozaku Yagi, ale nie Alan Alborn
SELECT *
FROM zawodnicy
  RIGHT JOIN trenerzy USING(kraj);

-- RIGHT zwrocilby zarowno trenera Hirozaku Yagi i zawodnika Alan Alborn
SELECT *
FROM zawodnicy
  FULL JOIN trenerzy USING(kraj);

  
-- Zadanka
-- Wypisz dane o krajach (ilu zawodników, średni wzrost i waga)
-- sortując malejąco według średniego wzrostu.
SELECT kraj, count(*), avg(waga), avg(wzrost)
FROM zawodnicy
GROUP BY kraj
ORDER BY avg(wzrost) DESC;

-- Wypisz zbiorcze dane o krajach (GROUP BY)
-- dołączając też imię i nazwisko trenera.
SELECT kraj, imie_t, nazwisko_t, count(*), avg(wzrost)
FROM zawodnicy JOIN trenerzy USING(kraj)
GROUP BY kraj;

-- W porządniejszych bazach danych, np. Oraclu, trzeba napisać tak:
SELECT kraj, imie_t, nazwisko_t, count(*), avg(wzrost)
FROM zawodnicy JOIN trenerzy USING(kraj)
GROUP BY kraj, imie_t, nazwisko_t;


-- Dla każdego kraju podaj datę urodzenia najstarszego zawodnika
SELECT kraj, count(*), min(data_ur)
FROM zawodnicy
GROUP BY kraj;


