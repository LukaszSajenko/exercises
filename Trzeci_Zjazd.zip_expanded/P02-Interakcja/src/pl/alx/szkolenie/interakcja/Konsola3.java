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
		
		if(wiek >= 18) {
			int ileDoEmerytury = 65 - wiek;
			System.out.println("Możesz robić dorosłe rzeczy, a do emerytury jeszcze " + ileDoEmerytury + " lat.");
		} else {
			int ileDo18 = 18 - wiek;
			System.out.println("Hej dzieciaku, do dorosłości jeszcze " + ileDo18 + " lat.");
			
		}
	}
}
