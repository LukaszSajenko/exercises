package pl.alx.szkolenie.interakcja;

import java.io.IOException;
import java.util.Arrays;

public class Konsola1 {

	public static void main(String[] args) {
		
		System.out.println("Jak masz na imię?");
		
		try {
			int bajt = System.in.read();
			System.out.println("Wczytany bajt to " + bajt);
			
			byte[] bufor = new byte[100];
			System.in.read(bufor);
			
			System.out.println(Arrays.toString(bufor));
			
			String napis = new String(bufor);
			
			System.out.println("Napis to " + napis);
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		

	}

}
