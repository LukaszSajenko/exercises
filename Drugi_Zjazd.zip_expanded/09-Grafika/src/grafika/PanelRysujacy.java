package grafika;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class PanelRysujacy extends JPanel {
	private Wspolrzedne wspolrzedne;

	public PanelRysujacy(Wspolrzedne wspolrzedne) {
		super();
		this.wspolrzedne = wspolrzedne;
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
	
		
		g.setColor(Color.RED);
		g.fillOval(wspolrzedne.getX(),wspolrzedne.getY(), 50, 50);
		
		
	}
}
