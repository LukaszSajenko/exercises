package tablice;

import java.util.Arrays;

public class Tablice1 {

	public static void main(String[] args) {
		
		// deklaracja że t1 jest zmienną typu "tablica intów"
		int[] t1;
		
		// utworzenie tablicy na 10 intów w pamieci
		// tablica jest początkowo wypełniona samymi zerami (albo nullami)
		t1 = new int[10];
		
		// można to zapisać w jednej linii
		int[] t2 = new int[20];
		
		// tablica znaswój rozmiar
		System.out.println(t1.length);
		System.out.println(t2.length);
		
		// na pola w tablicy (albo inaczej "komórki" tablicy) można wpisywać wartości
		t1[0] = 100;
		t1[2] = 333;
		t1[2]++;  // na komórkach można działać jak na zmiennych
		t1[3] = 300 + 21;
		
		// można odczytywać pojedyncze komórki:
		System.out.println(t1[0]);
		System.out.println(t1[1]);
		System.out.println(t1[2]);
		
		//EXN t1[10] = 4;
		
		// Wypisywanie tablic
		System.out.println(t1);  // wypisuje "krzaki"
		System.out.println(Arrays.toString(t1));
		
		// Pętle
		for(int i = 0; i < t1.length; i++) {
			System.out.println("tablica na pozycji " + i + " ma wartość " + t1[i]);
		}

		System.out.println();
		
		for(int i = 0; i < t2.length; i++) {
			t2[i] = i*i;
		}
		
		System.out.println(Arrays.toString(t2));
		
		for(int element : t2) {
			System.out.println("kolejna liczba: " + element);
		}

	}

}
