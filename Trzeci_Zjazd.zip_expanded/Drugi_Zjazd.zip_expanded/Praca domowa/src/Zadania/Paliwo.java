package Zadania;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.JTextPane;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Paliwo {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Paliwo window = new Paliwo();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Paliwo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JTextPane txtpnIlePaliTwoje = new JTextPane();
		txtpnIlePaliTwoje.setBounds(12, 13, 184, 22);
		txtpnIlePaliTwoje.setText("Ile pali Twoje auto? (l/100km)");
		frame.getContentPane().add(txtpnIlePaliTwoje);

		textField = new JTextField();
		textField.setBounds(227, 13, 116, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JTextPane txtpnIleKosztujePaliwo = new JTextPane();
		txtpnIleKosztujePaliwo.setText("Ile kosztuje paliwo? (z\u0142/l)");
		txtpnIleKosztujePaliwo.setBounds(12, 48, 184, 22);
		frame.getContentPane().add(txtpnIleKosztujePaliwo);

		JTextPane txtpnDystansDoPrzejechania = new JTextPane();
		txtpnDystansDoPrzejechania.setText("Dystans do przejechania (km)");
		txtpnDystansDoPrzejechania.setBounds(12, 87, 184, 22);
		frame.getContentPane().add(txtpnDystansDoPrzejechania);

		textField_1 = new JTextField();
		textField_1.setBounds(227, 48, 116, 22);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setBounds(227, 87, 116, 22);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);

		JButton btnPoliczKoszt = new JButton("Policz koszt!");
		btnPoliczKoszt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				policz();
			}
		});
		btnPoliczKoszt.setBounds(149, 132, 125, 25);
		frame.getContentPane().add(btnPoliczKoszt);

		textField_3 = new JTextField();
		textField_3.setBounds(149, 175, 125, 22);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
	}

	private void policz() {
		double spalanie = Double.parseDouble(textField.getText());
		double dystans = Double.parseDouble(textField_1.getText());
		double cena = Double.parseDouble(textField_2.getText());

		double wynik = spalanie / 100.0 * dystans * cena;

		textField_3.setText("" + wynik);
	}
}
