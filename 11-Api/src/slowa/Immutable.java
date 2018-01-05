package slowa;

public class Immutable {

	
	
	static void metoda(String s) {
		s += " ma psa";
		System.out.println("W metodzie s: " + s);
	}
	
	
	
	public static void main(String[] args) {
		String a = "Ala";
		String b = a;
		
		a += " ma kota";
		
		System.out.println(a);
		System.out.println(b);
		
		
		int x = 200;
		int y = x;
		
		x += 13;
		
		System.out.println(x);
		System.out.println(y);

		metoda(a); // Ala ma kota ma psa
		System.out.println("Przed metodą b: " + b);
		metoda(b);
		System.out.println("po metodzie b: " + b);
	}

}
