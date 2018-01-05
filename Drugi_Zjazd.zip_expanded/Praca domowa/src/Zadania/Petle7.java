package Zadania;

import java.util.Arrays;

public class Petle7 {

	public static void main(String[] args) {
		int[] a = { 4, 7, 26, 29, 56, 12 };
		int[] b = { 87, 28, 10, 23, 54, 2, 54 };
		int[] c = { 21, 43, 25, 32, 28 };
		int[] d = {};

		ileWiekszych(a, 8);
		ileWiekszych(b, 2);
		ileWiekszych(c, 5);
		ileWiekszych(d, 5);

	}

	public static void ileWiekszych(int[] t, int x) {
		int ileWiekszych = 0;
		for (int i : t) {
			if (i > x) {
				ileWiekszych++;
				

			}

		}
		System.out.println(ileWiekszych);

	}
}
