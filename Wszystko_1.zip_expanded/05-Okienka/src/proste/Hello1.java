package proste;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Hello1 {

	public static void main(String[] args) {
		
		JFrame okno = new JFrame("Pierwsze okno");
//		okno.setTitle(title); Inna metoda podawania tytu³u okna
		okno.setSize(500, 500);
		JLabel napis = new JLabel("Pozdrowienia z Gdañska");
		okno.add(napis);
		
		okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		okno.setVisible(true);


	}

}
