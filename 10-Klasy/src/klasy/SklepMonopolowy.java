package klasy;

import java.time.LocalDate;

public class SklepMonopolowy {
	
// sklep b�dzie sprzedwa� tylko jak si� jest pe�noletnim
	public static void sprzedajPiwo(Osoba klient) {
		// sprawdzam pe�noletno�� wed�ug rocznika
		if (klient.wiek() >= 18) {
			System.out.println(klient.getImie() + "!" + " " + "Prosz�, oto piwo.");
		} else {
			System.out.println(klient.getImie() + "!" + " " + "Nie jeste� pe�noletni/a.");
		}
		
	}

}
