package slowa;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WypiszSlowa2 {

	public static void main(String[] args) {
		File plik = new File("ala.txt");
		
		// Taki zapis try(...) {
		// }
		// nazywa się "try with resources",
		// jest dostepny od Javy 7
		// Gwarantuje zamknięcie pliku - nie trzeba pisać close()
		try(Scanner sc = new Scanner(plik)) {
			
			sc.useDelimiter("[ ,;:.\n\r]+");
			
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
