package klasy;

public class Konto {
	private int numer;
	private Osoba wlasciciel;
	private int saldo;

	public Konto(int numer, Osoba wlasciciel, int saldo) {
		this.numer = numer;
		this.wlasciciel = wlasciciel;
		this.saldo = saldo;
	}

	public Konto() {

	}
	
	public String toString() {
		return "Kontro nr " + numer + ", saldo: " + saldo + " (w³. " + wlasciciel +")";
	}

	public void wplata(int wplata) {
		saldo += wplata;
		
		
	}
	
	public void wyplata(int wyplata) {
		saldo -= wyplata;
	}
	
	public void przelew(Konto odbierajaca, int kwota) {
		saldo -= kwota;
		odbierajaca.saldo += kwota;
		
	}

	public int getNumer() {
		return numer;
	}

	public void setNumer(int numer) {
		this.numer = numer;
	}

	public Osoba getWlasciciel() {
		return wlasciciel;
	}

	public void setWlasciciel(Osoba wlasciciel) {
		this.wlasciciel = wlasciciel;
	}

	public int getSaldo() {
		return saldo;
	}

	
	
	
	
	
	
}
