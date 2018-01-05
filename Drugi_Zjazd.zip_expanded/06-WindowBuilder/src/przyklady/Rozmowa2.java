package przyklady;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import java.awt.Component;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Dimension;
import javax.swing.SwingConstants;

public class Rozmowa2 {

	private static final Font LABEL_FONT = new Font("Times New Roman", Font.PLAIN, 20);
	private JFrame frame;
	private JTextField textField;
	private JLabel lblWitaj;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Rozmowa2 window = new Rozmowa2();
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
	public Rozmowa2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setForeground(Color.BLACK);
		frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
		
		JLabel lblJakMaszNa = new JLabel("Jak masz na imi\u0119?");
		lblJakMaszNa.setFont(LABEL_FONT);
		frame.getContentPane().add(lblJakMaszNa);
		
		textField = new JTextField();
		textField.setMaximumSize(new Dimension(120000, 80));
		textField.setFont(LABEL_FONT);
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				powitaj();
			}
		});
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		lblWitaj = new JLabel("Witaj ");
		lblWitaj.setFont(LABEL_FONT);
		JButton btnOk = new JButton("OK");
		btnOk.setMaximumSize(new Dimension(1000, 35));
		btnOk.setMinimumSize(new Dimension(70, 35));
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				powitaj();
				
			}
		});
		frame.getContentPane().add(btnOk);
		
		
		frame.getContentPane().add(lblWitaj);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private void powitaj() {
		String imie = textField.getText();
		lblWitaj.setText("Witaj " + imie + "!");
		
	}

}
