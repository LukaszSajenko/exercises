package napisy;

public class Immutable {
	
	static void metoda(String s) {
		s += " ma psa";
		System.out.println("  w metodzie s: "+ s);
	}

	public static void main(String[] args) {
		String a = "Ala";
		String b = a;
		a += " ma kota";
		
		System.out.println(a);
		System.out.println(b);
		
		int x = 100;
		int y = x;
		x += 13;
		
		System.out.println(x);
		System.out.println(y);
		System.out.println();
		
		System.out.println("przed metodą b: " + b);
		metoda(b);
		System.out.println(" po metodzie b: " + b);
	}

}
