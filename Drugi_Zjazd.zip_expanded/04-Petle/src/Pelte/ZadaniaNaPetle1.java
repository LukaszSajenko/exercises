package Pelte;

import java.util.Scanner;

public class ZadaniaNaPetle1 {
	
	public static int sumaKolejnychLiczb(int n) {
		
		
		int suma = 0;
		for (int i = 1; i <= n; i++) {
		 	suma = suma + i; //mo¿e to te¿ tak wygl¹daæ suma += i;
		}
		return suma;
	}

	public static int silnia(int n) {
		int suma = 1;
		for (int i = 1; i <= n; i++) {
			suma = suma * i; //Mo¿e byæ suma *= i
		}
		return suma;
		
	}
	
	
	
	public static void main(String[] args) {
		int wynik;
		 wynik = sumaKolejnychLiczb(10);
	   	 System.out.println("Wynik dla 10 wynosi " + wynik);

	   	 wynik = sumaKolejnychLiczb(30);
	   	 System.out.println("Wynik dla 30 wynosi " + wynik);


		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj liczbê");
		int n = sc.nextInt();
		wynik = sumaKolejnychLiczb(n);
		System.out.println("Wynik dla Twojej liczby wynosi " + wynik);
		
		wynik = silnia(3);
	   	 System.out.println("3! = " + wynik);

	   	 wynik = silnia(5);
	   	 System.out.println("5! = " + wynik);

	   	 wynik = silnia(6);
	   	 System.out.println("6! = " + wynik);


	}

}
