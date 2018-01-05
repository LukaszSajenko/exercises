package Podstawy;

import java.lang.StringBuilder;

public class lancuchy {

	public static void main(String[] args) {
		String e = "";
		String greeting = "Czeœæ!";
		System.out.println(e);
		System.out.println("Tu jest pusty 'String'");
		System.out.println(greeting);
		// Poni¿ej przyk³ad wypisywania konkretnych znaków od - do z okreœlonego Stringa
		String s = greeting.substring(0, 4);
		System.out.println(s);
		greeting = greeting.substring(0, 3) + "kaj";
		System.out.println(greeting);
		// Przyk³ady prostych ³añcuchów

		// £¹czenie (KONKATENACJA) ³añcuchów
		String expletive = "Brzydkie s³owo";
		String PG13 = "usuniêto";
		String message = expletive + PG13;
		System.out.println(message);
		
		String all = String.join(" / ", "M", "S", "D", "X");
		System.out.println(all);
		
		// Porównywanie
		"Czeœæ!".equalsIgnoreCase("czeœæ!");
		System.out.println("Czeœæ!".equalsIgnoreCase("czeœæ!")); //prawda
		System.out.println("Czeœæ".equalsIgnoreCase("Czeœæ!")); //fa³sz
		
		String greeting1 = "Czeœæ!";
		int n = greeting1.length(); // Liczenie ile jest znaków w ³añcuchu (iloœæ jednostek kodowych, z których sk³ada siê podany ³añcuch w systemie UTF-16)
		System.out.println(n);
		int cpCount = greeting1.codePointCount(0, greeting.length()); // Liczba wspó³rzêdnych kodowych znaków (rzeczywista d³ugoœæ)
		System.out.println(cpCount);
		char first = greeting1.charAt(0); // Wypisanie pierwszej litery s³owa, znak na miejscu 0
		char last = greeting1.charAt(5); // Wypisanie ostatniego znaku ³añcucha, znak na miejscu 5
		System.out.println(first + "  " + last);
		int index = greeting1.offsetByCodePoints(2, 3); // Nie wiem co to jest!!!
		int cp = greeting1.codePointAt(index);
		System.out.println(index);
		System.out.println(cp);
		int cPA = greeting1.codePointAt(0);
		System.out.println(cPA);
		System.out.println();
		// Sk³adanie ³añcuchów metod¹ builder
		StringBuilder builder = new StringBuilder();
		builder.append("¥");
		builder.append(" jest to litera 'a' z ogonkiem, druga litera pe³nego alfabetu.");
		builder.append(greeting1 + "hej");
		String completedString = builder.toString();
		System.out.println(completedString);
		
	}

}
