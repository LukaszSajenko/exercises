package Podstawy;

public class tablice {

	public static void main(String[] args) {
		
//		int[] a;
		int[] a = new int[100];
		for (int i = 0; i < 100; i++)
			a[i] = i;
		
		System.out.println(a.length);
		
		int[] smallPrimes = {2, 3, 5, 7, 11, 13};
		int[] luckyNumbers = smallPrimes;
		luckyNumbers[5] = 12;
	
	}

}
