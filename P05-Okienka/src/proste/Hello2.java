package proste;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Hello2 {

	public static void main(String[] args) {
		JFrame okno = new JFrame("Pierwsze okno");
		okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		okno.setSize(600, 400);
		//okno.getContentPane().setBackground(Color.YELLOW);
		// składowe barwy R G B  od 0 do 255 każda
		//okno.getContentPane().setBackground(new Color(255, 255, 200));
		// albo w notacji szesnastkowej każda składowa od 00 do FF
		okno.getContentPane().setBackground(new Color(0xFFFFCC));
		
		JLabel napis = new JLabel("Pozdrowienia z Gdańska");
		napis.setHorizontalAlignment(JLabel.CENTER);
		napis.setForeground(Color.RED);
		napis.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC , 32));
		
		okno.add(napis);
		
		okno.setVisible(true);
		
	}

}
