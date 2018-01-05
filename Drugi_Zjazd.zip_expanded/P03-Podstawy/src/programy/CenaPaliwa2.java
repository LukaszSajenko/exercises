package programy;

import javax.swing.JOptionPane;

public class CenaPaliwa2 {

	static double kosztPodrozy(double spalanie, double cena, int km) {
		return spalanie * cena * km / 100.0;
	}

	public static void main(String[] args) {
		
		String spalanieStr = JOptionPane.showInputDialog("Ile pali Twój samochód?");
		double spalanie = Double.parseDouble(spalanieStr);
		
		String cenaStr = JOptionPane.showInputDialog("Jaka jest cena pliwa?");
		double cena = Double.parseDouble(cenaStr);
		
		String kmStr = JOptionPane.showInputDialog("Ile kilometrów ma trasa?");
		int km = Integer.parseInt(kmStr);
		
		double wynik = kosztPodrozy(spalanie, cena, km);
		
		JOptionPane.showMessageDialog(null, "Koszt przejazdu wynosi " + wynik);
	}

}
