package pl.alx.waluty;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;

import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class PrzelicznikWalut {

	private static final Font LABEL_FONT = new Font("Dialog", Font.PLAIN, 16);
	private static final Font TEXT_FONT = new Font("Dialog", Font.BOLD, 18);
	private JFrame frame;
	private JTextField txtKwotapln;
	private JTextField txtKwotawaluta;
	private TabelaKursow tabela;
	private JComboBox<String> comboBox;
	private boolean zajety = false;
	private Kierunek ostatnio = null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		final PrzelicznikWalut window = new PrzelicznikWalut();
		try {
			window.tabela = TabelaKursow.pobierzAktualne();
			
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						window.initialize();
						window.frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		} catch (BladAplikacji e) {
			e.printStackTrace();
		}
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 487, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblPrzelicznikWalut = new JLabel("Przelicznik walut");
		lblPrzelicznikWalut.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblKwotaWPln = new JLabel("Kwota w PLN:");
		lblKwotaWPln.setFont(LABEL_FONT);
		
		txtKwotapln = new JTextField();
		txtKwotapln.setColumns(10);
		txtKwotapln.setFont(TEXT_FONT);
		
		JLabel lblKwotaWWalucie = new JLabel("Kwota w walucie");
		lblKwotaWWalucie.setFont(LABEL_FONT);

		txtKwotawaluta = new JTextField();
		txtKwotawaluta.setColumns(10);
		txtKwotawaluta.setFont(TEXT_FONT);
		
		JLabel lblWaluta = new JLabel("Waluta:");
		lblWaluta.setFont(LABEL_FONT);

		comboBox = new JComboBox<>();
		comboBox.setModel(new DefaultComboBoxModel<>(tabela.dajTabeleKodow()));
		comboBox.setFont(TEXT_FONT);
		
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblPrzelicznikWalut, GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(lblKwotaWPln, GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
								.addComponent(lblKwotaWWalucie, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lblWaluta, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addGap(10)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(txtKwotawaluta, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
								.addComponent(txtKwotapln, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
								.addComponent(comboBox, Alignment.TRAILING, 0, 261, Short.MAX_VALUE))))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblPrzelicznikWalut)
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblKwotaWPln)
							.addGap(24)
							.addComponent(lblKwotaWWalucie)
							.addGap(18)
							.addComponent(lblWaluta))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(txtKwotapln, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(txtKwotawaluta, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(230, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
		
		// zdarzenia:
		
		txtKwotapln.getDocument().addDocumentListener(new DocumentListener() {
			public void removeUpdate(DocumentEvent e) {
				przeliczPlnNaWalute();
			}
			
			public void insertUpdate(DocumentEvent e) {
				przeliczPlnNaWalute();
			}
			
			public void changedUpdate(DocumentEvent e) {
				przeliczPlnNaWalute();
			}
		});
		
		txtKwotawaluta.getDocument().addDocumentListener(new DocumentListener() {
			public void removeUpdate(DocumentEvent e) {
				przeliczWaluteNaPln();
			}
			
			public void insertUpdate(DocumentEvent e) {
				przeliczWaluteNaPln();
			}
			
			public void changedUpdate(DocumentEvent e) {
				przeliczWaluteNaPln();
			}
		});
		
		comboBox.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if(ostatnio == Kierunek.PLN_NA_WALUTE)
					przeliczPlnNaWalute();
				if(ostatnio == Kierunek.WALUTA_NA_PLN)
					przeliczWaluteNaPln();
			}
		});
		
	}

	private void przeliczWaluteNaPln() {
		if(! zajety)
		try {
			zajety = true;
			BigDecimal kwota = new BigDecimal(txtKwotawaluta.getText());
			String kodWaluty = (String)comboBox.getSelectedItem();
			BigDecimal wynik = tabela.przeliczWaluteNaPln(kodWaluty, kwota);
			txtKwotapln.setText(wynik.toString());
			ostatnio = Kierunek.WALUTA_NA_PLN;
		} catch (Exception e) {
			System.err.println(e);
			txtKwotapln.setText("--");
			ostatnio = null;
		} finally {
			zajety = false;
		}
	}

	private void przeliczPlnNaWalute() {
		if(! zajety)
		try {
			zajety = true;
			BigDecimal kwota = new BigDecimal(txtKwotapln.getText());
			String kodWaluty = (String)comboBox.getSelectedItem();
			BigDecimal wynik = tabela.przeliczPlnNaWalute(kodWaluty, kwota);
			txtKwotawaluta.setText(wynik.toString());
			ostatnio = Kierunek.PLN_NA_WALUTE;
		} catch (Exception e) {
			System.err.println(e);
			txtKwotawaluta.setText("--");
			ostatnio = null;
		} finally {
			zajety = false;
		}
	}
	
	private static enum Kierunek {
		PLN_NA_WALUTE, WALUTA_NA_PLN;
	}
}
