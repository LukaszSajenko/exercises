package Zadania;

import java.util.Arrays;

public class Petle5 {

	public static void main(String[] args) {
		int[] a = { 4, 7, 26, 29, 56, 12 };
		int[] b = { 87, 28, 10, 23, 54, 2, 54 };
		int[] c = { 21, 43, 25, 32, 28 };
		int[] d = {};

		// System.out.println(wiekszeNiz(a, 4));
		// System.out.println(wiekszeNiz(b, 23));
		// System.out.println(wiekszeNiz(c, 26));
		// System.out.println(wiekszeNiz(d, 0));
		wiekszeNiz(a, 26);
		wiekszeNiz(b, 23);
		wiekszeNiz(c, 26);
		wiekszeNiz(d, 0);
		
		

	}

	public static int wiekszeNiz(int[] t, int x) {
		int wieksze = x;
		for (int i : t) {
			if (i > x) {
				System.out.println(i);

			}

		}
		return wieksze;

	}
}
