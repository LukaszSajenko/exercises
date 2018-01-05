package klasy;

import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TestZapisu {

	public static void main(String[] args) {
		File plik = new File("osoby.csv");
		
		List<Osoba> osoby = new ArrayList<>();
		osoby.add(new Osoba("Ala", "Kowalska", "2001-02-03"));
		osoby.add(new Osoba("Ola", "Niekowalska", "1975-04-07"));
		osoby.add(new Osoba("Jan", "Nowacki", "1997-02-13"));
		osoby.add(new Osoba("Tomasz", "Dziwacki", LocalDate.now()));
		osoby.add(new Student("Adam", "Studencki", LocalDate.now(), 4, "informtyka"));
		osoby.add(new Osoba("Elżbieta", "Nowakowska", "2001-02-03"));
		
		System.out.println("Zapisujemy...");
		
		ObslugaCSV.zapiszOsoby(osoby, plik);
		System.out.println("Gotowe");
	}

}
