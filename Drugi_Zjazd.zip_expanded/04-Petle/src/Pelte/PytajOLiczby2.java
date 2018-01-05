package Pelte;

import java.util.Random;

import javax.swing.JOptionPane;

public class PytajOLiczby2 {
	
	public static void main(String[] args) {
		
		Random random = new Random();
		int x = random.nextInt(50);
		int y = random.nextInt(50);
		int suma = x + y;
		
		
		boolean jeszczeNieZgadl = true;
		
		while(jeszczeNieZgadl) {
			String odp = JOptionPane.showInputDialog("Ile to jest " + x + " + " + y + " ? ");
			int propozycja = Integer.parseInt(odp);
			if(propozycja == suma) {
				jeszczeNieZgadl = false;
			}
			
		}
		
		JOptionPane.showMessageDialog(null, "Tak, suma to poprawny wynik");
		
//		int propozycja;
//		do {		
//			String odp = JOptionPane.showInputDialog("Ile to jest " + x + " + " + y + " ? ");
//			propozycja = Integer.parseInt(odp);
//			
//		} while(propozycja != suma);
		
//rozwi¹zanie bez pêtli
		//		if (wynik == suma)
//			JOptionPane.showMessageDialog(null,"To jest prawid³owy wynik"); 
//		else if (wynik != suma)
//			JOptionPane.showMessageDialog(null, "To nie jest prawid³owy wynik");
		// } else {
		//	JOptionPane.showMessageDialog(null, "To nie jest prawid³owy wynik");
		
	}

}
