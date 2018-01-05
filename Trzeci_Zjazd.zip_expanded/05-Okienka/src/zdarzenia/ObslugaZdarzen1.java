package zdarzenia;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ObslugaZdarzen1 {

    public static void main(String[] args) {
   	 JFrame okno = new JFrame("Pierwsze okno");
   	 okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	 okno.getContentPane().setBackground(new Color(0xFFFFCC));
   	 
   	 FlowLayout layout = new FlowLayout();
   	 layout.setHgap(50);
   	 layout.setHgap(50);
   	 okno.setLayout(layout);
   	 
   	 JButton guzik1 = new JButton("Klinkij mnie");
   	 guzik1.setFont(new Font("Verdana", Font.BOLD, 30));
   	 okno.add(guzik1);
   	 
   	 MojListener1 listener = new MojListener1();
   	 guzik1.addActionListener(listener);
   	 
   	 okno.addWindowListener(new MojWindowListener());

   	 okno.pack();
   	 okno.setVisible(true);

    }

}
