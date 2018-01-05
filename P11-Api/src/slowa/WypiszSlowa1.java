package slowa;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WypiszSlowa1 {

	public static void main(String[] args) {
		File plik = new File("ala.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(plik);
			System.out.println("Otworzyłem plik");
			
			while(sc.hasNext()) {
				String slowo = sc.next();
				System.out.println(slowo);
			}
			System.out.println("KONIEC");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if(sc != null)
				sc.close();
			
			// To jest tradycyjne podjeście do poprawnego zamykania plików
			// stosowane w Javie do wersji 6
		}
	}
}
