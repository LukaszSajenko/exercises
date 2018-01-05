package zdarzenia;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ObslugaZdarzen2 {

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
   	 
   	 guzik1.addActionListener(new ActionListener() {
   		 Random random = new Random();
   		 
   		 @Override
   		 public void actionPerformed(ActionEvent e) {
   			 System.out.println("ok");
   			 Color nowyKolor = new Color(random.nextInt(0x1000000));
   			 okno.getContentPane().setBackground(nowyKolor);
   			 
   			 int x = okno.getX();
   			 int y = okno.getY();
   			 x += random.nextInt(100);
   			 y =+ random.nextInt(100);
   			 okno.setLocation(x, y);
   		 }
   	 });
   	 
   	 okno.pack();
   	 okno.setVisible(true);

   	 System.out.println("Koniec maina");
    }

}
