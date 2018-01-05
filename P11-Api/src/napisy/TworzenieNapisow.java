package napisy;

public class TworzenieNapisow {
	
	public static String kolejneLiczby(int n) {
		String s = "";
		
		for(int i = 1; i <= n; i++) {
			s += i + " ";
		}
		// O(n^2)
		return s;
	}
	
	public static String kolejneLiczbySB(int n) {
		StringBuilder sb = new StringBuilder();
		
		// podobna klasa, starsza: StringBuffer
		
		for(int i = 1; i <= n; i++) {
			sb.append(i).append(' ');
		}
		// O(n)
		return sb.toString();
	}
	
	
	
	public static void main(String[] args) {
		String wynik;
		
		wynik = kolejneLiczby(5);
		System.out.println(wynik);
		
		wynik = kolejneLiczby(20);
		System.out.println(wynik);

//		wynik = kolejneLiczby(1000);
//		System.out.println(wynik);
		System.out.println();
		
		long poczatek, koniec;
		int n;
		
		n = 10000;
		poczatek = System.currentTimeMillis();
		wynik = kolejneLiczby(n);
		koniec = System.currentTimeMillis();
		System.out.printf("n = %d, długość = %d, czas wykonania: %d ms%n",
				n, wynik.length(), koniec - poczatek);
		
		n = 20000;
		poczatek = System.currentTimeMillis();
		wynik = kolejneLiczby(n);
		koniec = System.currentTimeMillis();
		System.out.printf("n = %d, długość = %d, czas wykonania: %d ms%n",
				n, wynik.length(), koniec - poczatek);
		
		n = 40000;
		poczatek = System.currentTimeMillis();
		wynik = kolejneLiczby(n);
		koniec = System.currentTimeMillis();
		System.out.printf("n = %d, długość = %d, czas wykonania: %d ms%n",
				n, wynik.length(), koniec - poczatek);
		
		System.out.println("\nTeraz StringBuilder");
		n = 10000;
		poczatek = System.currentTimeMillis();
		wynik = kolejneLiczbySB(n);
		koniec = System.currentTimeMillis();
		System.out.printf("n = %d, długość = %d, czas wykonania: %d ms%n",
				n, wynik.length(), koniec - poczatek);
		
		n = 20000;
		poczatek = System.currentTimeMillis();
		wynik = kolejneLiczbySB(n);
		koniec = System.currentTimeMillis();
		System.out.printf("n = %d, długość = %d, czas wykonania: %d ms%n",
				n, wynik.length(), koniec - poczatek);
		
		n = 40000;
		poczatek = System.currentTimeMillis();
		wynik = kolejneLiczbySB(n);
		koniec = System.currentTimeMillis();
		System.out.printf("n = %d, długość = %d, czas wykonania: %d ms%n",
				n, wynik.length(), koniec - poczatek);
		
		n = 100_000;
		poczatek = System.currentTimeMillis();
		wynik = kolejneLiczbySB(n);
		koniec = System.currentTimeMillis();
		System.out.printf("n = %d, długość = %d, czas wykonania: %d ms%n",
				n, wynik.length(), koniec - poczatek);
		
		n = 1_000_000;
		poczatek = System.currentTimeMillis();
		wynik = kolejneLiczbySB(n);
		koniec = System.currentTimeMillis();
		System.out.printf("n = %d, długość = %d, czas wykonania: %d ms%n",
				n, wynik.length(), koniec - poczatek);
		
		n = 10_000_000;
		poczatek = System.currentTimeMillis();
		wynik = kolejneLiczbySB(n);
		koniec = System.currentTimeMillis();
		System.out.printf("n = %d, długość = %d, czas wykonania: %d ms%n",
				n, wynik.length(), koniec - poczatek);
		
		
		// Parametr maszyny wirtualnej -Xmx8g
		// Przykładowe uruchomienie z command-line:
		// java -cp bin -Xmx8g napisy.TworzenieNapisow
//		n = 100_000_000;
//		poczatek = System.currentTimeMillis();
//		wynik = kolejneLiczbySB(n);
//		koniec = System.currentTimeMillis();
//		System.out.printf("n = %d, długość = %d, czas wykonania: %d ms%n",
//				n, wynik.length(), koniec - poczatek);
				
	}
	

}
