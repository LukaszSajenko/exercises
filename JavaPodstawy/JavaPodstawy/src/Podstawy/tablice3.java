package Podstawy;

import java.util.Scanner;

public class tablice3 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Wpisz ilu zatrudniasz pracownik�w... ");
		int n = in.nextInt();
		String[] names = new String[n];
		for (int i = 1; i <= n; i++) {
			System.out.println("A teraz wpisz imi� nr. " + i);
			Scanner in1 = new Scanner(System.in);
			String name = in1.nextLine();
			names[i - 1] = name;
		}
		System.out.println("Zatrudniasz " + n + " pracownik�w. Nazywaj� si�: ");
		for (int i = 0; i < n; i++) {
			System.out.println("Pracownik " + (i + 1) + ": " + names[i]);
		}

	}

}
