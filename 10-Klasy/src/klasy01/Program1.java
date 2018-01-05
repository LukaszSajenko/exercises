package klasy01;

import java.time.LocalDate;

public class Program1 {

	public static void main(String[] args) {
		//To jest deklaracja bez wpisania warto�ci
		Osoba ala;
		//nie wolno odczytywa� tej zmiennej, bo nie jest zainicjalizowana
//		System.out.println(ala);
//		System.out.println(ala.nazwisko);
//		ala.nazwisko = "Kowalska";
		//nie kompiluj� si�
		
		
		//To jest utworzenie nowego obiektu klasy osoba i wpisanie go na zmienn�
		//i wpisanie referencji do niego na zmienn�
		ala = new Osoba();
		
		System.out.println(ala);
		System.out.println(ala.imie);
		System.out.println(ala.dataUrodzenia);
		
		// dop�ki pola nie s� prywatne, mo�na wpisywa� bezpo�rednio na nie warto�ci
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
