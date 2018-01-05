package kolekcje;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

import javax.swing.JOptionPane;

public class ZbieraczSlow {

	public static void main(String[] args) {	
		List<String> slowa = new ArrayList<>();
		
		while(true) {
			String s = JOptionPane.showInputDialog("Podaj kolejne słowo:");

			if(s == null)
				break;
			
			slowa.add(s.trim());
			
		}

		System.out.println("Nieposortowane:");
		System.out.println(slowa);
		
		Collections.sort(slowa);
		System.out.println("Posortowane domyślnie:");
		System.out.println(slowa);
		
		Collections.shuffle(slowa);
		System.out.println("Wymieszane:");
		System.out.println(slowa);

		Collections.sort(slowa, Collator.getInstance());
		System.out.println("Posortowane Collatorem:");
		System.out.println(slowa);
		
		Collections.sort(slowa, new NaszKomparator());
		System.out.println("Posortowane Komparatorem:");
		System.out.println(slowa);
		
		// od Javy 8 można tu użyć lambda expression
		Collections.sort(slowa, (x,y) -> y.length() - x.length());
		System.out.println("Posortowane wyrażeniem lambda:");
		System.out.println(slowa);		
	}
}
