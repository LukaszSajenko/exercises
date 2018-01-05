package klasy02;

import java.time.LocalDate;

public class Program2 {

	public static void main(String[] args) {
		Osoba ala = new Osoba();
		ala.imie = "Ala";
		ala.nazwisko = "Kowalska";
		ala.dataUrodzenia = LocalDate.of(1999, 07, 22);
		// sprawdzane tylko po roku, bez dnia
		
		System.out.println(ala.wiekRocznikowo());
		System.out.println(ala.wiek());

		Osoba janek = new Osoba();
		janek.imie = "Jan";
		janek.nazwisko = "Faluta";
		janek.dataUrodzenia = LocalDate.parse("1990-02-21");
		
		System.out.println(janek.wiekRocznikowo());
		System.out.println(janek.wiek());
	}

}
