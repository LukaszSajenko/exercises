package Zadania;

import java.util.Arrays;

public class Petle6 {

	public static void main(String[] args) {
		int[] a = { 4, 7, 26, 29, 56, 12 };
		int[] b = { 87, 28, 10, 23, 54, 2, 54 };
		int[] c = { 21, 43, 25, 32, 28 };
		int[] d = {};
		
		wiekszeNiz(a, 8);
		wiekszeNiz(b, 2);
		wiekszeNiz(c, 5);
		wiekszeNiz(d, 5);

		
		

	}

	public static int wiekszeNiz(int[] t, int x) {
		int wieksze = x;
		for (int i : t) {
			if (i > x) {
				System.out.println(i);
				break;
			

			}

		}
		return wieksze;

	}
}
