package Interakcja;

import java.util.Scanner;

public class pytanieOImieNazwiskoIWiek_Konsola {

	public static void main(String[] args) {
		
		System.out.println("Witaj! Proszê Ciê o podanie kilku potrzebnych danych! :)");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Najpierw podaj swoje imiê");
		
		String imie = sc.next();
		
		System.out.println("Teraz proszê Ciê o Twoje nazwisko");
		
		String nazwisko = sc.next();
		
		System.out.println("Potrzebuje jeszcze informacji ile masz lat :)");
		
		int wiek = sc.nextInt();
		
		System.out.println("Bardzo dziêkujê! Zgodnie z danymi nazywasz siê " + imie + " " + nazwisko + " i masz " + wiek
				+ ". \nZaraz jeszcze sprawdzimy czy jesteœ pe³noletni i czy mo¿esz posiadaæ prawo jazdy. Proszê o chwilkê czasu :)");
		
		if(wiek >= 18) {
			System.out.println("Gratulacje! Jesteœ pe³noletni, masz mo¿liwoœæ zdania egzaminu na prawo jazdy"
					+ " oraz mo¿esz jeŸdziæ samochodem :)");
		} else {
			System.out.println("Wybacz! Nie jesteœ pe³noletni, niestety nie mo¿esz zdaæ egzaminu na prawo jazdy"
					+ " i nie mo¿esz jeŸdziæ samochodem. Szkoda :(");
		}
		

	}

}
