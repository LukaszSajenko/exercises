package klasy;

import java.time.LocalDate;

public class Program6_Studenci {

	public static void main(String[] args) {
		Osoba o = new Osoba("Ala", "Kowalska", "1983-03-04");
		
		Student s = new Student("Jan", "Kowalski",
				LocalDate.of(1997, 7, 8), 2, "biologia");
				
		System.out.println(o);
		System.out.println(s);
		
		// Studenci "potrafią" wszystko to co Osoby
		// Nie pisaliśmy ponownie metod getImie i wiek dla Studentów, zostały odziedziczone
		System.out.println(o.getImie() + " " + o.wiek());
		System.out.println(s.getImie() + " " + s.wiek());
		
		// Studenta mogę potraktować jako Osobę, tzn. użyć obiektu klasy Student wszędzie tam, gdzie wymagana jest Osoba
		// to się nazywa "polimorfizm"
		Osoba jan_jako_osoba = s;
		System.out.println(jan_jako_osoba);  // wypisuje się jako student!!!
		System.out.println(jan_jako_osoba.wiek());
		
		SklepMonopolowy.sprzedajPiwo(s);
		
		Konto konto = new Konto(1313, s, 2000);
		System.out.println(konto);
		
		System.out.println("\n tablica:");
		// mogę np. mieszać Studentów i Osoby w jednej tablicy
		Osoba[] osoby = new Osoba[2];
		osoby[0] = o;
		osoby[1] = s;
		for(Osoba osoba : osoby) {
			System.out.println(osoba + " ma " + osoba.wiek() + " lat.");
		}
		
		
	}

}
