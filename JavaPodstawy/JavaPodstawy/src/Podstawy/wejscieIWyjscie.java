package Podstawy;

import java.util.Scanner;
import java.lang.StringBuilder;

public class wejscieIWyjscie {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Jak si� nazywasz?");
//		String name = in.nextLine(); // Odczytuje ca�� linijk�
		String firstName = in.next(); // Odczytuje tylko jedno s�owo
		System.out.println("Ile masz lat?");
		int age = in.nextInt(); // Odczytuje liczby ca�kowite
		
		System.out.println("Witaj u�ytkowniku " + firstName + ". W przysz�ym roku b�dziesz mie� " + (age + 1) + " lat.");
		
		System.out.println("Czy chcesz studiowa�?");
		String studies = in.next();
		
		StringBuilder answer = new StringBuilder(); //To chyba nie zadzia�a, zapyta� si� koniecznie!!!
		builder.append("Dzie� dobry");
		builder.append("Witaj u�ytkowniku " + firstName + ". W przysz�ym roku b�dziesz mie� " + (age + 1) + " lat.");
		builder.append(" Odpowiedzia�e� " + studies + (", dzi�kuj� Ci za odpowied�."));
		String completedAnswer = answer.toString();
		System.out.println(completedAnswer);
		
		
		
	}

}
