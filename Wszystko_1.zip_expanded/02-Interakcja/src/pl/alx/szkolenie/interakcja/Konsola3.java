package pl.alx.szkolenie.interakcja;

import java.util.Scanner;

public class Konsola3 {

	public static void main(String[] args) {
		System.out.println("Jak masz na imię?");
		
		Scanner skaner = new Scanner(System.in);
		
		String imie = skaner.next();
		System.out.println("Witaj " + imie);
		
		System.out.println("Ile masz lat?");
		
		int wiek = skaner.nextInt();
		
		if (wiek >= 18) {
			System.out.println("Możesz mieć prawo jazdy");
		} else {
			int ileBrakuje = 18 - wiek;
			System.out.println("Będziesz miał prawo jazdy za " + ileBrakuje + " lat.");
			}
		}
	}

