package zInternetu;

public class Silnia {

	public static int silnia(int n) {
		int iloczyn = 1;
		for (int i = 1; i <= n; i++) {
			iloczyn = iloczyn * i;
		}
		return iloczyn;

	}

	public static int silniaRekurencyjna(int n) {
		if (n == 0)
			return 1;
		else
			return (n * silniaRekurencyjna(n - 1));
	}

	public static void main(String[] args) {
		System.out.println(silnia(4));
		System.out.println(silniaRekurencyjna(5));
	}

}
