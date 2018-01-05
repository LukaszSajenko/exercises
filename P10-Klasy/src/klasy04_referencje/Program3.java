package klasy04_referencje;

import java.time.LocalDate;

public class Program3 {

	public static void main(String[] args) {
		Osoba ala = new Osoba("Ala", "Kowalska", LocalDate.of(1999, 7, 22));
		
		// Każdy z tych sposobów wypisywania używa metody toString
		System.out.println(ala);
		System.out.println(ala.toString());
		String napis = "Osoba: " + ala;
		System.out.println(napis);
		
		System.out.println();
		Osoba janek = new Osoba("Jan", "Kowalski", "1990-02-21");
		System.out.println(janek);
	}

}
