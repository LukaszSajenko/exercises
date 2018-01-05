package Podstawy;

import java.math.BigInteger;
import java.util.Scanner;

public class wielkieLiczby {

	public static void main(String[] args) {
		
		BigInteger a = BigInteger.valueOf(100);
		BigInteger b = BigInteger.valueOf(12);
		BigInteger c = a.add(b); // c = a + b
		BigInteger d = c.multiply(b.add(BigInteger.valueOf(2))); // d = c * (b + 2)
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = a + b");
		System.out.println("c = " + c);
		
		// Zadanie loteria
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Ile liczb ma byæ wylosowanych?");
		int k = in.nextInt();
		
		System.out.println("Jaka jest górna granica przedzia³u losowanych liczb?");
		int n = in.nextInt();
		
		BigInteger lotteryOdds = BigInteger.valueOf(1);
		for (int i = 1; i <= k; i++)
			lotteryOdds = lotteryOdds.multiply(BigInteger.valueOf(n - 1 + 1)).divide(BigInteger.valueOf(i));
		
		System.out.println("Twoje szane, to 1 do " + lotteryOdds + ". Powodzenia!");

	}

}
