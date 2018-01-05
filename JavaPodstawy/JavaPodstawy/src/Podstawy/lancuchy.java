package Podstawy;

import java.lang.StringBuilder;

public class lancuchy {

	public static void main(String[] args) {
		String e = "";
		String greeting = "Cze��!";
		System.out.println(e);
		System.out.println("Tu jest pusty 'String'");
		System.out.println(greeting);
		// Poni�ej przyk�ad wypisywania konkretnych znak�w od - do z okre�lonego Stringa
		String s = greeting.substring(0, 4);
		System.out.println(s);
		greeting = greeting.substring(0, 3) + "kaj";
		System.out.println(greeting);
		// Przyk�ady prostych �a�cuch�w

		// ��czenie (KONKATENACJA) �a�cuch�w
		String expletive = "Brzydkie s�owo";
		String PG13 = "usuni�to";
		String message = expletive + PG13;
		System.out.println(message);
		
		String all = String.join(" / ", "M", "S", "D", "X");
		System.out.println(all);
		
		// Por�wnywanie
		"Cze��!".equalsIgnoreCase("cze��!");
		System.out.println("Cze��!".equalsIgnoreCase("cze��!")); //prawda
		System.out.println("Cze��".equalsIgnoreCase("Cze��!")); //fa�sz
		
		String greeting1 = "Cze��!";
		int n = greeting1.length(); // Liczenie ile jest znak�w w �a�cuchu (ilo�� jednostek kodowych, z kt�rych sk�ada si� podany �a�cuch w systemie UTF-16)
		System.out.println(n);
		int cpCount = greeting1.codePointCount(0, greeting.length()); // Liczba wsp�rz�dnych kodowych znak�w (rzeczywista d�ugo��)
		System.out.println(cpCount);
		char first = greeting1.charAt(0); // Wypisanie pierwszej litery s�owa, znak na miejscu 0
		char last = greeting1.charAt(5); // Wypisanie ostatniego znaku �a�cucha, znak na miejscu 5
		System.out.println(first + "  " + last);
		int index = greeting1.offsetByCodePoints(2, 3); // Nie wiem co to jest!!!
		int cp = greeting1.codePointAt(index);
		System.out.println(index);
		System.out.println(cp);
		int cPA = greeting1.codePointAt(0);
		System.out.println(cPA);
		System.out.println();
		// Sk�adanie �a�cuch�w metod� builder
		StringBuilder builder = new StringBuilder();
		builder.append("�");
		builder.append(" jest to litera 'a' z ogonkiem, druga litera pe�nego alfabetu.");
		builder.append(greeting1 + "hej");
		String completedString = builder.toString();
		System.out.println(completedString);
		
	}

}
