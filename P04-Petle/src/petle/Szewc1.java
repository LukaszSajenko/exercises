package petle;

import javax.swing.JOptionPane;

public class Szewc1 {

	public static void main(String[] args) {
		
		String dzienStr = JOptionPane.showInputDialog("Którego dnia oddajesz buty? (podaj numer)");
		int dzien = Integer.parseInt(dzienStr);
		
		String ileDniStr = JOptionPane.showInputDialog("Ile dni trwa naprawa?");
		int ileDni = Integer.parseInt(ileDniStr);
		
		int koniecNaprawy = dzien + ileDni;
		
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
		case 7 : return "w niedzielę";
		case 8 : return "w poniedziałek";
		case 9 : return "we wtorek";
		case 10 : return "w środę";
		case 11 : return "w czwartek";
		case 12 : return "w piątek";
		case 13 : return "w sobotę";
		case 14 : return "w niedzielę";
		default : return "BŁĄD";
		}
	}

}
