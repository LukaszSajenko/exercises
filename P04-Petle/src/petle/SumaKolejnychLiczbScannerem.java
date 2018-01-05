package petle;

import java.util.Scanner;

public class SumaKolejnychLiczbScannerem {
	
	public static int sumaKolejnychLiczb(int n) {
		int suma = 0;
		
		for(int i = 1; i <= n; i++) {
			suma += i;
		}
		
		return suma;
	}

	public static void main(String[] args) {
		int wynik;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj liczbę:");
		int n = sc.nextInt();
		wynik = sumaKolejnychLiczb(n);
		System.out.println("Wynik dla Twojej liczby wynosi " + wynik);

	}
}
