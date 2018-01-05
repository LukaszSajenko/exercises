package slowa;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WypiszSlowa2 {

	public static void main(String[] args) {
		File plik = new File("ala.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(plik);

			sc.useDelimiter("[ ,;.\n\r]+");

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
