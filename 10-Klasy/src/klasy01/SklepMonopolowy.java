package klasy01;

import java.time.LocalDate;

public class SklepMonopolowy {
	
// sklep b�dzie sprzedwa� tylko jak si� jest pe�noletnim
	public static void sprzedajPiwo(Osoba klient) {
		// sprawdzam pe�noletno�� wed�ug rocznika
		if (LocalDate.now().getYear() - klient.dataUrodzenia.getYear() >= 18) {
			System.out.println(klient.imie + "!" + " " + "Prosz�, oto piwo.");
		} else {
			System.out.println(klient.imie + "!" + " " + "Nie jeste� pe�noletni/a.");
		}
		
	}

}
