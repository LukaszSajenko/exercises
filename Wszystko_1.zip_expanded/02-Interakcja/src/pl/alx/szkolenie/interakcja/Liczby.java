package pl.alx.szkolenie.interakcja;

import java.util.Scanner;

public class Liczby {

	public static void main(String[] args) {
		System.out.println("Podaj dwie liczby");
		Scanner skaner = new Scanner(System.in);
		System.out.println("Podaj pierwszą liczbę");
		int a = skaner.nextInt();
		System.out.println("Podaj drugą liczbę");
		int b = skaner.nextInt();
		
		System.out.println("Wynik mnożenia, to " + a*b);

	}

}
