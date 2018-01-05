package petle;

public class ZadaniaNaPetle2 {
	
	public static int suma(int[] t) {
		int wynik = 0;
		for(int i = 0; i < t.length; i++) {
			wynik += t[i];
		}
		return wynik;
	}

	public static int suma2(int[] t) {
		int wynik = 0;
		
		for(int liczba : t) {
			wynik += liczba;
		}
		
		return wynik;
	}

	public static void main(String[] args) {
		int[] a = {13, 6, 13, 9, 10, 40, 2, 44, 2, 32, 31, 25, 32, 9};
		int[] b = {10, 30, 50, 20, 40};
		
		int wynik;
		wynik = suma(a);
		System.out.println("suma a = " + wynik);

		wynik = suma(b);
		System.out.println("suma b = " + wynik);

		wynik = suma2(a);
		System.out.println("suma a = " + wynik);

		wynik = suma2(b);
		System.out.println("suma b = " + wynik);

	}

}
