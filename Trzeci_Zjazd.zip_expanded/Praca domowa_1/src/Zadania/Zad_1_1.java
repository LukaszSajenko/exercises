package Zadania;

import javax.swing.JOptionPane;

public class Zad_1_1 {

	public static void main(String[] args) {
//		String ilo��Str = JOptionPane.showInputDialog("Ile chcesz kupi� ziemniak�w?");
//		double ilo�� = Double.parseDouble(ilo��Str);
		
		String cenaStr = JOptionPane.showInputDialog("Jaka jest cena za kilogram ziemniak�w?");
		double cena = Double.parseDouble(cenaStr);
		
		//ilo�� ziemniak�w, to 5kg
		
		JOptionPane.showMessageDialog(null, "Za 5 kilo ziemniak�w zap�acisz " + cena*5 + " z�." );

	}

}
