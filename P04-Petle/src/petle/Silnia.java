package petle;

import java.math.BigInteger;

public class Silnia {

	public static int silniaInt(int n) {
		int wynik = 1;
		
		for(int i = 1; i <= n; i++) {
			wynik *= i;
		}
		return wynik;
	}

	public static long silniaLong(int n) {
		long wynik = 1;
		
		for(int i = 1; i <= n; i++) {
			wynik *= i;
		}
		return wynik;
	}

	public static BigInteger silniaBig(int n) {
		BigInteger wynik = BigInteger.ONE;
		
		for(int i = 1; i <= n; i++) {
			wynik = wynik.multiply(BigInteger.valueOf(i));
		}
		return wynik;
	}

	public static void main(String[] args) {
		System.out.println("silniaInt(12) " + silniaInt(12));
		System.out.println("silniaInt(13) " + silniaInt(13));
		System.out.println("silniaInt(14) " + silniaInt(14));
		System.out.println("silniaInt(34) " + silniaInt(34));
		System.out.println("silniaInt(1234) " + silniaInt(1234));

		System.out.println("silniaInt(12) " + silniaLong(12));
		System.out.println("silniaInt(13) " + silniaLong(13));
		System.out.println("silniaInt(14) " + silniaLong(14));
		System.out.println("silniaInt(20) " + silniaLong(20));
		System.out.println("silniaInt(21) " + silniaLong(21));

		System.out.println("silniaBig(5) " + silniaBig(5));
		System.out.println("silniaBig(21) " + silniaBig(21));
		System.out.println("silniaBig(100) " + silniaBig(100));
		System.out.println();
		System.out.println("silniaBig(1000) " + silniaBig(1000));
	}
}
