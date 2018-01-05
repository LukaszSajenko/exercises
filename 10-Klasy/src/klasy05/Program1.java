package klasy05;

import java.time.LocalDate;

public class Program1 {

	public static void main(String[] args) {

		Osoba janek = new Osoba("Jan", "Kowalski", LocalDate.parse("1990-02-21"));
		System.out.println(janek.getImie());

		System.out.println("Zmieniam imiê...");

		janek.setImie("Janek");
		System.out.println(janek.getImie());

	}

}
