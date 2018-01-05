package Zadania;

import java.util.Arrays;

public class Petle1 {
	
	public static void main(String[] args) {
		int[] a = {4, 7, 26, 29, 56, 12};
		int[] b = {87, 10, 23, 54, 2, 54};
		int[] c = {21, 43, 25, 32};
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(c));
		
		int wynik;
		wynik = suma(a);
		System.out.println(wynik/2);
		
		wynik = suma(b);
		System.out.println(wynik/2);
		
		wynik = suma(c);
		System.out.println(wynik/2);
	
		
		
		
	}
	
		public static int suma(int[] t) {
		   	 int suma = 0;
		    	for(int i = 0; i < t.length; i++) {
		    		suma += t[i];
		}
		return suma;
	}

}
