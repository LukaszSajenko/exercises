package klasy;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class TestZapisu {

	public static void main(String[] args) {
		File plik = new File("osoby.csv");
		
		List<Osoba> osoby = new ArrayList<>();
		osoby.add(new Osoba("Ala", "Kowlaska", "2001-02-03"));
		osoby.add(new Osoba("Ola", "Kowl", "2002-05-13"));
		osoby.add(new Osoba("Ewa", "Kolaska", "1999-02-03"));
		osoby.add(new Osoba("Kasia", "Rowa", "1982-12-03"));
		osoby.add(new Osoba("Ania", "Kowlaska", "1988-05-12"));
		
		System.out.println("Zapisujemy");
		
		ObslugaCSV.zapiszOsoby(osoby, plik);
		System.out.println("Gotowe");

	}

}
