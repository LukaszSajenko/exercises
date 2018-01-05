package grafika;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.Timer;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Pileczka {

	private JFrame frame;
	private PanelRysujacy panel;
	private JButton buttonPrawo;
	private Wspolrzedne wspolrzedne = new Wspolrzedne();
	
	private boolean czyMaSpadac = false;
	

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
		Timer timer = new Timer(200, new ActionListener() {
			
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
		frame.setBounds(100, 100, 1005, 720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new PanelRysujacy(wspolrzedne);
		panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent ev) {
				wspolrzedne.setX(ev.getX() - 25);
				wspolrzedne.setY(ev.getY() - 25);
				panel.repaint();
			}
		});
		
		JButton buttonLewo = new JButton("←");
		buttonLewo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				wspolrzedne.wLewo();
				panel.repaint();
			}
		});
		buttonLewo.setFont(new Font("Arial", Font.BOLD, 32));
		buttonPrawo = new JButton("→");
		buttonPrawo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				wspolrzedne.wPrawo();
				panel.repaint();
			}
		});
		buttonPrawo.setFont(new Font("Arial", Font.BOLD, 32));
		
		JToggleButton tglbtnSpadanie = new JToggleButton("Spadanie");
		tglbtnSpadanie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				czyMaSpadac = tglbtnSpadanie.isSelected();
			}
		});
		tglbtnSpadanie.setFont(new Font("Dialog", Font.BOLD, 24));

		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, 973, Short.MAX_VALUE)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(buttonLewo)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(buttonPrawo)
							.addGap(18)
							.addComponent(tglbtnSpadanie, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(tglbtnSpadanie, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(buttonLewo, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(buttonPrawo, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 598, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
