package Tablice;

public class tablicaZLiczbami {

	public static void main(String[] args) {
		Integer[] a = { 10, 3, 6, 7, 12, 5 };
		Integer[] b = { 12, 51, 53, 65, 1 };

		System.out.println("Minimalna wartoœæ z tablicy");
		System.out.println(min(a));
		System.out.println(min(b));
		System.out.println("Maksymalna wartoœæ z tablicy");
		System.out.println(max(a));
		System.out.println(max(b));
		System.out.println("Wartoœci wiêksze ni¿ 'x' w tablicy");
		wiekszeNiz(a, 8);
		System.out.println();
		wiekszeNiz(b, 51);
		System.out.println("Wartoœci mniejsze ni¿ 'y' z tablicy");
		mniejszeNiz(a, 6);
		System.out.println();
		mniejszeNiz(b, 12);

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
		Integer max = null;
		for (int element : t) {
			if (max == null || element >= max) {
				max = element;
			}
		}
		return max;
	}

	public static Integer wiekszeNiz(Integer[] t, Integer x) {
		Integer wiekszeNiz = null;
		for (int element : t) {
			if (element >= x) {
				System.out.println(element);

			}
		}
		return wiekszeNiz;
	}
	
	public static Integer mniejszeNiz(Integer[] t, Integer y) {
		Integer mniejszeNiz = null;
		for (int element : t) {
			if (element <= y) {
				System.out.println(element);
			}
		}
		return mniejszeNiz;
	}

}
