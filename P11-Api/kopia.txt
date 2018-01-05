package pliki;

import java.io.File;
import java.io.IOException;

public class KlasaFile {

	public static void main(String[] args) {
		try {
			File plik = new File("plik.txt");
			// File to jest "opakowana" nazwa/ścieżka do pliku
			// Samo utworzenie tego obiektu jeszcze nie tworzy pliku na dysku.
			
			// Klasa File jest "stara", tzn. istnieje od początku platformy Java
			// jej używanie jest przenośne (zadziała w starych wersjach)
			
			if(plik.exists()) {
				System.out.println("Plik istnieje, usuwam");
				plik.delete();
				
			} else {
				System.out.println("Plik nie istnieje, tworzę plik");
				plik.createNewFile();	
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
