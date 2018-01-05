package slowa;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PoliczPoszczegolneSlowa_MaleLitery {

	public static void main(String[] args) {
		
		File plik = new File("ogniem-i-mieczem-tom-pierwszy.txt");

		try (Scanner sc = new Scanner(plik)) {
			sc.useDelimiter("[^\\p{L}]+");

			System.out.println("Otworzyłem plik");
			
			int ileWyrazow = 0;

			while (sc.hasNext()) {
				String slowo = sc.next();
				// System.out.println("kolejne słowo: [" + slowo + "]");
				ileWyrazow++;
			}
			System.out.println("W tekście jest: " + ileWyrazow + " słów.");
			

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		
	}
}
