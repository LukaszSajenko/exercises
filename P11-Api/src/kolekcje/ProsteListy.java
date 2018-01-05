package kolekcje;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProsteListy {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();
		
		lista.add("Gdańsk");
		lista.add("Sopot");
		lista.add("Gdynia");
		
		System.out.println(lista);
		
		for (String miasto : lista) {
			System.out.println(miasto + " ma " + miasto.length() + " liter.");
		}
		
		System.out.println("Sortowanie");
		// taki zapis od Javy 8:
		lista.sort(null);
		System.out.println(lista);
		
		// taki zapis "od dawna"
		Collections.sort(lista);
		
		// "mieszanie" elementów listy
		Collections.shuffle(lista);
		System.out.println(lista);
		Collections.sort(lista);
		System.out.println(lista);
	}
}
