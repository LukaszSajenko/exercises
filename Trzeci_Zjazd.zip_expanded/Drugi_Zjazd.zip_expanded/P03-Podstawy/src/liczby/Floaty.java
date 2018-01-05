package liczby;

public class Floaty {

	public static void main(String[] args) {
		float f = 1.0000003f;
		
		System.out.println(f);
		f += 1;
		System.out.println(f);
		f -= 1;
		System.out.println(f);

		f = 10000003f;
		
		System.out.printf("%8.0f\n", f);
		f += 10000000;
		System.out.printf("%8.0f\n", f);
		f -= 10000000;
		System.out.printf("%8.0f\n", f);
		
		// BigDecimal
	}
}
