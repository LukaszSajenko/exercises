package slowa;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.Collator;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class PoliczPoszczegolneSlowa_Posortowane {

	public static void main(String[] args) {
		System.out.println("Działamy...");

		File plik = new File("ogniem-i-mieczem-tom-pierwszy.txt");
		Map<String, Integer> mapa = new TreeMap<>(Collator.getInstance());
		
		try(Scanner sc = new Scanner(plik)) {
			sc.useDelimiter("[^\\p{L}]+");
			
			while(sc.hasNext()) {
				String slowo = sc.next();
				slowo = slowo.toLowerCase();
				
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
		
		List<Map.Entry<String, Integer>> lista =
				new ArrayList<>(mapa.entrySet());
		
		lista.sort((x,y) -> x.getValue() - y.getValue());
		
		System.out.println("Zebrane słowa:");
		for(Map.Entry<String, Integer> entry : lista) {
			System.out.printf("%18s -> %4d%n", entry.getKey(), entry.getValue());
		}
		
	}
}
