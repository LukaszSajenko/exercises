package pl.alx.szkolenie.interakcja;

import javax.swing.JOptionPane;

public class OknoDialogowe2 {

	public static void main(String[] args) {
		String imie = JOptionPane.showInputDialog("Jak masz na imię?");
		
		String wiekJakoNapis = JOptionPane.showInputDialog("Ile masz lat?");
		
		// W Javie jest bardzo bardzo mało niejawnych konwersji (implicit)
		// To jest przykład JAWNEJ konwersji (explicit)
		int wiek = Integer.parseInt(wiekJakoNapis);
		
		JOptionPane.showMessageDialog(null, "Witaj " + imie + ", masz " + wiek + " lat.");
		
		if(wiek >= 18) {
			JOptionPane.showMessageDialog(null, "Możesz kupić piwo");
		} else {
			int ileBrakuje = 18 - wiek;
			JOptionPane.showMessageDialog(null,
					"Możesz kupić cukierki, a piwo dopiero za " + ileBrakuje + " lat.");
		}
	}
}
