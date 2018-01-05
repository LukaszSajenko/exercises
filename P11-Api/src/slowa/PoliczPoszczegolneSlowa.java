package slowa;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class PoliczPoszczegolneSlowa {

	public static void main(String[] args) {
		File plik = new File("ogniem-i-mieczem-tom-pierwszy.txt");
		
		Map<String, Integer> mapa = new TreeMap<>();
		
		try(Scanner sc = new Scanner(plik)) {
			sc.useDelimiter("[^\\p{L}]+");
			
			while(sc.hasNext()) {
				String slowo = sc.next();
				
				if(mapa.containsKey(slowo)) {
					Integer ileBylo = mapa.get(slowo);
					mapa.put(slowo, ileBylo+1);
				} else {
					mapa.put(slowo, 1);
				}
				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("Zebrane słowa:");
		for(Map.Entry<String, Integer> entry : mapa.entrySet()) {
			System.out.printf("%18s -> %4d%n", entry.getKey(), entry.getValue());
		}
		
	}
}
