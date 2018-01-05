package skoki.baza;

import java.util.List;

import skoki.model.Zawodnik;

public class TestyBazy {

	public static void main(String[] args) {
		try(DostepDoBazy db = new DostepDoBazy()) {

			System.out.println("Pytam o wszystkich...");
			List<Zawodnik> zawodnicy = db.wszyscyZawodnicy();
			for (Zawodnik zawodnik : zawodnicy) {
				System.out.println(zawodnik);
			}			
			System.out.println();
			
			System.out.println("Pytam o Polaków...");
			zawodnicy = db.zawodnicyZKraju("POL");
			for (Zawodnik zawodnik : zawodnicy) {
				System.out.println(zawodnik);
			}			
			System.out.println();

			System.out.println("Pytam o Niemców...");
			zawodnicy = db.zawodnicyZKraju("GER");
			for (Zawodnik zawodnik : zawodnicy) {
				System.out.println(zawodnik);
			}			
			System.out.println();

			
		} catch (BladBazyDanych e) {
			e.printStackTrace();
		}
	}

}
