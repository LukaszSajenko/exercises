package kolekcje;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ProsteListy {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();

		lista.add("Gdañsk");
		lista.add("Sopot");
		lista.add("Gdynia");

		System.out.println(lista);

		for (String miasto : lista) {
			System.out.println(miasto + " ma " + miasto.length() + " liter.");
		}
		
		System.out.println("Sortowanie");
		lista.sort(null);
		System.out.println(lista);
		
		Collections.shuffle(lista);
		System.out.println(lista); // mieszanie elementów listy 
	}

}
