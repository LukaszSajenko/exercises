package Podstawy;

import java.util.Scanner;

public class cwiczenia {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Napisz prosz� jak masz na imi�...");
		String name = in.next();
		System.out.println("Napisz prosz� ile masz lat...");
		int age = in.nextInt();

		System.out.println("Witaj " + name + ". Teraz sprawdzimy czy mo�esz posiada� prawo jazdy...");

		if (age < 18) {
			System.out.println("Jeste� niepe�noletni/a, dlatego nie mo�esz podej�� do egzaminu na prawo jazdy");
		} else {
			System.out.println("Gratulacje, masz " + age
					+ " lat. To oznacza, �e mo�esz zrobi� kurs na prawo jazdy i podej�� do egzaminu "
					+ " co pozwoli Ci na je�d�enie samochodem! Powodzenia! :)");
		}

	}

}
