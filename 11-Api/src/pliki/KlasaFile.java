package pliki;

import java.io.File;
import java.io.IOException;

public class KlasaFile {

	public static void main(String[] args) {
		try {
			File plik = new File("plik.txt");
			// File to jest "opakowana" nazwa/œcie¿ka do pliku
			// Samo utworzenie tego obiektu jesszcze nie tworzy pliku na dysku

			if (plik.exists()) {
				System.out.println("Plik istnieje");
				plik.delete();
			} else {
				System.out.println("Plik nie istnieje, tworzê taki plik");
				
				plik.createNewFile();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
