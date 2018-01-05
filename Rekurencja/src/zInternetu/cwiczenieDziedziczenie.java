package zInternetu;

public class cwiczenieDziedziczenie {
	private int cena;
	private String nazwa;

	public cwiczenieDziedziczenie(String n, int c) {
		nazwa = n;
		cena = c;
	}

	public cwiczenieDziedziczenie() {

	}

	public String toString() {

		return "Przedmiot " + nazwa + " kosztuje: " + cena;

	}

	public int getCena() {
		return cena;
	}

	public void setCena(int cena) {
		this.cena = cena;
	}

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

}