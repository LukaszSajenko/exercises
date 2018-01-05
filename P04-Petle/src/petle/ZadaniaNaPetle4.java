package petle;

public class ZadaniaNaPetle4 {

	public static int max(int[] t) {
		// int najlepszyDotad = 0;
		// int najlepszyDotad = -1000000;
		int najlepszyDotad = Integer.MIN_VALUE;
		
		for(int element : t) {
			if(element > najlepszyDotad) {
				najlepszyDotad = element;
			}
		}
		
		return najlepszyDotad;
	}

	public static Integer maxNull(int[] t) {
		Integer najlepszyDotad = null;
		
		for(int element : t) {
			if(najlepszyDotad == null || element > najlepszyDotad) {
				najlepszyDotad = element;
			}
		}
		
		return najlepszyDotad;
	}

	public static void main(String[] args) {
		int[] a = { 13, 6, 13, 9, 10, 40, 2, 44, 2, 32, 31, 25, 32, 9 };
		int[] b = { 10, 30, 50, 20, 40 };
		int[] c = {};
		int[] d = {-100, -50, -75};

		System.out.println("max(a) = " + max(a));
		System.out.println("max(b) = " + max(b));
		System.out.println("max(c) = " + max(c));
		System.out.println("max(d) = " + max(d));
		
		System.out.println("\nwersja z Integer");
		System.out.println("max(a) = " + maxNull(a));
		System.out.println("max(b) = " + maxNull(b));
		System.out.println("max(c) = " + maxNull(c));
		System.out.println("max(d) = " + maxNull(d));
	}

}
