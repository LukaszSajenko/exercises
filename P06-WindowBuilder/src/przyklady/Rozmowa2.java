package przyklady;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Dimension;
import javax.swing.SwingConstants;
import java.awt.Color;

public class Rozmowa2 {

	private static final Font LABEL_FONT = new Font("Dialog", Font.BOLD, 24);
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
					System.out.println("Okno gotowe");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		System.out.println("main: zleciłem wyświetlenie okna");
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
		frame.setBounds(100, 100, 450, 257);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
		
		JLabel lblJa = new JLabel("Jak masz na imię?");
		lblJa.setFont(LABEL_FONT);
		frame.getContentPane().add(lblJa);
		
		textField = new JTextField();
		textField.setMaximumSize(new Dimension(Integer.MAX_VALUE, 80));
		textField.setFont(new Font("Dialog", Font.PLAIN, 20));
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				powitaj();
			}
		});
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnOk = new JButton("OK");
		btnOk.setMinimumSize(new Dimension(100, 50));
		btnOk.setMaximumSize(new Dimension(Integer.MAX_VALUE, 50));
		btnOk.setFont(new Font("Dialog", Font.BOLD, 32));
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				powitaj();
			}
		});
		frame.getContentPane().add(btnOk);
		
		lblWitaj = new JLabel("Witaj");
		lblWitaj.setForeground(new Color(204, 51, 51));
		lblWitaj.setHorizontalAlignment(SwingConstants.CENTER);
		lblWitaj.setMaximumSize(new Dimension(Integer.MAX_VALUE, 50));
		lblWitaj.setFont(LABEL_FONT);
		frame.getContentPane().add(lblWitaj);
	}
	
	private void powitaj() {
		String imie = textField.getText();
		lblWitaj.setText("Witaj " + imie);
	}

}
