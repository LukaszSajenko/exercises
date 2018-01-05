package Pelte;

import java.util.Scanner;

public class PetlaFor {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Podaj liczbê powtórzeñ");
		
		int n = sc.nextInt();
		
		for(int i = 1; i <=n; i++) {
			System.out.println("Kolejna liczba to: " + i);
		}
	}

}
