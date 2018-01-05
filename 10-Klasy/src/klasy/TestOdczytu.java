package klasy;

import java.io.File;
import java.util.List;

public class TestOdczytu {

	public static void main(String[] args) {
		File plik = new File("osoby.csv");
		
		List<Osoba> osoby = ObslugaCSV.odczytajOsoby(plik);
		
		System.out.println("Odczytałem osoby w liczbie " + osoby.size());
		for (Osoba osoba : osoby) {
			System.out.println(osoba);
		}

	}

}
