package klasy03_konstruktory;

import java.time.LocalDate;

public class Program1 {

	public static void main(String[] args) {
		// to jest "deklaracja" bez wpisania wartości
		Osoba ala;
		
		// nie wolno odczytywać tej zmiennej, bo to jest niezainicjalizowana zmienna lokalna
//NK		System.out.println(ala);
//NK		System.out.println(ala.nazwisko);
//NK		ala.nazwisko = "Kowalska";
	
		// to jest utworzenie nowego obiektu klasy Osoba
		// i wpisanie referencji do niego na zmienną
		ala = new Osoba();
		System.out.println(ala);
		// można odczytywać niezainicjalizowane pola (tak naprawdę one są zainicjalizowane domyślnie na null albo 0)
		System.out.println(ala.imie);
		
		// dopóki pola nie są prywatne, można bezpośrednio wpisywać na nie wartości
		ala.imie = "Ala";
		ala.nazwisko = "Kowalska";
		ala.dataUrodzenia = LocalDate.of(2000, 7, 22);

		System.out.println(ala.imie);
		
		SklepMonopolowy.sprzedajPiwo(ala);
		
		Osoba janek = new Osoba();
		janek.imie = "Jan";
		janek.nazwisko = "Kowalski";
		janek.dataUrodzenia = LocalDate.parse("1990-02-21");
		SklepMonopolowy.sprzedajPiwo(janek);
	}
}
