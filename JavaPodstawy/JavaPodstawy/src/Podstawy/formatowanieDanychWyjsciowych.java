package Podstawy;

public class formatowanieDanychWyjsciowych {

	public static void main(String[] args) {
		
		double x = 10000.0 / 3.0;
		String name = "£ukasz";
		double age = 24 + 1;
		System.out.println(x);
		System.out.printf("%8.2f", x); // 8 znaków i 2 znaki po przecinku
//		System.out.printf("Witaj, %s. W przysz³ym roku bêdziesz mieæ lat %d", name, age);
		System.out.println();
		System.out.printf("%,.2f", 10000.0 / 3.0);

	}

}
