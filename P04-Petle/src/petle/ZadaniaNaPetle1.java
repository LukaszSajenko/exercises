package petle;

public class ZadaniaNaPetle1 {
	
	public static int sumaKolejnychLiczb(int n) {
		int suma = 0;
		
		for(int i = 1; i <= n; i++) {
			suma += i;
		}
		
		return suma;
	}
	
	public static int silnia(int n) {
		int wynik = 1;
		
		for(int i = 1; i <= n; i++) {
			wynik *= i;
		}
		return wynik;
	}

	public static void main(String[] args) {
		int wynik;
		
		wynik = sumaKolejnychLiczb(10);
		System.out.println("Wynik dla 10 wynosi " + wynik);

		wynik = sumaKolejnychLiczb(30);
		System.out.println("Wynik dla 30 wynosi " + wynik);
		
		wynik = silnia(3);
		System.out.println("3! = " + wynik);

		wynik = silnia(5);
		System.out.println("5! = " + wynik);

		wynik = silnia(6);
		System.out.println("6! = " + wynik);

		wynik = silnia(12);
		System.out.println("12! = " + wynik);

		wynik = silnia(13);
		System.out.println("13! = " + wynik);

		wynik = silnia(14);
		System.out.println("14! = " + wynik);
	}
}
