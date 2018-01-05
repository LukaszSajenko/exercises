package pl.alx.szkolenie.kalkulator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class OknoKalkulatora2 {

	private JFrame frame;
	private JTextField txtArg1;
	private JTextField txtArg2;
	private JTextField txtWynik;
	private JComboBox<String> comboBoxOperacja;
	private boolean bylGuzik = false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OknoKalkulatora2 window = new OknoKalkulatora2();
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
	public OknoKalkulatora2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 640, 260);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblKalkulator = new JLabel("Kalkulator");
		lblKalkulator.setFont(new Font("Dialog", Font.BOLD, 18));
		lblKalkulator.setHorizontalAlignment(SwingConstants.CENTER);
		
		txtArg1 = new JTextField();
		txtArg1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getButton() == MouseEvent.BUTTON3
						&& ! txtWynik.getText().isEmpty()) {
					txtArg1.setText(txtWynik.getText());
				}
			}
		});
		txtArg1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				przelicz();
			}
		});
		txtArg1.setHorizontalAlignment(SwingConstants.RIGHT);
		txtArg1.setFont(new Font("Dialog", Font.PLAIN, 24));
		txtArg1.setColumns(10);
		
		txtArg2 = new JTextField();
		txtArg2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				przelicz();
			}
		});
		txtArg2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getButton() == MouseEvent.BUTTON3
						&& ! txtWynik.getText().isEmpty()) {
					txtArg2.setText(txtWynik.getText());
				}
			}
		});
		txtArg2.setHorizontalAlignment(SwingConstants.RIGHT);
		txtArg2.setFont(new Font("Dialog", Font.PLAIN, 24));
		txtArg2.setColumns(10);
		
		comboBoxOperacja = new JComboBox<>();
		comboBoxOperacja.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				przelicz();
			}
		});
		comboBoxOperacja.setFont(new Font("Dialog", Font.BOLD, 24));
		comboBoxOperacja.setModel(new DefaultComboBoxModel<>(new String[] {"+", "-", "*", "/", "mod", "pow", "min", "max"}));
		
		JButton btnPolicz = new JButton("Policz");
		btnPolicz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(bylGuzik) {
					txtArg1.setText(txtWynik.getText());
				}
				przelicz();
				bylGuzik = true;
			}
		});
		btnPolicz.setFont(new Font("Dialog", Font.BOLD, 24));
		
		txtWynik = new JTextField();
		txtWynik.setForeground(Color.BLUE);
		txtWynik.setHorizontalAlignment(SwingConstants.RIGHT);
		txtWynik.setFont(new Font("Dialog", Font.BOLD, 24));
		txtWynik.setText("0");
		txtWynik.setColumns(10);
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblKalkulator, GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(txtArg1, GroupLayout.PREFERRED_SIZE, 232, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnPolicz, GroupLayout.PREFERRED_SIZE, 226, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(comboBoxOperacja, 0, 91, Short.MAX_VALUE)
									.addGap(18)
									.addComponent(txtArg2, GroupLayout.PREFERRED_SIZE, 249, GroupLayout.PREFERRED_SIZE))
								.addComponent(txtWynik, GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE))))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblKalkulator)
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(txtArg2)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(txtArg1, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
							.addComponent(comboBoxOperacja)))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(txtWynik)
						.addComponent(btnPolicz, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addContainerGap(78, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
	}

	private void przelicz() {
		bylGuzik = false;
		if(txtArg1.getText().isEmpty() || txtArg2.getText().isEmpty()) {
			txtWynik.setText("");
			return;
		}
		try {
			double arg1 = Double.parseDouble(txtArg1.getText().replace(',', '.'));
			double arg2 = Double.parseDouble(txtArg2.getText().replace(',', '.'));

			String dzialanie = (String) comboBoxOperacja.getSelectedItem();
			// char znak = dzialanie.charAt(0);

			double wynik = LogikaKalkulatora.oblicz(dzialanie, arg1, arg2);

			// txtWynik.setText(Double.toString(wynik));
			// txtWynik.setText(String.valueOf(wynik));
			txtWynik.setText("" + wynik);
		} catch (NumberFormatException e1) {
			JOptionPane.showMessageDialog(frame, "Niepoprawny format liczby", "Błąd",
					JOptionPane.ERROR_MESSAGE);
			txtWynik.setText("####");
		}
	}
}
