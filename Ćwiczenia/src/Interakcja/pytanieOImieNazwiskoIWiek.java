package Interakcja;

import javax.swing.JOptionPane;

public class pytanieOImieNazwiskoIWiek {

	public static void main(String[] args) {
		String imie = JOptionPane.showInputDialog("Jak masz na imi�?");
		String nazwisko = JOptionPane.showInputDialog("A jak masz na nazwisko?");
		String wiek = JOptionPane.showInputDialog("I ile masz lat?");
		
		int wiekJakoNapis = Integer.parseInt(wiek);
		
		JOptionPane.showMessageDialog(null, "Nazywasz si� " + imie + " " + nazwisko + " i masz " + wiekJakoNapis + " lat/a.");
		
		if(wiekJakoNapis >= 18) {
			JOptionPane.showMessageDialog(null, "Jeste� pe�noletni, powodzenia w doros�ym �yciu :)");
		} else {
			JOptionPane.showMessageDialog(null, "Jeste� jeszcze niepe�noletni, ciesz si� beztrosk� :)");
		}

	}

}
