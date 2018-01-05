package Podstawy;

import java.util.Scanner;

public class w³asneÆwiczenie {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Jak masz na imiê?");
		String firstName = in.next();
		System.out.println("Ile masz lat?");
		int age = in.nextInt();
		System.out.println("Witaj " + firstName + " masz " + age + " lat. To oznacza, ¿e mogê wycisn¹æ Ci pryszcze :)");
		
	}

}
