package klasy02_metody;

import java.time.LocalDate;

public class SklepMonopolowy {
	
	public static void sprzedajPiwo(Osoba klient) {
		// sprawdzam pełnoletniość według rocznika
		
		if(LocalDate.now().getYear() - klient.dataUrodzenia.getYear() >= 18) {
			System.out.println("Proszę, oto piwo.");
		} else {
			System.out.println("Jesteś niepełnoletni, możesz kupić cukierki...");			
		}
	}

}
