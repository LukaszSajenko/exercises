package klasy;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ObslugaCSV {
	private static final String SEPARATOR = ";";
	
	public static void zapiszOsoby(List<Osoba> osoby, File plik) {
		try(PrintWriter writer = new PrintWriter(plik)) {
			for(Osoba osoba : osoby) {
				writer.print(osoba.getImie());
				writer.print(SEPARATOR);
				writer.print(osoba.getNazwisko());
				writer.print(SEPARATOR);
				writer.print(osoba.getDataUrodzenia());
				writer.println();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static List<Osoba> odczytajOsoby(File plik) {
		List<Osoba> osoby = new ArrayList<>();
		
		try(Scanner skanerPliku = new Scanner(plik)) {
			while(skanerPliku.hasNextLine()) {
				String linia = skanerPliku.nextLine();
				
				String[] pola = linia.split(SEPARATOR);
				if(pola.length >= 3) {
					Osoba nowa = new Osoba(pola[0], pola[1], pola[2]);
					osoby.add(nowa);
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		return osoby;
	}	
	
}
