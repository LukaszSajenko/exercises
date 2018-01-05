package zdarzenia;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MojWindowListener1 implements WindowListener {

	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("- otwarto okno");		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("- okno zamykane..");		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		System.out.println("- zamknięto okno.");				
	}

	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("- minimalizacja");				
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("- maksymalizacja");				
	}

	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("- aktywacja");				
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println("- deaktywacja");				
	}

}
