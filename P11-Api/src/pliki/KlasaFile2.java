package pliki;

import java.io.File;
import java.io.IOException;

public class KlasaFile2 {

	public static void main(String[] args) {
		try {
			File plik = new File("src/pliki/KlasaFile2.java");
			System.out.println("exists? " + plik.exists());
			System.out.println("direcotry? " + plik.isDirectory());
			System.out.println("file? " + plik.isFile());
			System.out.println("length: " + plik.length() );
			System.out.println("modified: " + plik.lastModified() );
			
			System.out.println("absolutePath " + plik.getAbsolutePath() );
			System.out.println("canonicalPath " + plik.getCanonicalPath() );
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
