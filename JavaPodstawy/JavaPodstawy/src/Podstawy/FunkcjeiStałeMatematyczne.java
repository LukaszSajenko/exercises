package Podstawy;

public class FunkcjeiStałeMatematyczne {

	public static void main(String[] args) {
		
		System.out.println("Pierwastkowanie");
		double x = 4;
		double y = Math.sqrt(x);
		System.out.println(y);
		
		System.out.println();
		
		System.out.println("Podnoszenie do potęgi");
		double z = Math.pow(x, 2);
		System.out.println(z);
		
		System.out.println();
		
		System.out.println("Rzutowanie");
		double i = 9.997;
		int ni = (int) i;
		System.out.println(ni);
		System.out.println("Zaokrąglanie do liczby całkowitej");
		int ny = (int) Math.round(i);
		System.out.println(ny);
		
	}

}
