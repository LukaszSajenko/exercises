package Podstawy_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class webinar18grudnia2 {

	public static void main(String[] args) {
		// klucza, warto�ci, mapa
		
		HashMap<Integer, String> d = new HashMap<Integer, String>();
		d.put(5, "five");
		d.put(6, "six");
		
		
		HashMap<String, String> dictionary = new HashMap<String, String>();
		dictionary.put("Witam", "Hello");
		dictionary.put("Mama", "Mother)");
		dictionary.put("Pies", "Dog");
		dictionary.put("Kot", "Cat");
		dictionary.put("Komputer", "Computer");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Podaj wyraz po Polsku");
		String polishWord = scanner.next();
		if (dictionary.containsKey(polishWord)) {
			System.out.println("S�owo po angielsku, to: " + dictionary.get(polishWord));
			
		} else {
			System.out.println("Nie znaleziono w s�owniku");
		}
	}
}
