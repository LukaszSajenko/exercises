package petle;

import java.util.Scanner;

public class SumujLiczby {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Podaj dużo liczb całkowitych.");
		System.out.println("Na końcu podaj coś co nie jest liczbą.");
		
		int suma = 0;
		
		while(sc.hasNextInt()) {
			suma += sc.nextInt();
		}
		
		System.out.println("Suma wynosi: " + suma);
	}

}
