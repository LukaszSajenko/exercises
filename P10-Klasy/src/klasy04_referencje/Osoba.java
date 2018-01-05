package klasy04_referencje;

import java.time.LocalDate;
import java.time.Period;

public class Osoba {
	String imie, nazwisko;
	LocalDate dataUrodzenia;
	
	Osoba() {
	}
	
	Osoba(String i, String n, LocalDate d) {
		imie = i;
		nazwisko = n;
		dataUrodzenia = d;
	}
	
	Osoba(String i, String n, String d) {
		imie = i;
		nazwisko = n;
		dataUrodzenia = LocalDate.parse(d);
	}
	
	int wiekRocznikowo() {
		return LocalDate.now().getYear() - dataUrodzenia.getYear();		
	}
	
	int wiek() {
		Period roznica = Period.between(dataUrodzenia, LocalDate.now());
		return roznica.getYears();
	}

	public String toString() {
		return imie + " " + nazwisko + " ur." + dataUrodzenia;
	}
	
}
