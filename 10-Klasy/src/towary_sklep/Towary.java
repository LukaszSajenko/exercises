package towary_sklep;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Towary {
	private String nazwa, kategoria;
	private int cena;
	private LocalDate dataProdukcji;

	public Towary(String n, String k, int c, LocalDate d) {
		nazwa = n;
		kategoria = k;
		cena = c;
		dataProdukcji = d;
	}
	
	public Towary() {
		
	}

	public String toString() {

		return nazwa + " z kategorii " + kategoria + " kosztuje " + cena + " z³" + " i wyprodukowano dnia "
				+ dataProdukcji;
	}

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public String getKategoria() {
		return kategoria;
	}

	public void setKategoria(String kategoria) {
		this.kategoria = kategoria;
	}

	public int getCena() {
		return cena;
	}

	public void setCena(int cena) {
		this.cena = cena;
	}

	public int kiedyWyprodukowano() {
		return dataProdukcji.getYear();
	}

}
