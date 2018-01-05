package grafika;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.Timer;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;

public class Pileczka {

	private JFrame frame;
	private PanelRysujacy panel;
	private JButton buttonPrawo;
	
	private boolean czyMaSpadac = false;
	
	private Wspolrzedne wspolrzedne = new Wspolrzedne();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pileczka window = new Pileczka();
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
	public Pileczka() {
		initialize();
		wlaczSpadanie();
	
	}
	
	private void wlaczSpadanie() {
		Timer timer = new Timer(100, new ActionListener() {
			
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(czyMaSpadac) {
				wspolrzedne.spad();
				panel.repaint();
				}
			}
		});
		
		timer.start();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 841, 415);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new PanelRysujacy(wspolrzedne);
		
		JButton btnLewo = new JButton("Lewo");
		btnLewo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				wspolrzedne.wLewo();
				panel.repaint();
			}
		});
		
		JButton btnPrawo = new JButton("Prawo");
		btnPrawo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				wspolrzedne.wPrawo();
				panel.repaint();
			}
		});
		
		JToggleButton tglbtnSpadanie = new JToggleButton("Spadanie");
		tglbtnSpadanie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				czyMaSpadac = tglbtnSpadanie.isSelected();
			}
		});
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 803, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnLewo)
							.addGap(27)
							.addComponent(btnPrawo)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(tglbtnSpadanie)))
					.addContainerGap(16, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnLewo)
						.addComponent(btnPrawo)
						.addComponent(tglbtnSpadanie))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 327, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
