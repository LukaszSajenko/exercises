package Interakcja;

import java.util.Scanner;

public class pytanieOImieNazwiskoIWiek_Konsola {

	public static void main(String[] args) {
		
		System.out.println("Witaj! Prosz� Ci� o podanie kilku potrzebnych danych! :)");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Najpierw podaj swoje imi�");
		
		String imie = sc.next();
		
		System.out.println("Teraz prosz� Ci� o Twoje nazwisko");
		
		String nazwisko = sc.next();
		
		System.out.println("Potrzebuje jeszcze informacji ile masz lat :)");
		
		int wiek = sc.nextInt();
		
		System.out.println("Bardzo dzi�kuj�! Zgodnie z danymi nazywasz si� " + imie + " " + nazwisko + " i masz " + wiek
				+ ". \nZaraz jeszcze sprawdzimy czy jeste� pe�noletni i czy mo�esz posiada� prawo jazdy. Prosz� o chwilk� czasu :)");
		
		if(wiek >= 18) {
			System.out.println("Gratulacje! Jeste� pe�noletni, masz mo�liwo�� zdania egzaminu na prawo jazdy"
					+ " oraz mo�esz je�dzi� samochodem :)");
		} else {
			System.out.println("Wybacz! Nie jeste� pe�noletni, niestety nie mo�esz zda� egzaminu na prawo jazdy"
					+ " i nie mo�esz je�dzi� samochodem. Szkoda :(");
		}
		

	}

}
