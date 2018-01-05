package napisy;

public class TworzenieNapisow {
	
	public static String kolejneLiczby(int n) {
		String wynik = "";
		for (int i = 1; i <= n; i++) {
			wynik += i + " ";
			
		}
		return wynik;
		
		
	}
	
	public static String kolejneLiczbySB(int n) {
		StringBuilder wynik = new StringBuilder();
		
		for (int i = 1; i <= n; i++) {
			wynik.append(i).append(' ');
			
		}
		return wynik.toString();
	
		
	}
	
	public static void main(String[] args) {
		String wynik;
		
		wynik = kolejneLiczby(5);
		System.out.println(wynik);
		
		wynik = kolejneLiczby(20);
		System.out.println(wynik);
		
		wynik = kolejneLiczby(80);
		System.out.println(wynik);
		
		wynik = kolejneLiczby(1000);
		System.out.println(wynik);
		
		long poczatek, koniec;
		int n;
		
		n = 10000;
		poczatek = System.currentTimeMillis();
		wynik = kolejneLiczby(n);
		koniec = System.currentTimeMillis();
		System.out.printf("n = %d, długość %d, czas wykonania: %d ms%n", n, wynik.length(), koniec - poczatek);
		
		n = 20000;
		poczatek = System.currentTimeMillis();
		wynik = kolejneLiczby(n);
		koniec = System.currentTimeMillis();
		System.out.printf("n = %d, długość %d, czas wykonania: %d ms%n", n, wynik.length(), koniec - poczatek);
	
		n = 40000;
		poczatek = System.currentTimeMillis();
		wynik = kolejneLiczby(n);
		koniec = System.currentTimeMillis();
		System.out.printf("n = %d, długość %d, czas wykonania: %d ms%n", n, wynik.length(), koniec - poczatek);
		
		System.out.println("\nTeraz StringBuilder");
		
		n = 10000;
		poczatek = System.currentTimeMillis();
		wynik = kolejneLiczbySB(n);
		koniec = System.currentTimeMillis();
		System.out.printf("n = %d, długość %d, czas wykonania: %d ms%n", n, wynik.length(), koniec - poczatek);
		
		n = 20000;
		poczatek = System.currentTimeMillis();
		wynik = kolejneLiczbySB(n);
		koniec = System.currentTimeMillis();
		System.out.printf("n = %d, długość %d, czas wykonania: %d ms%n", n, wynik.length(), koniec - poczatek);
	
		n = 40000;
		poczatek = System.currentTimeMillis();
		wynik = kolejneLiczbySB(n);
		koniec = System.currentTimeMillis();
		System.out.printf("n = %d, długość %d, czas wykonania: %d ms%n", n, wynik.length(), koniec - poczatek);
		
		n = 1000000;
		poczatek = System.currentTimeMillis();
		wynik = kolejneLiczbySB(n);
		koniec = System.currentTimeMillis();
		System.out.printf("n = %d, długość %d, czas wykonania: %d ms%n", n, wynik.length(), koniec - poczatek);
		
		// Parametr maszyny wirtualnej żeby przekazać więcej RAM
		// java -cp bin -Xmx8g (8g to 8GB RAM) wynik.TworzenieNapisow
		n = 1000000000;
		poczatek = System.currentTimeMillis();
		wynik = kolejneLiczbySB(n);
		koniec = System.currentTimeMillis();
		System.out.printf("n = %d, długość %d, czas wykonania: %d ms%n", n, wynik.length(), koniec - poczatek);
	}

}
