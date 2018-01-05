package Podstawy;

import java.util.Scanner;

public class cwiczenia {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Napisz proszê jak masz na imiê...");
		String name = in.next();
		System.out.println("Napisz proszê ile masz lat...");
		int age = in.nextInt();

		System.out.println("Witaj " + name + ". Teraz sprawdzimy czy mo¿esz posiadaæ prawo jazdy...");

		if (age < 18) {
			System.out.println("Jesteœ niepe³noletni/a, dlatego nie mo¿esz podejœæ do egzaminu na prawo jazdy");
		} else {
			System.out.println("Gratulacje, masz " + age
					+ " lat. To oznacza, ¿e mo¿esz zrobiæ kurs na prawo jazdy i podejœæ do egzaminu "
					+ " co pozwoli Ci na je¿d¿enie samochodem! Powodzenia! :)");
		}

	}

}
