package przyklady;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JComboBox;

public class WielkiBalagan {

	private JFrame frame;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) { //Ctrl + shift + o importuje wszystko
		
		
		final String styl = "Nimbus";
	   	 
	   	 LookAndFeelInfo[] plafs = UIManager.getInstalledLookAndFeels();
	   	 System.out.println("Dostêpne style:");
	    	for (LookAndFeelInfo info : plafs) {
	   		 String nazwaStylu = info.getName();
	   		 System.out.println(nazwaStylu);
	   		 if(styl.equals(nazwaStylu)) {
	   			 try {
	   				 UIManager.setLookAndFeel(info.getClassName());
	   			 } catch (ClassNotFoundException | InstantiationException | IllegalAccessException
	   					 | UnsupportedLookAndFeelException e) {
	   				 System.err.println("Nie uda³o siê ustawiæ stylu " + nazwaStylu);
	   			 }
	   		 }
	    	}

		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WielkiBalagan window = new WielkiBalagan();
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
	public WielkiBalagan() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 876, 463);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("GAT");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Stencil", Font.PLAIN, 78));
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("New radio button");
		buttonGroup.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("New radio button");
		buttonGroup.add(rdbtnNewRadioButton_1);
		
		JTextArea txtrDziedobry = new JTextArea();
		txtrDziedobry.setFont(new Font("Monospaced", Font.PLAIN, 13));
		txtrDziedobry.setText("Dzie\u0144dobry\r\nAla ma kota\r\nKurs");
		
		JSpinner spinner = new JSpinner();
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
		
		JComboBox comboBox = new JComboBox();
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(99)
							.addComponent(txtrDziedobry, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(213)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 417, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(63)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(rdbtnNewRadioButton_1)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(rdbtnNewRadioButton)
									.addGap(78)
									.addComponent(chckbxNewCheckBox)))))
					.addPreferredGap(ComponentPlacement.RELATED, 250, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addComponent(spinner, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
							.addGap(219))
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
							.addGap(190))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(rdbtnNewRadioButton)
								.addComponent(chckbxNewCheckBox))
							.addGap(18)
							.addComponent(rdbtnNewRadioButton_1)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(txtrDziedobry, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(113, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(spinner, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
							.addGap(60))))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(94)
					.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(235, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
