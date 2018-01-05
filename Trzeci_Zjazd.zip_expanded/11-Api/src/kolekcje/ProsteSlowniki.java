package kolekcje;

import java.util.HashMap;
import java.util.Map;

public class ProsteSlowniki {

	public static void main(String[] args) {
		Map<String, Integer> cennik = new HashMap<>(); // TreeMap od razu
														// sortuje, HashMap nie
														// robi tego

		cennik.put("mleko", 3);
		cennik.put("rower", 1200);
		cennik.put("fiat", 15000);
		cennik.put("BMW", 55000);

		System.out.println(cennik);

		// Wygodnie i szybko mo¿na pobraæ element z podanego klucza:

		Integer cena = cennik.get("mleko");
		System.out.println("Cena mleka, to: " + cena);

		cena = cennik.get("fiat");
		System.out.println("Cena fiata, to: " + cena);

		cena = cennik.get("BMW");
		System.out.println("Cena BMW, to: " + cena);

		// Sprawdza czy jest artyku³ kosztuj¹cy 1200, zwraca true albo false.
		System.out.println(cennik.containsValue(1200));

		// Sprawdza czy jest towar o takiej nazwie "komputer", zwraca true albo
		// false
		System.out.println(cennik.containsKey("komputer"));

		cennik.put("Kawa", 20); // Dodanie nowego wpisu
		cennik.put("BMW", 29000); // Dodanie nowego wpisu
		System.out.println(cennik); // Aktualizacja poprzedniego wpisu, zmienia
									// siê. Nie mog¹ byæ dwa wpisy o tym samym
									// kluczu

		// pêtle foreach - rózne wersje
		System.out.println("\nWszystkie klucze:");
		for (String klucz : cennik.keySet()) {
			System.out.println("*" + klucz);

		}
		System.out.println("\nWszystkie klucze:");
		for (Integer x : cennik.values()) {
			System.out.println("-" + x);
		}
		
		System.out.println("\nWszystkie wpisy:");
		for(Map.Entry<String, Integer> entry : cennik.entrySet()) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
			
		}
	}

}

// http://zeroturnaround.com/rebellabs/java-tools-and-technologies-landscape-2016
