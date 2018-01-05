package petle;

import java.util.Random;

import javax.swing.JOptionPane;

public class PytajOLiczby3 {

	public static void main(String[] args) {		
		Random random = new Random();
		int x = random.nextInt(50);
		int y = random.nextInt(50);
		int suma = x + y;
		
		while(true) {
			String odp = JOptionPane.showInputDialog("Ile to jest " + x + " + " + y + " ?");
			int propozycja = Integer.parseInt(odp);
			if(propozycja == suma) {
				break;
			}
		}
		
		JOptionPane.showMessageDialog(null, "Tak, " + suma + " to poprawny wynik.");
	}
}
