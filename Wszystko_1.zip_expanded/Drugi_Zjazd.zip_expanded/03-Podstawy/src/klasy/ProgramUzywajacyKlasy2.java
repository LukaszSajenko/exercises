package klasy;

public class ProgramUzywajacyKlasy2 {
	
	public static void main(String[] args) {
		
		Osoba osoba1 = new Osoba("Jan", "Kowalski", 30);	
		
		
//		osoba1.imie = "Jan";
//		osoba1.nazwisko = "Kowalski";
//		osoba1.wiek = 30;
		
		Osoba osoba2 = new Osoba();
		osoba2.imie = "Ala";
		osoba2.nazwisko = "Kowalska";
		osoba2.wiek = 73;
		
		osoba1.wypiszSie();
		osoba2.wypiszSie();
		
		int w1 = osoba1.ileLatDoEmerytury();
		System.out.println(w1);
		
		//albo w jednej instrukji
		
		System.out.println(osoba2.ileLatDoEmerytury());
		
	}
	
	
	
}

