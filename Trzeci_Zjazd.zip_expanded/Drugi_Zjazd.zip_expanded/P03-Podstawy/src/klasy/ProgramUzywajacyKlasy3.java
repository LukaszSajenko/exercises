package klasy;

public class ProgramUzywajacyKlasy3 {

	public static void main(String[] args) {
		Osoba osoba1 = new Osoba("Jan", "Kowalski", 30);
		
		Osoba osoba2 = new Osoba("Ala", "Kowalska", 28);
		
		osoba1.wypiszSie();
		System.out.println(osoba1.ileLatDoEmerytury());

		osoba2.wypiszSie();
		System.out.println(osoba2.ileLatDoEmerytury());
		
	}
}
