package kolekcje;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ProsteSlowniki {

	public static void main(String[] args) {
		Map<String, Integer> cennik = new HashMap<>();
		
		cennik.put("mleko", 3);
		cennik.put("telefon", 900);
		cennik.put("Fiat", 15000);
		cennik.put("BMW", 55000);
		
		System.out.println(cennik);
		
		// Wygodnie i szybko można pobrać element z podanego klucza:
		// get działa szybko
		
		Integer cena = cennik.get("telefon");
		System.out.println("cena telefonu " + cena);
		
		cena = cennik.get("BMW");
		System.out.println("cena BMW: " + cena);
		
		cena = cennik.get("Cola");
		System.out.println("cena nieistniejąca: " + cena);

		cena = cennik.get("bmw");
		System.out.println("cena bmw: " + cena);
		
		// To działa szybko:
		System.out.println(cennik.containsKey("Fiat"));
		System.out.println(cennik.containsKey("komputer"));
		
		// To działa wolno, wymaga przejrzenia wszystkich wpisów w słowniku:
		System.out.println(cennik.containsValue(55000));
		System.out.println(cennik.containsValue(25000));
		
		cennik.put("kawa", 20);  // dodaje nowy wpis
		cennik.put("BMW", 29000); // aktualizacja wpisu o tym kluczu, jeśli już był
		System.out.println(cennik);
		System.out.println(cennik.size());
		
		cennik.remove("BMW");
		System.out.println(cennik);
		
		
		// pętle for-each - różne wersje
		
		System.out.println("\nWszystkie klucze:");
		for(String klucz : cennik.keySet()) {
			System.out.println("* " + klucz);
		}
		
		System.out.println("\nWszystkie wartości:");
		for(Integer x : cennik.values()) {
			System.out.println("- " + x);
		}
		
		System.out.println("\nWszystkie wpisy:");
		for(Map.Entry<String, Integer> entry : cennik.entrySet()) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}
		
		// W PHP chyba tak:
		// foreach($cennik as $klucz => $wartosc) { ... }
		
	}

}
