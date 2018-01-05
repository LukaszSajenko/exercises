package klasy02_metody;

import java.time.LocalDate;
import java.time.Period;

public class Osoba {
	String imie, nazwisko;
	LocalDate dataUrodzenia;	
	
	int wiekRocznikowo() {
		return LocalDate.now().getYear() - dataUrodzenia.getYear();		
	}
	
	int wiek() {
		Period roznica = Period.between(dataUrodzenia, LocalDate.now());
		return roznica.getYears();
	}

}
