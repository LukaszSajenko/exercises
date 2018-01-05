package kolekcje;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PrzykladyList {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();
		// dodaje na koniec
		lista.add("ola");
		lista.add("ala");
		lista.add("ela");
		System.out.println(lista);
		System.out.println(lista.size());
		
		// odczyt z określonej pozycji, numeracja od 0 jak w tablicach
		String x = lista.get(0);
		System.out.println(x);
		x = lista.get(2);
		System.out.println(x);
		
		// dodaje na okreslona pozycje, przesuwa dotychczasowe elementy w prawo
		lista.add(1, "ewa");
		System.out.println(lista);
		
		// nadpisuje element na podanej pozycji nowym elementem
		lista.set(2, "ula");
		System.out.println(lista);

		lista.add("ala");
		lista.add(0, "ala");
		System.out.println(lista);

		String wynik = lista.remove(3);
		System.out.println("usunąłem element : " + wynik);
		System.out.println(lista);
		
		// to by usunęło od razu wszystkie wystąpienia elementu "ala"
		//lista.removeAll(Collections.singleton("ala"));
		
		// to usuwa pierwsze wystąpienie, wynik booblean mówi czy element został usunięty
		boolean b = lista.remove("ala");
		System.out.println("bool : " + b); // T
		System.out.println(lista);

		b = lista.remove("ala");
		System.out.println("bool : " + b); // T
		System.out.println(lista);

		b = lista.remove("ala");
		System.out.println("bool : " + b); // F
		System.out.println(lista);
		
		// nie trzeba tego wyniku sprawdzać
		lista.remove("ewa");
		System.out.println(lista);
		
		lista.addAll(Arrays.asList("ola", "ela", "ewa", "kasia", "marysia", "aga"));
		System.out.println(lista);
		
		Collections.sort(lista);
		System.out.println(lista);
		
		for (String s : lista) {
			System.out.println("Kolejny element: " + s);
		}
	}
}
