package sterowanie;

import java.util.Scanner;

public class DzienTygodnia2 {
	
	public static String nazwaDniaTygodnia(int nr) { //public nie jest potrzebne
		switch(nr) {
		case 1 :
			return "poniedzia³ek"; //return koñczy metodê, nie mo¿e byæ wiêcej instrukcji			
		case 2 :
			return "wtorek";			
		case 3 :
			return "œroda";			
		case 4 :
			return "czwartek";			
		case 5 :
			return "pi¹tek";			
		case 6 :
			return "sobota";			
		case 7 :
			return "niedziela";			
		default:
			return "Numer spoza zakresu";
			
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj numer dnia tygodnia");
		int dzien = sc.nextInt();
		String nazwa = nazwaDniaTygodnia(dzien);
		
		System.out.println("Ten dzieñ to: " + nazwa);
		
		/*if(dzien == 1) {
			System.out.println("poniedzia³ek");
		} else if (dzien == 2);*/
		// Mo¿na tak, ale za d³ugo
		
		
		
		}

	}


