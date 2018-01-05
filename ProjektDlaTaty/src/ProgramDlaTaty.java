import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.BoxLayout;
import javax.swing.JTextPane;
import java.awt.FlowLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.TextField;

import javax.swing.LayoutStyle.ComponentPlacement;

import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class ProgramDlaTaty {

	private JFrame frame;
	private JTextField txtLp;
	private JTextField txtData_1;
	private JTextField txtKto;
	private JTextField txtGodz;
	private JLabel lblZgoszenie_1;
	private JLabel lblPrzerwaWGodz;
	private JTextField txtOdDo;
	private JTextField txtMin;
	private JTextField txtRodzajPrzerwy;
	private JTextField txtLiniabryg;
	private JTextField txtNrPojazdu;
	private JTextField txtNrObsugi;
	private JTextField txtNrInstr;
	private JTextField txtZRamieniaPozycji;
	private JTextField txtWina;
	private JTextField txtMiejsceZdarzenia;
	private JTextField txtPowiadomiono;
	private JLabel lblLp;
	private JLabel lblData;
	private JLabel lblKto;
	private JLabel lblGodz;
	private JLabel lblOdDo;
	private JLabel lblMin;
	private JLabel lblRodzajPrzerwy;
	private JLabel lblLiniabryg;
	private JLabel lblNrPojazdu;
	private JLabel lblNrObsugi;
	private JLabel lblNrInstr;
	private JLabel lblZRamieniaPolicji;
	private JLabel lblWina;
	private JLabel lblMiejsceZdarzenia;
	private JLabel lblPowiadomiono;
	private JMenuBar menuBar;
	private JMenu mnZapisz;
	private JMenu mnPlik;
	private JMenuItem mntmZapisz;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProgramDlaTaty window = new ProgramDlaTaty();
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
	public ProgramDlaTaty() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 856, 516);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel lblGait = new JLabel("GAiT");
		lblGait.setFont(new Font("Times New Roman", Font.PLAIN, 40));

		txtLp = new JTextField();
		txtLp.setHorizontalAlignment(SwingConstants.CENTER);
		txtLp.setColumns(10);

		txtData_1 = new JTextField();
		txtData_1.setHorizontalAlignment(SwingConstants.CENTER);
		txtData_1.setColumns(10);

		JLabel lblWprowadzanieZgoszenia = new JLabel("Wprowadzanie zg\u0142oszenia");
		lblWprowadzanieZgoszenia.setFont(new Font("Times New Roman", Font.PLAIN, 30));

		JLabel lblZgoszenie = new JLabel("Zg\u0142oszenie");

		txtKto = new JTextField();
		txtKto.setHorizontalAlignment(SwingConstants.CENTER);
		txtKto.setColumns(10);

		txtGodz = new JTextField();
		txtGodz.setHorizontalAlignment(SwingConstants.CENTER);
		txtGodz.setColumns(10);

		JButton btnWypisz = new JButton("Wypisz");
		btnWypisz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				wypisz();
			}
		});

		lblZgoszenie_1 = new JLabel("Zg\u0142oszenie");

		lblPrzerwaWGodz = new JLabel("Przerwa w godz.");

		txtOdDo = new JTextField();
		txtOdDo.setHorizontalAlignment(SwingConstants.CENTER);
		txtOdDo.setColumns(10);

		txtMin = new JTextField();
		txtMin.setHorizontalAlignment(SwingConstants.CENTER);
		txtMin.setColumns(10);

		txtRodzajPrzerwy = new JTextField();
		txtRodzajPrzerwy.setHorizontalAlignment(SwingConstants.CENTER);
		txtRodzajPrzerwy.setColumns(10);

		txtLiniabryg = new JTextField();
		txtLiniabryg.setHorizontalAlignment(SwingConstants.CENTER);
		txtLiniabryg.setColumns(10);

		txtNrPojazdu = new JTextField();
		txtNrPojazdu.setHorizontalAlignment(SwingConstants.CENTER);
		txtNrPojazdu.setColumns(10);

		txtNrObsugi = new JTextField();
		txtNrObsugi.setHorizontalAlignment(SwingConstants.CENTER);
		txtNrObsugi.setColumns(10);

		txtNrInstr = new JTextField();
		txtNrInstr.setHorizontalAlignment(SwingConstants.CENTER);
		txtNrInstr.setColumns(10);

		txtZRamieniaPozycji = new JTextField();
		txtZRamieniaPozycji.setHorizontalAlignment(SwingConstants.CENTER);
		txtZRamieniaPozycji.setColumns(10);

		txtWina = new JTextField();
		txtWina.setHorizontalAlignment(SwingConstants.CENTER);
		txtWina.setColumns(10);

		txtMiejsceZdarzenia = new JTextField();
		txtMiejsceZdarzenia.setHorizontalAlignment(SwingConstants.CENTER);
		txtMiejsceZdarzenia.setColumns(10);

		txtPowiadomiono = new JTextField();
		txtPowiadomiono.setHorizontalAlignment(SwingConstants.CENTER);
		txtPowiadomiono.setColumns(10);

		lblLp = new JLabel("L.p.");

		lblData = new JLabel("Data");

		lblKto = new JLabel("Kto");

		lblGodz = new JLabel("Godz.");

		lblOdDo = new JLabel("od - do");

		lblMin = new JLabel("min");

		lblRodzajPrzerwy = new JLabel("Rodzaj przerwy");

		lblLiniabryg = new JLabel("Linia/Bryg");

		lblNrPojazdu = new JLabel("Nr. pojazdu");

		lblNrObsugi = new JLabel("Nr. obs\u0142ugi");

		lblNrInstr = new JLabel("Nr. instr.");

		lblZRamieniaPolicji = new JLabel("Z ramienia policji");

		lblWina = new JLabel("Wina");

		lblMiejsceZdarzenia = new JLabel("Miejsce zdarzenia");

		lblPowiadomiono = new JLabel("Powiadomiono");
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup().addContainerGap()
										.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(lblZgoszenie_1).addComponent(btnWypisz)
												.addGroup(groupLayout.createSequentialGroup()
														.addComponent(txtLiniabryg, GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(txtNrPojazdu, GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(txtNrObsugi, GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(txtNrInstr, GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(txtZRamieniaPozycji, GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(txtWina, GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
												.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
														.addGroup(groupLayout.createSequentialGroup()
																.addComponent(lblGait, GroupLayout.PREFERRED_SIZE, 99,
																		GroupLayout.PREFERRED_SIZE)
																.addGap(150)
																.addGroup(groupLayout
																		.createParallelGroup(Alignment.LEADING)
																		.addGroup(groupLayout.createSequentialGroup()
																				.addComponent(lblZgoszenie).addGap(131)
																				.addComponent(lblPrzerwaWGodz))
																		.addComponent(lblWprowadzanieZgoszenia)))
														.addGroup(groupLayout
																.createSequentialGroup().addGroup(groupLayout
																		.createParallelGroup(Alignment.TRAILING)
																		.addComponent(lblLp, GroupLayout.PREFERRED_SIZE,
																				36, GroupLayout.PREFERRED_SIZE)
																		.addComponent(txtLp, Alignment.LEADING,
																				GroupLayout.PREFERRED_SIZE, 47,
																				GroupLayout.PREFERRED_SIZE))
																.addGroup(groupLayout
																		.createParallelGroup(Alignment.LEADING)
																		.addGroup(groupLayout.createSequentialGroup()
																				.addGap(56)
																				.addComponent(lblData,
																						GroupLayout.PREFERRED_SIZE, 43,
																						GroupLayout.PREFERRED_SIZE)
																				.addGap(82).addComponent(lblKto).addGap(
																						78)
																				.addComponent(lblGodz).addGap(62)
																				.addComponent(lblOdDo).addGap(68)
																				.addComponent(lblMin).addGap(56)
																				.addComponent(lblRodzajPrzerwy))
																		.addGroup(groupLayout.createSequentialGroup()
																				.addPreferredGap(
																						ComponentPlacement.RELATED)
																				.addComponent(txtData_1,
																						GroupLayout.PREFERRED_SIZE, 122,
																						GroupLayout.PREFERRED_SIZE)
																				.addPreferredGap(
																						ComponentPlacement.RELATED)
																				.addComponent(txtKto,
																						GroupLayout.PREFERRED_SIZE, 105,
																						GroupLayout.PREFERRED_SIZE)
																				.addPreferredGap(
																						ComponentPlacement.UNRELATED)
																				.addComponent(txtGodz,
																						GroupLayout.PREFERRED_SIZE, 82,
																						GroupLayout.PREFERRED_SIZE)
																				.addPreferredGap(
																						ComponentPlacement.UNRELATED)
																				.addGroup(groupLayout
																						.createParallelGroup(
																								Alignment.LEADING)
																						.addComponent(txtOdDo,
																								GroupLayout.PREFERRED_SIZE,
																								93,
																								GroupLayout.PREFERRED_SIZE)
																						.addComponent(lblNrInstr))
																				.addPreferredGap(
																						ComponentPlacement.RELATED)
																				.addGroup(groupLayout
																						.createParallelGroup(
																								Alignment.LEADING)
																						.addGroup(groupLayout
																								.createSequentialGroup()
																								.addComponent(txtMin,
																										GroupLayout.PREFERRED_SIZE,
																										87,
																										GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										ComponentPlacement.UNRELATED)
																								.addComponent(
																										txtRodzajPrzerwy,
																										GroupLayout.PREFERRED_SIZE,
																										GroupLayout.DEFAULT_SIZE,
																										GroupLayout.PREFERRED_SIZE))
																						.addGroup(groupLayout
																								.createSequentialGroup()
																								.addGap(10)
																								.addComponent(
																										lblZRamieniaPolicji)
																								.addGap(54)
																								.addComponent(
																										lblWina)))))))))
								.addGroup(groupLayout.createSequentialGroup().addGap(40).addComponent(lblLiniabryg)
										.addGap(58).addComponent(lblNrPojazdu).addGap(65).addComponent(lblNrObsugi))
								.addGroup(groupLayout.createSequentialGroup().addContainerGap()
										.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addGroup(groupLayout.createSequentialGroup()
														.addComponent(txtMiejsceZdarzenia, GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(txtPowiadomiono, GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
												.addGroup(groupLayout.createSequentialGroup().addGap(10)
														.addComponent(lblMiejsceZdarzenia).addGap(18)
														.addComponent(lblPowiadomiono)))))
						.addContainerGap(95, Short.MAX_VALUE)));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
				.createSequentialGroup().addContainerGap()
				.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblGait, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblWprowadzanieZgoszenia))
				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
								.addPreferredGap(ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
								.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(lblZgoszenie)
										.addComponent(lblPrzerwaWGodz))
								.addGap(18))
						.addGroup(groupLayout.createSequentialGroup().addGap(36)
								.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(lblLp)
										.addComponent(lblData).addComponent(lblKto).addComponent(lblGodz)
										.addComponent(lblOdDo).addComponent(lblMin).addComponent(lblRodzajPrzerwy))
								.addPreferredGap(ComponentPlacement.RELATED)))
				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtData_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(txtKto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(txtGodz, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(txtOdDo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(txtMin, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(txtRodzajPrzerwy, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
						.addComponent(txtLp, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
								.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblZRamieniaPolicji).addComponent(lblWina))
								.addPreferredGap(ComponentPlacement.RELATED))
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup().addComponent(lblNrInstr)
										.addPreferredGap(ComponentPlacement.RELATED))
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup().addComponent(lblNrObsugi)
												.addPreferredGap(ComponentPlacement.RELATED))
										.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addGroup(groupLayout.createSequentialGroup()
														.addComponent(lblLiniabryg, GroupLayout.DEFAULT_SIZE, 17,
																Short.MAX_VALUE)
														.addGap(3))
												.addGroup(groupLayout.createSequentialGroup().addComponent(lblNrPojazdu)
														.addPreferredGap(ComponentPlacement.RELATED))))))
				.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtLiniabryg, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(txtNrPojazdu, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(txtNrObsugi, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(txtNrInstr, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(txtZRamieniaPozycji, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(txtWina, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE))
				.addGap(30)
				.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(lblMiejsceZdarzenia)
						.addComponent(lblPowiadomiono))
				.addGap(3)
				.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtMiejsceZdarzenia, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(txtPowiadomiono, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE))
				.addGap(38).addComponent(btnWypisz).addPreferredGap(ComponentPlacement.UNRELATED)
				.addComponent(lblZgoszenie_1).addGap(128)));
		frame.getContentPane().setLayout(groupLayout);

		menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);

		mnPlik = new JMenu("Plik");
		menuBar.add(mnPlik);

		mntmZapisz = new JMenuItem("Zapisz");
		mntmZapisz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				zapisDoPliku();
			}
		});
		mnPlik.add(mntmZapisz);

	}

	private void wypisz() {
		String zgloszenie = txtLp.getText() + " " + txtData_1.getText() + " " + txtKto.getText() + " "
				+ txtGodz.getText() + " " + txtOdDo.getText() + " " + txtMin.getText() + " "
				+ txtRodzajPrzerwy.getText() + " " + txtLiniabryg.getText() + " " + txtNrPojazdu.getText() + " "
				+ txtNrObsugi.getText() + " " + txtNrInstr.getText() + " " + txtZRamieniaPozycji.getText() + " "
				+ txtWina.getText() + " " + txtMiejsceZdarzenia.getText() + " " + txtPowiadomiono.getText();
		lblZgoszenie_1.setText(zgloszenie);
	}

	private void zapisDoPliku() {
		try {
			PrintWriter pw = new PrintWriter("Zg³oszenie.xls");
			Scanner skaner = new Scanner(lblZgoszenie_1.getText());
			while (skaner.hasNext()) {
				pw.printf(skaner.nextLine() + "\n");
				pw.close();

			}
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

		// try(Writer wyjscie = new PrintWriter("Zg³oszenie", "utf-8")) {
		// CSVPrinter csvPrinter = null;
		// try {
		// csvPrinter = CSVFormat.DEFAULT
		// .withDelimiter(';')
		// .withHeader("Cena", "Rocznik", "Przebieg", "Silnik", "Opis", "Adres")
		// .print(wyjscie);
		//
		// for(Ogloszenie ogloszenie : ogloszenia) {
		// csvPrinter.printRecord(
		// ogloszenie.getCena(),
		// ogloszenie.getRocznik(),
		// ogloszenie.getPrzebieg(),
		// ogloszenie.getSilnik(),
		// ogloszenie.getTytul(),
		// ogloszenie.getUrl());
		// }
		// } finally {
		// if(csvPrinter != null)
		// csvPrinter.close();
		// }
		//
		// } catch (IOException e) {
		// e.printStackTrace();
		// }
	}
}
