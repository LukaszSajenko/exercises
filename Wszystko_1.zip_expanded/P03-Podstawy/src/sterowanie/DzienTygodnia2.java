package sterowanie;

import java.util.Scanner;

public class DzienTygodnia2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Podaj numer dnia tygodnia");
		int dzien = sc.nextInt();
		
		String nazwa = nazwaDniaTygodnia(dzien);
		
		System.out.println("Ten dzień to " + nazwa);
	}

	static String nazwaDniaTygodnia(int nr) {
		switch(nr) {
		case 1 : return "poniedziałek";
		case 2 : return "wtorek";
		case 3 : return "środa";
		case 4 : return "czwartek";
		case 5 : return "piątek";
		case 6 : return "sobota";
		case 7 : return "niedziela";
		default: return "numer spoza zakresu";
		}
	}
}
