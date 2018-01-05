package slowa;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PoliczKonkretneSlowo {

	public static void main(String[] args) {
		File plik = new File("ogniem-i-mieczem-tom-pierwszy.txt");
		String szukaneSlowo = "Zagłoba";
		
		try(Scanner sc = new Scanner(plik)) {
			sc.useDelimiter("[^\\p{L}]+");
			
			System.out.println("Otworzyłem plik");
			
			int ileWszystkich=0, ileSzukanych=0;
			
			while(sc.hasNext()) {
				String slowo = sc.next();
				ileWszystkich++;
				
				if(slowo.equals(szukaneSlowo)) {
					ileSzukanych++;
				}

//	Tak też zadziałało:
//				if(sc.hasNext(szukaneSlowo)) {
//					ileSzukanych++;
//				}				
			}
			
			System.out.println("Liczba wszystkich słów: " + ileWszystkich);
			System.out.println("Szukane słowo " + szukaneSlowo
					+ " wystepowało razy: " + ileSzukanych);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
