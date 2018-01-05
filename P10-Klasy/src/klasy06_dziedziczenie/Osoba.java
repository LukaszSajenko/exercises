package klasy06_dziedziczenie;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Osoba {
	private String imie, nazwisko;
	private LocalDate dataUrodzenia;
	
	public Osoba() {
	}
	
	public Osoba(String i, String n, LocalDate d) {
		imie = i;
		nazwisko = n;
		dataUrodzenia = d;
	}
	
	public Osoba(String i, String n, String d) {
		imie = i;
		nazwisko = n;
		dataUrodzenia = LocalDate.parse(d);
	}
	
	public String getImie() {
		return imie;
	}

	public String getNazwisko() {
		return nazwisko;
	}
	
	public void setImie(String i) {
		imie = i;
	}
	

	public int wiekRocznikowo() {
		return LocalDate.now().getYear() - dataUrodzenia.getYear();		
	}
	
	public int wiek() {
		Period roznica = Period.between(dataUrodzenia, LocalDate.now());
		return roznica.getYears();
	}

	public String toString() {
		return imie + " " + nazwisko + " ur." + dataUrodzenia;
	}
}
