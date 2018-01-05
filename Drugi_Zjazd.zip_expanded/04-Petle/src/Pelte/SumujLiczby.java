package Pelte;

import java.util.Scanner;

public class SumujLiczby {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Podaj du¿o liczb ca³kowitych.");
		System.out.println("Na koñcu podaj coœ co nie jest liczb¹");
		
//		sc.hasNextInt()
//		sc.nextInt()
		//dwie metody
		
		int suma = 0; //trzeba zawsze daæ start, zainicjowaæ
		
		while(sc.hasNextInt()) {
			suma += sc.nextInt();
		}
		System.out.println("Suma wynosi: " + suma);
	}

}
