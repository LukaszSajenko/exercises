package proste;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Hello3 {

	public static void main(String[] args) {
		
		JFrame okno = new JFrame("Pierwsze okno");
//		okno.setTitle(title); Inna metoda podawania tytu³u okna
		okno.setSize(500, 500);
		JLabel napis = new JLabel("Pozdrowienia z Gdañska");
		okno.add(napis);
		napis.setHorizontalAlignment(JLabel.CENTER); //0 = œrodek 2 = lewo 4 = prawo
		napis.setForeground(Color.RED); //kolorki
		okno.getContentPane().setBackground(Color.GREEN);
//		okno.getContentPane().setBackground(new Color(255, 255, 255));
//		okno.getContentPane().setBackground(new Color)0xFFFFCC));
		napis.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		
		
		okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		okno.setVisible(true);


	}

}
