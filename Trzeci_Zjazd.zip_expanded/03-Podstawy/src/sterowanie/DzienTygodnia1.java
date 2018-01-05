package sterowanie;

import java.util.Scanner;

public class DzienTygodnia1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj numer dnia tygodnia");
		int dzien = sc.nextInt();
		
		/*if(dzien == 1) {
			System.out.println("poniedzia³ek");
		} else if (dzien == 2);*/
		// Mo¿na tak, ale za d³ugo
		
		switch(dzien) {
		case 1 :
			System.out.println("poniedzia³ek");
			break;
		case 2 :
			System.out.println("wtorek");
			break;
		case 3 :
			System.out.println("œroda");
			break;
		case 4 :
			System.out.println("czwartek");
			break;
		case 5 :
			System.out.println("pi¹tek");
			break;
		case 6 :
			System.out.println("sobota");
			break;
		case 7 :
			System.out.println("niedziela");
			break;
		default:
			System.out.println("Numer spoza zakresu");
			
		}
		
		}

	}


