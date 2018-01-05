package zInternetu;

public class Silnia3 {

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
		System.out.println("Silnia zapisana iteracyjnie:");
		System.out.println(silnia(4));
		System.out.println("Silnia zapisana rekurencyjnie:");
		System.out.println(silniaRekurencyjna(4));
		System.out.println("Zapis ca³kowicie bez podpowiedzi:");
		System.out.println("Zapis iteracyjny:");
		System.out.println(silnia2(4));
		System.out.println("Zapis rekurencyjny:");
		System.out.println(silniaRekurencyjna2(4));
		System.out.println();
		System.out.println(silnia3(4));
		System.out.println(silniaRekurencyjna3(4));
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

	public static int silnia3(int n) {
		int iloczyn = 1;
		for (int i = 1; i <= n; i++) {
			iloczyn = iloczyn * i;
		}
	
		return iloczyn;
	}
	
	public static int silniaRekurencyjna3 (int n) {
		if (n == 0)
			return 1;
		else
			return (n * silniaRekurencyjna3(n-1));
	}

}
