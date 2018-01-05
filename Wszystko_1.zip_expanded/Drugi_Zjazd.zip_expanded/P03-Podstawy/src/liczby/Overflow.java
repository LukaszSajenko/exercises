package liczby;

public class Overflow {

	public static void main(String[] args) {
		System.out.println(2 * 1000000000);
		System.out.println(4 * 1000000000);
		System.out.println(4L * 1000000000);

		// Typy dla liczb całkowitych
		byte b;
		short s;
		int i;
		long l;
		
		// BigInteger - liczby całkowite bez ograniczeń
		
		System.out.println();
		b = 125;
		b++;
		System.out.println(b);
		b++;
		System.out.println(b);
		b++;
		System.out.println(b);
		b++;
		System.out.println(b);
	}
}
