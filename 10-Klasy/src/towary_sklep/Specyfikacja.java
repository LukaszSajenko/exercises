package towary_sklep;

import java.time.LocalDate;

public class Specyfikacja extends Towary{
	private int wysokosc;
	private String ocena;
	public Specyfikacja(String n, String k, int c, LocalDate d, int wysokosc, String ocena) {
		super(n, k, c, d);
		this.wysokosc = wysokosc;
		this.ocena = ocena;
	}
	public int getWysokosc() {
		return wysokosc;
	}
	public void setWysokosc(int wysokosc) {
		this.wysokosc = wysokosc;
	}
	public String getOcena() {
		return ocena;
	}
	public void setOcena(String ocena) {
		this.ocena = ocena;
	}
	
	public String toString() {
		return "Zabawka " + super.toString() + ", wysokoœæ " + wysokosc + " cm" + " ocena " + ocena;
	}


}
