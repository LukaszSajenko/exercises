package towary_sklep;

import java.time.LocalDate;

public class Wypisywanie2 {

	public static void main(String[] args) {
		
		Towary samochodzik = new Towary("Samochodzik", "je¿dz¹ce", 20, LocalDate.of(1999, 7, 22));
//		System.out.println(samochodzik.toString());
		
		Towary laleczka = new Towary("Barbie", "lalka", 250, LocalDate.of(2015, 06, 12));
//		System.out.println(laleczka.toString());
		
		Specyfikacja s = new Specyfikacja("Kurczak", "pluszak", 400, LocalDate.of(2016, 07, 12), 14, "6");
//		System.out.println(s);
		
		Specyfikacja s1 = new Specyfikacja("Telefon", "graj¹ce", 25, LocalDate.of(2012, 04, 14), 12, "4");
//		System.out.println(s1);
		
		System.out.println(samochodzik + ",\n" + laleczka + ",\n" + s + ",\n" + s1 + ".\nTo s¹ wszystkie nasze zabawki na promocjê!");
		
		

	}

}
