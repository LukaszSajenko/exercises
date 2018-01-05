package Liczby;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Overflow {

	public static void main(String[] args) {
		System.out.println(2 * 1000000000);
		System.out.println(4L * 1000000000);
		System.out.println(3 * 1000000000);
		
		//Typy dla liczb ca³kowitych
		byte b;
		short s;
		int i;
		long l;
		
		b = 123;
		b++;
		System.out.println(b);
		b++;
		System.out.println(b);
		b++;
		System.out.println(b);

	}

}
