package sterowanie;

import java.util.Scanner;

public class DzienTygodnia2 {
	
	public static String nazwaDniaTygodnia(int nr) { //public nie jest potrzebne
		switch(nr) {
		case 1 :
			return "poniedzia�ek"; //return ko�czy metod�, nie mo�e by� wi�cej instrukcji			
		case 2 :
			return "wtorek";			
		case 3 :
			return "�roda";			
		case 4 :
			return "czwartek";			
		case 5 :
			return "pi�tek";			
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
		
		System.out.println("Ten dzie� to: " + nazwa);
		
		/*if(dzien == 1) {
			System.out.println("poniedzia�ek");
		} else if (dzien == 2);*/
		// Mo�na tak, ale za d�ugo
		
		
		
		}

	}


