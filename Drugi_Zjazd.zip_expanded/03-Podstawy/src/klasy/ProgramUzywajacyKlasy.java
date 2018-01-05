package klasy;

public class ProgramUzywajacyKlasy {
	
	public static void main(String[] args) {
		
		Osoba osoba1 = new Osoba();	
		
		System.out.println(osoba1);
		
		osoba1.imie = "Jan";
		osoba1.nazwisko = "Kowalski";
		osoba1.wiek = 30;
		System.out.println(osoba1.imie);
		System.out.println();
		Osoba osoba2 = new Osoba();
		osoba2.imie = "Ala";
		osoba2.nazwisko = "Kowalska";
		osoba2.wiek = 45;
		System.out.println(osoba2);
		System.out.println(osoba2.imie);
		
	}
	
}

