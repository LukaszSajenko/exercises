package Zadania;

import javax.swing.JOptionPane;

public class Szewc1 {

	public static void main(String[] args) {
		
		String dzienStr = JOptionPane.showInputDialog("Którego dnia oddajesz buty do naprawy? (Podaj numer)");		
		int dzien = Integer.parseInt(dzienStr);
		
		String ileDniStr = JOptionPane.showInputDialog("Ile dni trwa naprawa?");
		int ileDni = Integer.parseInt(ileDniStr);
		
		int koniecNaprawy = (dzien + ileDni) % 7;
		
		//int koniecNaprawy = (dzien + ileDni - 1); ¯eby z 7 wysz³o 0 to taki wzrór
		
		JOptionPane.showMessageDialog(null, 
				"Buty odbierzesz "+kiedyOdbior(koniecNaprawy));
		
		

	}
	
	private static String kiedyOdbior(int numer) {
		switch(numer) {
		case 1 : return "Poniedzia³ek";
		case 2 : return "Wtorek";
		case 3 : return "Œroda";
		case 4 : return "Czwartek";
		case 5 : return "Pi¹tek";
		case 6 : return "Sobota";
		case 7 : case 0 : return "Niedziela";
//		case 8 : return "Poniedzia³ek";
//		case 9 : return "Wtorek";
//		case 10 : return "Œroda";
//		case 11 : return "Czwartek";
//		case 12 : return "Pi¹tek";
//		case 13 : return "Sobota";
//		case 14 : return "Niedziela";
// Inny sposób rozwi¹zania zadania
		default : return "B£¥D";
		}
	}
}
