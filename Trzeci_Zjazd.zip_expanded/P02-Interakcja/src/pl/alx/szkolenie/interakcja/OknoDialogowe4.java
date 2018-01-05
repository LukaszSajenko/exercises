package pl.alx.szkolenie.interakcja;

import javax.swing.JOptionPane;

public class OknoDialogowe4 {

	public static void main(String[] args) {
		String imie = JOptionPane.showInputDialog("Jak masz na imię?");
		
		String wiekJakoNapis = JOptionPane.showInputDialog("Ile masz lat?");
		
		try {
			// W Javie jest bardzo bardzo mało niejawnych konwersji (implicit)
			// To jest przykład JAWNEJ konwersji (explicit)
			int wiek = Integer.parseInt(wiekJakoNapis);
			
			JOptionPane.showMessageDialog(null, "Witaj " + imie + ", masz " + wiek + " lat.");
			
			String napis;
			
			if(wiek >= 18) {
				napis = "Możesz kupić piwo";
			} else {
				int ileBrakuje = 18 - wiek;
				napis = "Możesz kupić cukierki, a piwo dopiero za "
								+ ileBrakuje + " lat.";
			}
			
			JOptionPane.showMessageDialog(null, napis);
			
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Niepoprawny format liczby",
					"Błąd", JOptionPane.ERROR_MESSAGE);
		}
	}
}
