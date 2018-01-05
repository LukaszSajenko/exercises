package Podstawy;

public class inkrementacjaDekrementacja {

	public static void main(String[] args) {
		
		int d = 12;
		d++;
		System.out.println(d);
		
		int m = 7;
		int n = 7;
		int a = 2 * ++m;
		int b = 2 * n++;
		System.out.println(a + " " + b + " " + m + " " + n);
		
		String e = "";
		String greeting = "Czeœæ!";
		System.out.println(e);
		System.out.println("Tu jest pusty 'String'");
		System.out.println(greeting);
		String s = greeting.substring(0, 4);
		System.out.println(s);

	}

}
