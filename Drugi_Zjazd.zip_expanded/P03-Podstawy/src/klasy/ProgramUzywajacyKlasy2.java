package klasy;

import javax.swing.JOptionPane;

public class ProgramUzywajacyKlasy2 {

	public static void main(String[] args) {
		Osoba osoba1 = new Osoba("Jan", "Kowalski", 30);
		
		Osoba osoba2 = new Osoba();
		osoba2.imie = "Ala";
		osoba2.nazwisko = "Kowalska";
		osoba2.wiek = 68;
		
		osoba1.wypiszSie();
		osoba2.wypiszSie();
		
		// albo zapisać na zmienną a potem wypisać
		int w1 = osoba1.ileLatDoEmerytury();

		//osoba1.ileLatDoEmerytury();
		
		System.out.println(w1);
		System.out.println("Janowi do emerytury zotało " + w1);
		System.out.println("czyli miesięcy: " + 12 * w1);
		//JOptionPane.showMessageDialog(null, "Do emerytury Janowi zostało " + w1 + " lat");
		
		// albo wypisać w jednej instrukcji
		
		System.out.println(osoba2.ileLatDoEmerytury());
		
		//System.out.println(65 - osoba2.wiek);
	}
}
