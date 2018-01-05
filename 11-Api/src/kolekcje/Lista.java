package kolekcje;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JOptionPane;

import com.sun.scenario.effect.AbstractShadow.ShadowMode;

public class Lista {

	public static void main(String[] args) {

		List<String> slowa = new ArrayList<>();

		while (true) {
			String s = JOptionPane.showInputDialog("Wpisz kolejne s³owa");
			if (s == null)
				break;

			slowa.add(s);

		}

		System.out.println("Nieposortowane:");
		System.out.println(slowa);

		Collections.sort(slowa);
		System.out.println("Posortowane:");
		System.out.println(slowa);
		
		Collections.shuffle(slowa);
		System.out.println("Posortowane:");
		System.out.println(slowa);

		Collections.sort(slowa, Collator.getInstance());
		System.out.println("Posortowane Collatorem:");
		System.out.println(slowa);


	}

}
