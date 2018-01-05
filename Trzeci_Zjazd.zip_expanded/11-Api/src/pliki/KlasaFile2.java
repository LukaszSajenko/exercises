package pliki;

import java.io.File;
import java.io.IOException;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class KlasaFile2 {

	public static void main(String[] args) {
		File plik = new File("src/pliki/KlasaFile2.java");
		System.out.println("exists? " + plik.exists());
		System.out.println("directory " + plik.isDirectory());
		System.out.println("File? " + plik.isFile());
		System.out.println("length: " + plik.length());
		System.out.println("modified " + plik.lastModified());

		System.out.println("absolutePath " + plik.getAbsolutePath());
	}

}
