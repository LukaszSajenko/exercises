package kolekcje;

import java.util.Arrays;
import java.util.HashSet;

public class ZmianaKolejnosciWHaszSecie {

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<>();
		
		set.addAll(Arrays.asList("Ala", "Ola", "Ula", "Ela", "Ewa", "Ania", "Kasia", "Aga", "Iwona", "Magda", "Iza"));
		
		System.out.println(set.size());
		System.out.println(set);
		
		set.add("Julia");
		System.out.println(set.size());
		System.out.println(set);

		set.add("Ewelina");
		System.out.println(set.size());
		System.out.println(set);
	}

}
