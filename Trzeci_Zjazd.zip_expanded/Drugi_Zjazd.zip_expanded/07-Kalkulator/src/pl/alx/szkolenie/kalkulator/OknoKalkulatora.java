package pl.alx.szkolenie.kalkulator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class OknoKalkulatora {

	private JFrame frame;
	private JTextField txtArg2;
	private JTextField txtArg1;
	private JTextField txtWynik;
	private JComboBox comboBoxOperacja;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OknoKalkulatora window = new OknoKalkulatora();
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
	public OknoKalkulatora() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 815, 288);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		txtArg2 = new JTextField();
		txtArg2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				przelicz();
				
			}
		});
		txtArg2.setHorizontalAlignment(SwingConstants.RIGHT);
		txtArg2.setFont(new Font("Dialog", Font.PLAIN, 20));
		txtArg2.setColumns(10);
		
		JLabel lblKalkulator = new JLabel("Kalkulator");
		lblKalkulator.setHorizontalAlignment(SwingConstants.CENTER);
		lblKalkulator.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblKalkulator.setHorizontalTextPosition(SwingConstants.CENTER);
		
		txtArg1 = new JTextField();
		txtArg1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//TODO
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
		txtArg1.setFont(new Font("Dialog", Font.PLAIN, 20));
		txtArg1.setColumns(10);
		
		comboBoxOperacja = new JComboBox();
		comboBoxOperacja.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				przelicz();
			}
		});
		comboBoxOperacja.setFont(new Font("Dialog", Font.PLAIN, 20));
		comboBoxOperacja.setModel(new DefaultComboBoxModel(new String[] {"+", "-", "*", "/", "mod", "^", "min", "max"}));
		
		JButton btnPolicz = new JButton("Policz");
		btnPolicz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				przelicz();
			}
		});
		btnPolicz.setFont(new Font("Dialog", Font.PLAIN, 20));
		
		txtWynik = new JTextField();
		txtWynik.setHorizontalAlignment(SwingConstants.RIGHT);
		txtWynik.setFont(new Font("Dialog", Font.BOLD, 20));
		txtWynik.setText("Wynik");
		txtWynik.setColumns(10);
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(139)
					.addComponent(lblKalkulator, GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
					.addGap(143))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(txtArg1, GroupLayout.PREFERRED_SIZE, 214, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnPolicz))
					.addGap(80)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(comboBoxOperacja, GroupLayout.PREFERRED_SIZE, 217, GroupLayout.PREFERRED_SIZE)
							.addGap(63)
							.addComponent(txtArg2, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE))
						.addComponent(txtWynik))
					.addContainerGap(11, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblKalkulator)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(txtArg2, 0, 0, Short.MAX_VALUE)
						.addGroup(Alignment.LEADING, groupLayout.createParallelGroup(Alignment.TRAILING)
							.addComponent(comboBoxOperacja, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addComponent(txtArg1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnPolicz)
						.addComponent(txtWynik, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
					.addGap(152))
		);
		frame.getContentPane().setLayout(groupLayout);
	}

	private void przelicz() {
		if(txtArg1.getText().isEmpty() || txtArg2.getText().isEmpty()){
			txtWynik.setText("");
			return;
		}
		try {
			double arg1 = Double.parseDouble(txtArg1.getText().replace(',', '.'));
			double arg2 = Double.parseDouble(txtArg2.getText().replace(',', '.'));
			
			String dzialanie = (String) comboBoxOperacja.getSelectedItem();
			
			double wynik = LogikaKalkulatora.oblicz(dzialanie, arg1, arg2);
			
			//txtWynik.setText(Double.toString(wynik));
			//txtWynik.setText(String.valueOf(wynik));
			txtWynik.setText("" + wynik);
		} catch (NumberFormatException e1) {
			JOptionPane.showMessageDialog(frame, "Niepoprawny format liczby!", "Błąd!", JOptionPane.ERROR_MESSAGE);
			txtWynik.setText("Błąd");
			
		}
	}
}
