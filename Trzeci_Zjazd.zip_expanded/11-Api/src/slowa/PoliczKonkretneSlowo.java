package slowa;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PoliczKonkretneSlowo {

	public static void main(String[] args) {
		
		File plik = new File("ogniem-i-mieczem-tom-pierwszy.txt");
		String szukaneSlowo = "Zagłoba";

		try (Scanner sc = new Scanner(plik)) {
			sc.useDelimiter("[^\\p{L}]+");

			System.out.println("Otworzyłem plik");
			
			int ileWszystkich = 0, ileSzukanych = 0;
			
				
			

			while (sc.hasNext()) {
				String slowo = sc.next();
				if(slowo.equals(szukaneSlowo)) {
					ileSzukanych++;
				}
				// System.out.println("kolejne słowo: [" + slowo + "]");
				ileWszystkich++;
			}
			System.out.println("W tekście jest: " + ileWszystkich + " słów.");
			System.out.println("Słowo 'Zagłoba' występuje " + ileSzukanych + " razy.");
			

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		
	}
}
