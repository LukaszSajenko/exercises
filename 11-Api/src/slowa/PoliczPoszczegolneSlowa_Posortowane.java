package slowa;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class PoliczPoszczegolneSlowa_Posortowane {

	public static void main(String[] args) {

		File plik = new File("ogniem-i-mieczem-tom-pierwszy.txt");

		Map<String, Integer> mapa = new TreeMap<>();

		try (Scanner sc = new Scanner(plik)) {
			sc.useDelimiter("[^\\p{L}]+");

			System.out.println("Otworzyłem plik");

			int ileWyrazow = 0;

			while (sc.hasNext()) {
				String slowo = sc.next();
				slowo = slowo.toLowerCase();
				if (mapa.containsKey(slowo)) {
					Integer ileSlow = mapa.get(slowo);
					mapa.put(slowo, ++ileSlow);
				} else {
					mapa.put(slowo, 1);
				}

			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		List<Map.Entry<String, Integer>> lista = new ArrayList<>(mapa.entrySet()); // Posortowanie
																					// alfabetycznie

		lista.sort((x, y) -> x.getValue() - y.getValue()); // Posortowane od
															// najmniejszej
															// ilości wystąpień

		for (Map.Entry<String, Integer> entry : lista) {
			System.out.printf("%18s -> %3d", entry.getKey(), entry.getValue());
		}
	}
}
