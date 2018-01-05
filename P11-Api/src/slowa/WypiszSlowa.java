package slowa;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WypiszSlowa {

	public static void main(String[] args) {
		File plik = new File("ala.txt");
		try {
			Scanner sc = new Scanner(plik);
			System.out.println("Otworzyłem plik");
			
			while(sc.hasNext()) {
				String slowo = sc.next();
				System.out.println(slowo);
			}
			System.out.println("KONIEC");
			
			// to jest niepoprawne, bo w przypadku wyjątku pominiemy close()
			sc.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
