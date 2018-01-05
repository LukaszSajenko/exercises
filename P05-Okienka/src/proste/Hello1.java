package proste;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Hello1 {

	public static void main(String[] args) {
		JFrame okno = new JFrame("Pierwsze okno");
		okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		okno.setSize(600, 400);
		
		JLabel napis = new JLabel("Pozdrowienia z Gdańska");
		okno.add(napis);
		
		okno.setVisible(true);
		
	}

}
