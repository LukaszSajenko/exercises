package cwieczenia;

public class Konsole {
	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public String getProducent() {
		return producent;
	}

	public void setProducent(String producent) {
		this.producent = producent;
	}

	public int getCena() {
		return cena;
	}

	public void setCena(int cena) {
		this.cena = cena;
	}

	String nazwa, producent;
	int cena;
	
	public Konsole(String n, String p, int c){
		nazwa = n;
		producent = p;
		cena = c;
	}
	
	public Konsole() {
		
	}
	
	public String toString() {
		return "Konsola nazywa siê " + nazwa + " i zosta³a wyprodukowana przez firmê " + producent + ", a kosztuje: " + cena;
	}

}
