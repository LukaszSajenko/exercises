package klasy05_private_public;

public class SklepMonopolowy {
	
	public static void sprzedajPiwo(Osoba klient) {
		// sprawdzam pełnoletniość według rocznika
		
		if(klient.wiek() >= 18) {
			System.out.println(klient.getImie()
					+ ", proszę, oto piwo.");
		} else {
			System.out.println(klient.getImie()
					+ ", jesteś niepełnoletni, możesz kupić cukierki...");			
		}
	}

}
