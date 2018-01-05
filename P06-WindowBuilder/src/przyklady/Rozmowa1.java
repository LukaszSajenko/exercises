package przyklady;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Rozmowa1 {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Rozmowa1 window = new Rozmowa1();
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
	public Rozmowa1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
		
		JLabel lblJa = new JLabel("Jak masz na imię?");
		frame.getContentPane().add(lblJa);
		
		textField = new JTextField();
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblWitaj = new JLabel("Witaj");

		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String imie = textField.getText();
				lblWitaj.setText("Witaj " + imie);
			}
		});
		frame.getContentPane().add(btnOk);
		
		frame.getContentPane().add(lblWitaj);
	}

}
