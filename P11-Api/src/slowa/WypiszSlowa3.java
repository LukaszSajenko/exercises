package slowa;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WypiszSlowa3 {

	public static void main(String[] args) {
		File plik = new File("ogniem-i-mieczem-tom-pierwszy.txt");
		
		try(Scanner sc = new Scanner(plik)) {
			// domyślny separator dla klasy Scanner
			//sc.useDelimiter("\\s+");
			
			// w nawiasach kwadratowych można wymienić znaki, które są separatorami
			//sc.useDelimiter("[\\s,;:.()!;]+");
			
			// "każdy znak niebędący "word" (czyli literą, cyfrą ani znakiem _)
			// ALE: polskie znaczki są trakowane jak separatory
			// sc.useDelimiter("\\W+");
			
			// To odwołuje się do "Unicode character class"
			// i oznacza "wszystko co nie jest literą"
			sc.useDelimiter("[^\\p{L}]+");
			
			System.out.println("Otworzyłem plik");
			
			while(sc.hasNext()) {
				String slowo = sc.next();
				System.out.println("kolejne słowo: [" + slowo + "]");
			}
			System.out.println("KONIEC");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
