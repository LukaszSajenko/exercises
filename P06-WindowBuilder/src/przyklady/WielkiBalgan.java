package przyklady;

import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JEditorPane;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;

public class WielkiBalgan {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField pwdHaso;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		final String styl = "Metal";
		
		LookAndFeelInfo[] plafs = UIManager.getInstalledLookAndFeels();
		System.out.println("Dostępne style:");
	    for (LookAndFeelInfo info : plafs) {
	    	String nazwaStylu = info.getName();
	    	System.out.println(nazwaStylu);
	    	if(styl.equals(nazwaStylu)) {
	    		try {
					UIManager.setLookAndFeel(info.getClassName());
				} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
						| UnsupportedLookAndFeelException e) {
					System.err.println("Nie udało się ustawić stylu " + nazwaStylu);
				}
	    	}
	    }
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WielkiBalgan window = new WielkiBalgan();
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
	public WielkiBalgan() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Okno z komponentami");
		frame.setBounds(100, 100, 931, 678);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblAlaMaKota = new JLabel("Ala ma kota");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JComboBox<String> comboBox = new JComboBox<>();
		comboBox.setModel(new DefaultComboBoxModel<>(new String[] {"pies", "kot", "chomik"}));
		
		JButton btnOk = new JButton("OK");
		
		JCheckBox chckbxOpcja = new JCheckBox("Opcja 1");
		
		JCheckBox chckbxOpcja_1 = new JCheckBox("Opcja 2");
		
		JCheckBox chckbxOpcja_2 = new JCheckBox("Opcja 3");
		
		JRadioButton rdbtnWersja = new JRadioButton("Wersja 1");
		buttonGroup.add(rdbtnWersja);
		
		JRadioButton rdbtnWersja_1 = new JRadioButton("Wersja 2");
		buttonGroup.add(rdbtnWersja_1);
		
		JRadioButton rdbtnWersja_2 = new JRadioButton("Wersja 3");
		buttonGroup.add(rdbtnWersja_2);
		
		JToggleButton tglbtnToggleButton = new JToggleButton("Toggle Button");
		
		JTextArea txtrAlaMaKota = new JTextArea();
		txtrAlaMaKota.setText("Ala ma kota\nOla ma psa");
		
		JFormattedTextField frmtdtxtfldOlaMaPsa = new JFormattedTextField();
		frmtdtxtfldOlaMaPsa.setText("Ola ma psa");
		
		pwdHaso = new JPasswordField();
		pwdHaso.setText("hasło");
		
		JEditorPane dtrpnEditorPane = new JEditorPane();
		dtrpnEditorPane.setText("Editor Pane");
		
		JSpinner spinner = new JSpinner();
		
		JProgressBar progressBar = new JProgressBar();
		
		JSlider slider = new JSlider();
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
							.addComponent(dtrpnEditorPane, GroupLayout.PREFERRED_SIZE, 167, Short.MAX_VALUE)
							.addGroup(groupLayout.createSequentialGroup()
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
									.addGroup(groupLayout.createSequentialGroup()
										.addComponent(txtrAlaMaKota, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
											.addComponent(pwdHaso)
											.addComponent(frmtdtxtfldOlaMaPsa, GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)))
									.addComponent(chckbxOpcja_2)
									.addComponent(chckbxOpcja_1)
									.addGroup(groupLayout.createSequentialGroup()
										.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
											.addComponent(comboBox, Alignment.LEADING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addComponent(lblAlaMaKota, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE))
										.addPreferredGap(ComponentPlacement.RELATED)
										.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
											.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addGroup(groupLayout.createSequentialGroup()
												.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
													.addComponent(btnOk)
													.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
														.addComponent(rdbtnWersja_1)
														.addComponent(rdbtnWersja)
														.addComponent(rdbtnWersja_2)))
												.addGap(18)
												.addComponent(tglbtnToggleButton))))
									.addComponent(chckbxOpcja))
								.addContainerGap(509, Short.MAX_VALUE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
								.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
									.addComponent(spinner, GroupLayout.PREFERRED_SIZE, 169, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(slider, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addComponent(progressBar, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 540, GroupLayout.PREFERRED_SIZE))
							.addContainerGap())))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblAlaMaKota)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnOk)
						.addComponent(tglbtnToggleButton))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(chckbxOpcja)
						.addComponent(rdbtnWersja))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(chckbxOpcja_1)
						.addComponent(rdbtnWersja_1))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(chckbxOpcja_2)
						.addComponent(rdbtnWersja_2))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtrAlaMaKota, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(frmtdtxtfldOlaMaPsa, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(9)
							.addComponent(pwdHaso, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(dtrpnEditorPane, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(spinner, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addComponent(slider, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(progressBar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(227, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
