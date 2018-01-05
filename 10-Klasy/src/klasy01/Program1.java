package klasy01;

import java.time.LocalDate;

public class Program1 {

	public static void main(String[] args) {
		//To jest deklaracja bez wpisania wartoœci
		Osoba ala;
		//nie wolno odczytywaæ tej zmiennej, bo nie jest zainicjalizowana
//		System.out.println(ala);
//		System.out.println(ala.nazwisko);
//		ala.nazwisko = "Kowalska";
		//nie kompiluj¹ siê
		
		
		//To jest utworzenie nowego obiektu klasy osoba i wpisanie go na zmienn¹
		//i wpisanie referencji do niego na zmienn¹
		ala = new Osoba();
		
		System.out.println(ala);
		System.out.println(ala.imie);
		System.out.println(ala.dataUrodzenia);
		
		// dopóki pola nie s¹ prywatne, mo¿na wpisywaæ bezpoœrednio na nie wartoœci
		ala.imie = "Ala";
		ala.nazwisko = "Kowalska";
		ala.dataUrodzenia = LocalDate.of(2000, 07, 22);
		// sprawdzane tylko po roku, bez dnia
		
		SklepMonopolowy.sprzedajPiwo(ala);
		
		Osoba janek = new Osoba();
		janek.imie = "Jan";
		janek.nazwisko = "Faluta";
		janek.dataUrodzenia = LocalDate.parse("1990-02-21");
		
		SklepMonopolowy.sprzedajPiwo(janek);
	}

}
