package Podstawy;

import java.util.Scanner;

public class metodaSwitch {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Wybierz opcjê (1, 2, 3, 4) ");
		int choice = in.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Wersja 1...");
			break;
		case 2:
			System.out.println("Wersja 2...");
			break;
		case 3:
			System.out.println("Wersja 3...");
			break;
		case 4:
			System.out.println("No i finalnie wersja 4...");
			break;
		
		}

	}

}
