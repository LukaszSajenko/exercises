package pl.alx.szkolenie.interakcja;

import java.util.Scanner;

public class Mnozenie1 {

	public static void main(String[] args) {
		System.out.println("Podaj dwie liczby:");
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		System.out.println("Wynik: " + x * y);

	}

}
