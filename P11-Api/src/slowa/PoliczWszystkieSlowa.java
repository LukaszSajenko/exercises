package slowa;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PoliczWszystkieSlowa {

	public static void main(String[] args) {
		File plik = new File("ogniem-i-mieczem-tom-pierwszy.txt");
		
		try(Scanner sc = new Scanner(plik)) {
			sc.useDelimiter("[^\\p{L}]+");
			
			System.out.println("Otworzyłem plik");
			
			int licznik = 0;
			
			while(sc.hasNext()) {
				String slowo = sc.next();
				licznik++;
			}
			
			System.out.println("Liczba wszystkich słów: " + licznik);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
