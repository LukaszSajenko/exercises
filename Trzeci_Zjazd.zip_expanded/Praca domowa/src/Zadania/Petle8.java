package Zadania;

import java.util.Arrays;

public class Petle8 {

	public static void main(String[] args) {
		int[] a = { 4, 7, 26, 29, 56, 12 };
		int[] b = { 87, 28, 10, 23, 54, 2, 54 };
		int[] c = { 21, 43, 25, 32, 28 };
		int[] d = {};

		ileMiedzy(a, 7, 29);
		ileMiedzy(b, 2, 28);
		ileMiedzy(c, 28, 32);
		ileMiedzy(d, 5, 0);

	}

	public static void ileMiedzy(int[] t, int x, int y) {
		int ileMiedzy = 0;
		for (int element : t) {
			if (element >= x && element <= y) {
				ileMiedzy++;
				

			}

		}
		System.out.println(ileMiedzy);

	}
}
