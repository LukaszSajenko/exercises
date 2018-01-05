package petle;

public class ZadaniaNaPetle3 {

	public static int sumaPodzielnychPrzez10(int[] t) {
		int suma = 0;
		for(int element : t) {
			if(element % 10 == 0) {
				suma += element;
			}
		}
		return suma;
	}

	public static int sumaPodzielnychPrzez(int dzielnik, int[] t) {
		int suma = 0;
		for(int element : t) {
			if(element % dzielnik == 0) {
				suma += element;
			}
		}
		return suma;
	}
	
	public static int ilePodzielnychPrzez(int dzielnik, int[] t) {
		int licznik = 0;
		for(int element : t) {
			if(element % dzielnik == 0) {
				licznik += 1;
			}
		}
		return licznik;
	}	

	public static void main(String[] args) {
		int[] a = { 13, 6, 13, 9, 10, 40, 2, 44, 2, 32, 31, 25, 32, 9 };
		int[] b = { 10, 30, 50, 20, 40 };
		int[] c = {};

		int wynik;

		wynik = sumaPodzielnychPrzez10(a);
		System.out.println("wynik a " + wynik);

		wynik = sumaPodzielnychPrzez10(b);
		System.out.println("wynik b " + wynik);

		wynik = sumaPodzielnychPrzez(10, a);
		System.out.println("wynik a " + wynik);

		wynik = sumaPodzielnychPrzez(10, b);
		System.out.println("wynik b " + wynik);
		
		System.out.println("liczę parzyste");
		wynik = sumaPodzielnychPrzez(2, a);
		System.out.println("wynik a " + wynik);

		wynik = sumaPodzielnychPrzez(2, b);
		System.out.println("wynik b " + wynik);

		wynik = sumaPodzielnychPrzez(2, c);
		System.out.println("wynik c " + wynik);

		System.out.println("\nparzyste ile sztuk");
		wynik = ilePodzielnychPrzez(2, a);
		System.out.println("wynik a " + wynik);

		wynik = ilePodzielnychPrzez(2, b);
		System.out.println("wynik b " + wynik);

		wynik = ilePodzielnychPrzez(2, c);
		System.out.println("wynik c " + wynik);
}

}
