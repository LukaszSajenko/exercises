package daty;

import java.time.LocalTime;

public class ProstyCzas {

	public static void main(String[] args) {
		
		LocalTime czas1 = LocalTime.now();  // ustawia z dokladnoscia do milisekundy
		System.out.println(czas1);
		
		LocalTime czas2 = LocalTime.of(12, 15);
		System.out.println(czas2);
		
		LocalTime czas3 = LocalTime.of(12, 15, 33);
		System.out.println(czas3);
		
		LocalTime czas4 = LocalTime.of(12, 15, 33, 333222111);
		System.out.println(czas4);
	}

}
