package Podstawy;

import java.util.Arrays;
import java.util.Scanner;

public class sortowanieTablicy {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Ile liczb musisz wylosowaæ?");
		int k = in.nextInt();
		System.out.println("Jaka jest najwiêksza liczba?");
		int n = in.nextInt();
		
		// Zape³nienie tablicy liczbami 1 2 3...n.
		int[] numbers = new int[n];
		for (int i = 0; i < numbers.length; i++)
			numbers[i] = i + 1;
		
		// Losowanie k liczb i zapisanie ich w drugiej tablicy
		int[] result = new int[k];
		for (int i = 0; i < result.length; i++) {
			// Losowanie indeksu z zakresu od 0 do n-1
			int r = (int) (Math.random() * n);
			
			//Pobranie elementu z losowej lokalizacji
			result[i] = numbers[r];
			
			// Przeniesienie ostatniego elementu do losowej lokalizacji
			numbers[r] = numbers[n - 1];
			n--;
		}
		
		// Wydruk zapisanej tablicy
		Arrays.sort(result);
		System.out.println("Postaw na nastêpuj¹ce liczby. Dziêki nim zdobêdziesz bogactwo!");
		for (int r : result)
			System.out.println(r);
		
	}

}
