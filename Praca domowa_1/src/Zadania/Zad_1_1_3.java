package Zadania;

import javax.swing.JOptionPane;

public class Zad_1_1_3 {

	public static void main(String[] args) {
		String iloscStr = JOptionPane.showInputDialog("Ile chcesz kupi� ziemniak�w?");
		double ilosc = Double.parseDouble(iloscStr);

		String cenaStr = JOptionPane.showInputDialog("Jaka jest cena za kilogram ziemniak�w?");
		double cena = Double.parseDouble(cenaStr);

		String iloscStrBanan = JOptionPane.showInputDialog("Ile chcesz kupi� banan�w?");
		double iloscBanan = Double.parseDouble(iloscStrBanan);

		String cenaStrBanan = JOptionPane.showInputDialog("Ile kosztuje kg banan�w?");
		double cenaBanan = Double.parseDouble(cenaStrBanan);

		JOptionPane.showMessageDialog(null,
				"Zap�acisz " + cena * ilosc + " z� za ziemniaki i " + iloscBanan * cenaBanan + "zl za banany.");

		if (cena * ilosc > iloscBanan * cenaBanan) {
			JOptionPane.showMessageDialog(null, "Za ziemniaki zap�acisz wi�cej.");
		} else if (iloscBanan * cenaBanan > cena * ilosc) {
			JOptionPane.showMessageDialog(null, "Za banany zap�acisz wi�cej.");
		} else {
			JOptionPane.showMessageDialog(null, "Zap�acisz tyle samo za oba produkty.");
		}
	}
}
