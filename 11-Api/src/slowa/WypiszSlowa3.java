package slowa;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WypiszSlowa3 {

	public static void main(String[] args) {
		File plik = new File("ogniem-i-mieczem-tom-pierwszy.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(plik);

			//sc.useDelimiter("[\\s,;:!()]+");
			// sc.useDelimiter("[ ,;.\n\r]+");
			//sc.useDelimiter("\\W+"); // To traktuje polskie znaki jako separatory i rozdziela słowa :o
			sc.useDelimiter("[^\\p{L}]+"); //To jest najlepsze podejście, dzieli na słowa i zachowuje w nich polskie znaki "ł, ó, ź" itd :o 
			System.out.println("Otworzyłem plik");

			while (sc.hasNext()) {
				String slowo = sc.next();
				System.out.println("Kolejne słowo: " + slowo);
			}
			System.out.println("KONIEC");

			// To jest nie poprawne, bo w przypadku wyjątku pominiemy to "close"
			// sc.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if(sc != null)
			sc.close();
		}

	}

}
