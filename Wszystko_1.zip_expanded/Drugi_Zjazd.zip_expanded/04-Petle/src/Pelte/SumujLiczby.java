package Pelte;

import java.util.Scanner;

public class SumujLiczby {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Podaj du�o liczb ca�kowitych.");
		System.out.println("Na ko�cu podaj co� co nie jest liczb�");
		
//		sc.hasNextInt()
//		sc.nextInt()
		//dwie metody
		
		int suma = 0; //trzeba zawsze da� start, zainicjowa�
		
		while(sc.hasNextInt()) {
			suma += sc.nextInt();
		}
		System.out.println("Suma wynosi: " + suma);
	}

}
