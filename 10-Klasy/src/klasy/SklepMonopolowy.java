package klasy;

import java.time.LocalDate;

public class SklepMonopolowy {
	
// sklep bêdzie sprzedwa³ tylko jak siê jest pe³noletnim
	public static void sprzedajPiwo(Osoba klient) {
		// sprawdzam pe³noletnoœæ wed³ug rocznika
		if (klient.wiek() >= 18) {
			System.out.println(klient.getImie() + "!" + " " + "Proszê, oto piwo.");
		} else {
			System.out.println(klient.getImie() + "!" + " " + "Nie jesteœ pe³noletni/a.");
		}
		
	}

}
