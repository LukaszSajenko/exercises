package kolekcje;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PorownanieSzybkosciList {
	
	public static void testujListe(List<Integer> lista) {
		long start, koniec;
		int suma;
		
		System.out.print("Wstawianie 125 tys. na koniec listy (add)... ");
		start = System.currentTimeMillis();
		for(int i=0; i<125000; i++) {
			lista.add(i);
		}
		koniec = System.currentTimeMillis();
		System.out.println(koniec - start);
		
		lista.clear(); // usuwa całą zawartość
		
		System.out.print("Wstawianie 500 tys. na koniec listy (add)... ");
		start = System.currentTimeMillis();
		for(int i=0; i<500000; i++) {
			lista.add(i);
		}
		koniec = System.currentTimeMillis();
		System.out.println(koniec - start);
		
		System.out.println("\nDodawanie na początek... ");
		start = System.currentTimeMillis();
		for(int i=0; i < 10000; i++) {
			lista.add(0, 333);
		}
		koniec = System.currentTimeMillis();
		System.out.println(koniec - start);
		
		System.out.println("\nWybieranie po indeksie... ");
		start = System.currentTimeMillis();
		suma = 0;
		for(int i=0; i < 500000; i+=100) {
			suma += lista.get(i);
		}
		koniec = System.currentTimeMillis();
		System.out.println(koniec - start);
		System.out.println("suma="+suma);
		
		System.out.println("\nOdczytanie wszystkich elementów foreach");
		start = System.currentTimeMillis();
		suma = 0;
		for(int x : lista) {
			suma += x;
		}
		koniec = System.currentTimeMillis();
		System.out.println(koniec - start);
		System.out.println("suma="+suma);
	}
	

	public static void main(String[] args) {
		List<Integer> linked = new LinkedList<>();
		List<Integer> tablicowa = new ArrayList<>();		
		
		System.out.println("LinkedList:");
		testujListe(linked);

		System.out.println("\n\n");
		System.out.println("ArrayList:");
		testujListe(tablicowa);
	}
}
