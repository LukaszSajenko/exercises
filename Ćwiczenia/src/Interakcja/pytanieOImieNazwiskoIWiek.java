package Interakcja;

import javax.swing.JOptionPane;

public class pytanieOImieNazwiskoIWiek {

	public static void main(String[] args) {
		String imie = JOptionPane.showInputDialog("Jak masz na imiê?");
		String nazwisko = JOptionPane.showInputDialog("A jak masz na nazwisko?");
		String wiek = JOptionPane.showInputDialog("I ile masz lat?");
		
		int wiekJakoNapis = Integer.parseInt(wiek);
		
		JOptionPane.showMessageDialog(null, "Nazywasz siê " + imie + " " + nazwisko + " i masz " + wiekJakoNapis + " lat/a.");
		
		if(wiekJakoNapis >= 18) {
			JOptionPane.showMessageDialog(null, "Jesteœ pe³noletni, powodzenia w doros³ym ¿yciu :)");
		} else {
			JOptionPane.showMessageDialog(null, "Jesteœ jeszcze niepe³noletni, ciesz siê beztrosk¹ :)");
		}

	}

}
