package klasy;

import java.time.LocalDate;

public class Program5_Studenci {

	public static void main(String[] args) {
		Osoba o = new Osoba("Ala", "Kowalska", "1983-03-04");

		Student s = new Student("Jan", "Kowalski", LocalDate.of(1997, 7, 8), 2, "biologia");

		System.out.println(o);
		System.out.println(s);

		// Studenci "potrafi¹" wszystko to co Osoby
		System.out.println(s.getImie());
		System.out.println(o.getImie());
		System.out.println(s.wiek());
		System.out.println(o.wiek());
	
		// Studenta mogê potraktowaæ jako osobê, tzn. u¿yæ obiektu klasy Student
		// wszêdzie tam gdzie wymagana jest osoba
		
		Osoba jan_jako_osoba = s;
		System.out.println(jan_jako_osoba); // wypisuje sie jako student!!!
		System.out.println(jan_jako_osoba.wiek());
		
		SklepMonopolowy.sprzedajPiwo(s);
		
		Konto konto = new Konto(1313, s, 2000);
		System.out.println(konto);
		
		Osoba[] osoby = new Osoba[2];
		osoby[0] = o;
		osoby[1] = s;
		for(Osoba osoba : osoby) {
			System.out.println(osoba + " ma " + osoba.wiek() + " lat.");
		}
	}

}
