package klasy;

import java.time.LocalDate;

public class Program2 {

	public static void main(String[] args) {
		Osoba ala = new Osoba("Ala", "Kowalska", LocalDate.of(1999, 7, 22));
		System.out.println(ala.getImie() + " " + ala.getNazwisko());
		System.out.println(ala);
		
		System.out.println( ala.wiekRocznikowo() );
		System.out.println( ala.wiek() );
				
		Osoba janek = new Osoba("Jan", "Kowalski", "1990-02-21");
		System.out.println(janek.getImie() + " " + janek.getNazwisko());
		System.out.println( janek.wiekRocznikowo() );
		System.out.println( janek.wiek() );

		System.out.println();
		System.out.println("Próbują kupić piwo...");
		
		SklepMonopolowy.sprzedajPiwo(ala);
		SklepMonopolowy.sprzedajPiwo(janek);
	}

}
