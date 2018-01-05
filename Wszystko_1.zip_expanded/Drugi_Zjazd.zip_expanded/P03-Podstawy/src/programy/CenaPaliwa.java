package programy;

import javax.swing.JOptionPane;

public class CenaPaliwa {

	public static void main(String[] args) {
		
		String spalanieStr = JOptionPane.showInputDialog("Ile pali Twój samochód?");
		double spalanie = Double.parseDouble(spalanieStr);
		
		String cenaStr = JOptionPane.showInputDialog("Jaka jest cena pliwa?");
		double cena = Double.parseDouble(cenaStr);
		
		String kmStr = JOptionPane.showInputDialog("Ile kilometrów ma trasa?");
		// int km = Integer.parseInt(kmStr);
		double km = Double.parseDouble(kmStr);
		
		double wynik = spalanie * cena * km / 100.0;
		
		JOptionPane.showMessageDialog(null, "Koszt przejazdu wynosi " + wynik);
	}

}
