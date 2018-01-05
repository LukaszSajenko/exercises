package petle;

import java.util.Random;

import javax.swing.JOptionPane;

public class PytajOLiczby_If {

	public static void main(String[] args) {
		
		Random random = new Random();
		int x = random.nextInt(50);
		int y = random.nextInt(50);
		int suma = x + y;
		
		String odp = JOptionPane.showInputDialog("Ile to jest " + x + " + " + y + " ?");
		int doSprawdzenia = Integer.parseInt(odp);
		
		if(doSprawdzenia == suma) {
			JOptionPane.showMessageDialog(null, "Dobry wynik");
		} else {
			JOptionPane.showMessageDialog(null, "Porażka :(");
		}
	}

}
