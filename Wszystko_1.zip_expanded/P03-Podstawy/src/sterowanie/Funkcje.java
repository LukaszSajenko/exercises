package sterowanie;

public class Funkcje {
	
	// W Javie używa się nazwy "metoda", ale generalnie o takie konstrukcji w programowaniu mówi się "funkcja"
	// Funkcja dostaje jakieś parametry i zwraca jakiś wynik
	
	static int dodaj(int x, int y) {
		return x+y;
	}

	static double kosztPodrozy(double spalanie, double cena, int km) {
		return spalanie * cena * km / 100.0;
	}
	
	public static void main(String[] args) {
		int wynik;
		
		wynik = dodaj(2,2);
		System.out.println(wynik);

		wynik = dodaj(10,13);
		System.out.println(wynik);
		
		double koszt = kosztPodrozy(6.5, 4.70, 200);
		System.out.println(koszt);
		
		koszt = kosztPodrozy(8, 4.50, 150);
		System.out.println(koszt);
		
		System.out.println("A gdyby jechałuy 3 osoby to wyszłoby " + koszt / 3 + " na łebka.");
	}
}
