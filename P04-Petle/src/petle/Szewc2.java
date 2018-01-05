package petle;

import javax.swing.JOptionPane;

public class Szewc2 {

	public static void main(String[] args) {
		
		String dzienStr = JOptionPane.showInputDialog("Którego dnia oddajesz buty? (podaj numer)");
		int dzien = Integer.parseInt(dzienStr);
		
		String ileDniStr = JOptionPane.showInputDialog("Ile dni trwa naprawa?");
		int ileDni = Integer.parseInt(ileDniStr);
		
		int koniecNaprawy = (dzien + ileDni) % 7;

		// żeby z 7 czy 14 wyszło 7 a nie 0 można napisać taki wzór:
		// int koniecNaprawy = (dzien + ileDni - 1) % 7 + 1;

		JOptionPane.showMessageDialog(null,
				"Buty odbierzesz "+kiedyOdbior(koniecNaprawy));
	}
	
	private static String kiedyOdbior(int numer) {
		switch(numer) {
		case 1 : return "w poniedziałek";
		case 2 : return "we wtorek";
		case 3 : return "w środę";
		case 4 : return "w czwartek";
		case 5 : return "w piątek";
		case 6 : return "w sobotę";
		case 7 : case 0 : return "w niedzielę";
		default : return "BŁĄD";
		}
	}

}
