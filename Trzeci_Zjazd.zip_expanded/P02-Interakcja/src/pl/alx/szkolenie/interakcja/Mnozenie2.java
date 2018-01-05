package pl.alx.szkolenie.interakcja;

import java.util.Locale;
import java.util.Scanner;

public class Mnozenie2 {

	public static void main(String[] args) {
		System.out.println("Podaj dwie liczby:");
		Scanner sc = new Scanner(System.in);
		// sc.useLocale(Locale.US);
		
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		System.out.println("Wynik: " + x*y);
	}

}
