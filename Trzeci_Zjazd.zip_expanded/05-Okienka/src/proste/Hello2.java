package proste;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Hello2 {

	public static void main(String[] args) {
		
		JFrame okno = new JFrame("Pierwsze okno");
//		okno.setTitle(title); Inna metoda podawania tytu³u okna
		okno.setSize(500, 500);
		
		FlowLayout layout = new FlowLayout();
		okno.setLayout(layout);
		
		JLabel napis1 = new JLabel("Pozdrowienia z Gdañska");
		okno.add(napis1);
		napis1.setHorizontalAlignment(JLabel.CENTER); //0 = œrodek 2 = lewo 4 = prawo
		napis1.setForeground(Color.RED); //kolorki
		okno.getContentPane().setBackground(Color.GREEN);
//		okno.getContentPane().setBackground(new Color(255, 255, 255));
//		okno.getContentPane().setBackground(new Color)0xFFFFCC));
		napis1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		
		JLabel napis2 = new JLabel(" oraz z Gdyni");
		okno.add(napis2);
		napis2.setHorizontalAlignment(JLabel.CENTER); //0 = œrodek 2 = lewo 4 = prawo
		napis2.setForeground(Color.RED); //kolorki
		okno.getContentPane().setBackground(Color.GREEN);
		napis2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		
		JButton guzik1 = new JButton("Kliknij mnie!");
		okno.add(guzik1);
		
		JButton guzik2 = new JButton("Albo mnie!");
		okno.add(guzik2);
		
		
		okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		okno.setVisible(true);


	}

}
