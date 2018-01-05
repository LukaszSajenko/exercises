package pl.alx.szkolenie.interakcja;

import javax.swing.JOptionPane;

public class OknoDialogowe {

	public static void main(String[] args) {
		String imie = JOptionPane.showInputDialog("Jak masz na imię?");
		JOptionPane.showMessageDialog(null, "Witaj " + imie + "!");
	}

}
