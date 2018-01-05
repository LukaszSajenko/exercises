package Podstawy;

import java.util.Scanner;
import java.lang.StringBuilder;

public class wejscieIWyjscie {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Jak siê nazywasz?");
//		String name = in.nextLine(); // Odczytuje ca³¹ linijkê
		String firstName = in.next(); // Odczytuje tylko jedno s³owo
		System.out.println("Ile masz lat?");
		int age = in.nextInt(); // Odczytuje liczby ca³kowite
		
		System.out.println("Witaj u¿ytkowniku " + firstName + ". W przysz³ym roku bêdziesz mieæ " + (age + 1) + " lat.");
		
		System.out.println("Czy chcesz studiowaæ?");
		String studies = in.next();
		
		StringBuilder answer = new StringBuilder(); //To chyba nie zadzia³a, zapytaæ siê koniecznie!!!
		builder.append("Dzieñ dobry");
		builder.append("Witaj u¿ytkowniku " + firstName + ". W przysz³ym roku bêdziesz mieæ " + (age + 1) + " lat.");
		builder.append(" Odpowiedzia³eœ " + studies + (", dziêkujê Ci za odpowiedŸ."));
		String completedAnswer = answer.toString();
		System.out.println(completedAnswer);
		
		
		
	}

}
