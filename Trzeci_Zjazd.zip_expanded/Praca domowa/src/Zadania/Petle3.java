package Zadania;

import java.util.Arrays;

public class Petle3 {

	public static void main(String[] args) {
		Integer[] a = { 4, 7, 26, 29, 56, 12 };
		Integer[] b = { 87, 10, 23, 54, 2, 54 };
		Integer[] c = { 21, 43, 25, 32 };
		Integer[] d = {};

		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(c));

//		System.out.println(min(a));
//		System.out.println(min(b));
//		System.out.println(min(c));
//		System.out.println(min(d));
//
//		System.out.println(max(a));
//		System.out.println(max(b));
//		System.out.println(max(c));
//		System.out.println(max(d));
		
		System.out.println(max(a) - min(a));
		System.out.println(max(b));
		System.out.println(max(c));
		System.out.println(max(d));

	}

	public static Integer min(Integer[] t) {
		Integer min = null;
		for (int element : t) {
			if (min == null || element <= min) {
				min = element;

			}
		}
		return min;

	}

	public static Integer max(Integer[] t) {
		Integer max = 0;
		for (int element : t) {
			if (element >= max) {
				max = element;

			}
		}
		return max;
	}
}
