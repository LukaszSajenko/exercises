package tablice;

import java.util.Arrays;

public class Tablice2 {

	public static void main(String[] args) {
		// Można tworzyć tablice obiektów
		
		String[] imiona = new String[5];
		imiona[0] = "Ala";
		imiona[1] = "Ola";
		imiona[2] = "Ela";
		imiona[3] = "Ula";
		
		System.out.println(Arrays.toString(imiona));
		
		// Tablicę można od razu wypełnić wartościami:
		String[] miasta = {"Gdańsk", "Sopot", "Gdynia"};
		System.out.println(Arrays.toString(miasta));
		
		for(String miasto : miasta) {
			System.out.println(" * " + miasto);
		}
		
		int[] t = {10, 20, 30, 11, 12, 13, 15, 99};
		System.out.println(Arrays.toString(t));
		for(int i = 0; i < t.length; i++) {
			t[i]++;
		}
		System.out.println(Arrays.toString(t));

	}

}
