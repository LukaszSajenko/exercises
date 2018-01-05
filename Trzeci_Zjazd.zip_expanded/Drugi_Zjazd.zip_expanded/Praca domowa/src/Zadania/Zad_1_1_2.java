package Zadania;

import javax.swing.JOptionPane;

public class Zad_1_1_2 {

	public static void main(String[] args) {
		String iloœæStr = JOptionPane.showInputDialog("Ile chcesz kupiæ ziemniaków?");
		double iloœæ = Double.parseDouble(iloœæStr);
		
		String cenaStr = JOptionPane.showInputDialog("Jaka jest cena za kilogram ziemniaków?");
		double cena = Double.parseDouble(cenaStr);
		
		//iloœæ ziemniaków, to 5kg
		
		JOptionPane.showMessageDialog(null, "Zap³acisz " + cena*iloœæ + " z³." );

	}

}
