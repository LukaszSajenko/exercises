package Zadania;

import java.util.Arrays;

public class Petle9 {

	public static void main(String[] args) {
		Integer[] a = { 4, 7, 26, 29, 56, 12 };
		Integer[] b = { 87, 28, 26, 23, 56, 2, 54 };
		// int[] c = { 21, 43, 25, 32, 28 };
		// int[] d = {};

		znajdzWspolny(a, b);
//		znajdzWspolny(b, a);
		// znajdzWspolny(c, 28, 32);
		// znajdzWspolny(d, 5, 0);

	}

	public static void znajdzWspolny(Integer[] a, Integer[] b) {
		Integer znajdzWspolny = 0;
		for (Integer element : a) {
			for (Integer element1 : b) {
				if (element.equals(element1)) {
//					System.out.println(Arrays.equals(a, b));
					System.out.println(element);

				}

			}
			

		}

	}

}
