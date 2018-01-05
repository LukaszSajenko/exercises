package daty;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.Temporal;

public class Okresy {

	public static void main(String[] args) {
		
		LocalDate d1 = LocalDate.parse("2015-05-13");
		LocalDate d2 = LocalDate.parse("2016-09-11");
		
		Period p1 = Period.between(d1, d2);
		System.out.println(p1);

		Period p2 = Period.of(3, 14, 44);  // y m d
		System.out.println("3 14 44: " + p2);
		
		LocalDate dzisiaj = LocalDate.now();
		LocalDate przyszlosc1 = dzisiaj.plus(p2);
		System.out.println("przyszlosc1: " + przyszlosc1);

		Temporal przyszlosc2 = p2.addTo(dzisiaj);
		// LocalDate przyszlosc2 = (LocalDate) p2.addTo(dzisiaj);
		System.out.println("przyszlosc2: " + przyszlosc2);
		
		Period p3 = p2.normalized();
		System.out.println("normalized: " + p3);
		
		Period p4 = Period.parse("P3M2W10D");  // tygodnie przeliczyly sie na dni  1W  =  7D
		System.out.println("parsowanie 1 " + p4);

		Period p5 = Period.ofWeeks(3);
		System.out.println(p5);
	}
}
