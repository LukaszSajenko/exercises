package klasy06_dziedziczenie;

import java.time.LocalDate;

public class Program1 {

	public static void main(String[] args) {
		Osoba janek = new Osoba("Jan", "Kowalski", "1990-02-21");
		
		System.out.println(janek.getImie());
		
		System.out.println("Zmieniam imię...");
		
		janek.setImie("Janek");
		
		System.out.println(janek.getImie());
		
	}
}
