package towary_sklep;

import java.time.LocalDate;

public class Wypisywanie {

	public static void main(String[] args) {
		
		Towary samochodzik = new Towary("Samochodzik", "je¿dz¹ce", 20, LocalDate.of(1999, 7, 22));
		System.out.println(samochodzik.toString());
		
		Towary laleczka = new Towary("Barbie", "lalka", 250, LocalDate.of(2015, 06, 12));
		System.out.println(laleczka.toString());
		

	}

}
