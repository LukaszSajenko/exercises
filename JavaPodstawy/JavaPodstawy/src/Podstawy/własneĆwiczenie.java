package Podstawy;

import java.util.Scanner;

public class w�asne�wiczenie {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Jak masz na imi�?");
		String firstName = in.next();
		System.out.println("Ile masz lat?");
		int age = in.nextInt();
		System.out.println("Witaj " + firstName + " masz " + age + " lat. To oznacza, �e mog� wycisn�� Ci pryszcze :)");
		
	}

}
