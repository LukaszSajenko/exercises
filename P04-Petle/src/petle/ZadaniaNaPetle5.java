package petle;

public class ZadaniaNaPetle5 {

	public static Integer ostatniPodzielnyPrzez(int dzielnik, int[] t) {
		// jako przyklad niekoniecznie do nasladowania
		Integer wynik = null;
		
		for(int el : t) {
			if(el % dzielnik == 0) {
				wynik = el;
			}
		}
		
		return wynik;
	}

	public static Integer pierwszyPodzielnyPrzezBreak(int dzielnik, int[] t) {
		Integer wynik = null;
		
		for(int el : t) {
			if(el % dzielnik == 0) {
				wynik = el;
				break;
			}
		}
		
		return wynik;
	}

	public static Integer pierwszyPodzielnyPrzez(int dzielnik, int[] t) {
		for(int el : t) {
			if(el % dzielnik == 0) {
				return el;
			}
		}
		return null;
	}

	public static void main(String[] args) {
		int[] a = { 13, 6, 13, 9, 10, 40, 2, 44, 2, 35, 31, 25, 32, 9 };
		int[] b = { 10, 30, 50, 20, 40 };
		int[] c = {};
		int[] d = {-100, -50, -75};
		
		Integer wynik;
		wynik = pierwszyPodzielnyPrzez(5, a);
		System.out.println("a 5 : " + wynik);

		wynik = pierwszyPodzielnyPrzez(7, a);
		System.out.println("a 7 : " + wynik);

		wynik = pierwszyPodzielnyPrzez(5, b);
		System.out.println("b 5 : " + wynik);

		wynik = pierwszyPodzielnyPrzez(7, b);
		System.out.println("b 7 : " + wynik);

		wynik = pierwszyPodzielnyPrzez(7, c);
		System.out.println("c 7 : " + wynik);

	}

}
