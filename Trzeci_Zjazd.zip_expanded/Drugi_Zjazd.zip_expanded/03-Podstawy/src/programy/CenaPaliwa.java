package programy;

import javax.swing.JOptionPane;

public class CenaPaliwa {

	public static void main(String[] args) {
		String spalanieStr = JOptionPane.showInputDialog(null, "Ile pali Twoje auto?");
		spalanieStr = spalanieStr.replace(',', '.'); //Zamienia przecinek na kropkê
		double spalanie = Double.parseDouble(spalanieStr);
		String cenaPaliwa = JOptionPane.showInputDialog(null, "Cena paliwa?");
		double cena = Double.parseDouble(cenaPaliwa.replace(',', '.'));
		
		String kilometry = JOptionPane.showInputDialog("Ile przejedziesz kilometrów?");
		double dystans = Double.parseDouble(kilometry);
		
		String wynikStr = String.format("%.2f", (dystans/100)*(spalanie*cena)); //2 miejsca po przecinku w wyniku
		
		JOptionPane.showMessageDialog(null, "Koszt przejazdu wynosi " + (dystans/100)*(spalanie*cena));
		
		
		
		

	}

}
