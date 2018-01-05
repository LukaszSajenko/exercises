package klasy01;

import java.time.LocalDate;

public class SklepMonopolowy {
	
// sklep bêdzie sprzedwa³ tylko jak siê jest pe³noletnim
	public static void sprzedajPiwo(Osoba klient) {
		// sprawdzam pe³noletnoœæ wed³ug rocznika
		if (LocalDate.now().getYear() - klient.dataUrodzenia.getYear() >= 18) {
			System.out.println(klient.imie + "!" + " " + "Proszê, oto piwo.");
		} else {
			System.out.println(klient.imie + "!" + " " + "Nie jesteœ pe³noletni/a.");
		}
		
	}

}
