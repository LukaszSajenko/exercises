package grafika;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class PanelRysujacy1 extends JPanel {
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.drawLine(100, 100, 300, 500);
		g.drawString("Ala ma kota", 100, 400);
		
		g.setColor(Color.RED);
		g.drawRect(400, 100, 200, 300);
		
	}

}
