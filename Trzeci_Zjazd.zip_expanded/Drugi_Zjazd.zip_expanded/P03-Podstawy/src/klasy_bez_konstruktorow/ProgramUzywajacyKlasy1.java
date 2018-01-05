package klasy_bez_konstruktorow;

public class ProgramUzywajacyKlasy1 {

	public static void main(String[] args) {
		Osoba osoba1 = new Osoba();
		
		System.out.println(osoba1);
		
		osoba1.imie = "Jan";
		osoba1.nazwisko = "Kowalski";
		osoba1.wiek = 30;
		
		System.out.println(osoba1);
		System.out.println(osoba1.imie);
		
		System.out.println();
		System.out.println("Druga osoba:");
		
		Osoba osoba2 = new Osoba();
		System.out.println(osoba2);
		System.out.println(osoba2.imie);
		osoba2.imie = "Ala";
		osoba2.nazwisko = "Kowalska";
		osoba2.wiek = 33;
		System.out.println(osoba2.imie);
		
		System.out.println(osoba1.imie);
	}
}
