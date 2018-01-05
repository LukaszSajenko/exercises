package proste;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Hello3 {

	public static void main(String[] args) {
		JFrame okno = new JFrame("Pierwsze okno");
		okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		okno.setSize(600, 400);
		okno.getContentPane().setBackground(new Color(0xFFFFCC));
		
		FlowLayout layout = new FlowLayout();
		layout.setHgap(40);
		layout.setHgap(20);
		okno.setLayout(layout);
		
		JLabel napis1 = new JLabel("Pozdrowienia z Gdańska");
		napis1.setForeground(Color.RED);
		napis1.setFont(new Font("Verdana", Font.BOLD , 24));
		okno.add(napis1);
		
		JLabel napis2 = new JLabel("oraz z Gdyni");
		napis2.setForeground(Color.BLUE);
		napis2.setFont(new Font("Verdana", Font.BOLD , 24));
		okno.add(napis2);
		
		JButton guzik1 = new JButton("Klinkij mnie");
		okno.add(guzik1);
		
		JButton guzik2 = new JButton("Albo mnie");
		okno.add(guzik2);
		
		okno.setVisible(true);
		
	}

}
