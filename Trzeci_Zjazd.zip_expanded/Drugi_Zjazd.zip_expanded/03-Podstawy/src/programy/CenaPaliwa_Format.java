package programy;

import javax.swing.JOptionPane;

public class CenaPaliwa_Format {

	public static void main(String[] args) {
		String spalanieStr = JOptionPane.showInputDialog(null, "Ile pali Twoje auto?");
		double spalanie = Double.parseDouble(spalanieStr);
		
		String cenaPaliwa = JOptionPane.showInputDialog(null, "Cena paliwa?");
		double cena = Double.parseDouble(cenaPaliwa);
		
		String kilometry = JOptionPane.showInputDialog("Ile przejedziesz kilometrów?");
		double dystans = Double.parseDouble(kilometry);
		
		
		JOptionPane.showMessageDialog(null, "Koszt przejazdu wynosi " + (dystans/100)*(spalanie*cena));
		
		
		
		

	}

}
