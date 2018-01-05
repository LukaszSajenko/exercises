package zInternetu;

public class Silnia2 {

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
		System.out.println(silnia(5));
		System.out.println(silniaRekurencyjna(5));
		System.out.println();
		System.out.println();
		System.out.println("Powtórka æwiczeñ z silni, z podpowiedzi¹.");
		System.out.println(silnia2(4));
		System.out.println(silniaRekurencyjna2(5));
	}

	public static int silnia2(int n) {
		int iloczyn = 1;
		for (int i = 1; i <= n; i++) {
			iloczyn = iloczyn * i;

		}

		return iloczyn;
	}

	public static int silniaRekurencyjna2(int n) {
		if (n == 0)
			return 1;
		else
			return (n * silniaRekurencyjna2(n - 1));
	}

}
