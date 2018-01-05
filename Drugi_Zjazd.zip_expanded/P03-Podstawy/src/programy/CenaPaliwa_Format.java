package programy;

import java.util.Locale;

import javax.swing.JOptionPane;

public class CenaPaliwa_Format {

	public static void main(String[] args) {
		
		String spalanieStr = JOptionPane.showInputDialog("Ile pali Twój samochód?");
		spalanieStr = spalanieStr.replace(',', '.');
		double spalanie = Double.parseDouble(spalanieStr);
		
		String cenaStr = JOptionPane.showInputDialog("Jaka jest cena pliwa?");
		double cena = Double.parseDouble(cenaStr.replace(',', '.'));
		
		String kmStr = JOptionPane.showInputDialog("Ile kilometrów ma trasa?");
		int km = Integer.parseInt(kmStr);
		
		double wynik = spalanie * cena * km / 100.0;
		
		String wynikStr = String.format("%.2f", wynik);
		// ewentualnie formatowanie "amerykańskie" z kropką:
		//String wynikStr = String.format(Locale.US, "%.2f", wynik);
		
		JOptionPane.showMessageDialog(null, "Koszt przejazdu wynosi " + wynikStr);
	}

}
