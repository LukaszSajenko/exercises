package klasy05_private_public;

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
		//DateTimeFormatter format = DateTimeFormatter.BASIC_ISO_DATE;
		
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd.MM.YYYY");
		
		String dataSformatowana = dataUrodzenia.format(format);
		
		return imie + " " + nazwisko + " ur." + dataSformatowana;
	}
}
