package zdarzenia;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MojListener1 implements ActionListener {
    private int licznik = 0;

    public void actionPerformed(ActionEvent e) {
   	 licznik++;
   	 System.out.println("Naci�ni�to guzik po raz " + licznik);    
    }
}
