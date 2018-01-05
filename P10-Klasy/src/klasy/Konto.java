package klasy;

public class Konto {
	private int numer;
	private Osoba wlasciciel;
	private int saldo;
	
	public Konto() {
	}

	public Konto(int numer, Osoba wlasciciel, int saldo) {
		this.numer = numer;
		this.wlasciciel = wlasciciel;
		this.saldo = saldo;
	}
	
	public void wplata(int kwota) {
		// saldo = noweSaldo;
		
		saldo += kwota;
	}
	
	public void wyplata(int kwota) {
		saldo -= kwota;
	}
	
	public static void przelew(Konto zrodlo, Konto cel, int kwota) {
		zrodlo.saldo -= kwota;
		cel.saldo += kwota;
	}
	
	public void przelew(Konto cel, int kwota) {
		this.saldo -= kwota;
		cel.saldo += kwota;
	}
	
	public String toString() {
		return "Konto nr " + numer + ", saldo: "
				+ saldo + " (wł. " + wlasciciel + ")";	
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
