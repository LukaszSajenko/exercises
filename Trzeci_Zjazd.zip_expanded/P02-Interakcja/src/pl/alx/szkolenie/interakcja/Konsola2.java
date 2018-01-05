package pl.alx.szkolenie.interakcja;

import java.util.Scanner;

public class Konsola2 {

	public static void main(String[] args) {
		
		System.out.println("Jak masz na imię?");
		
		Scanner skaner = new Scanner(System.in);
		
		String imie = skaner.next();
		System.out.println("Witaj " + imie);

	}
}
