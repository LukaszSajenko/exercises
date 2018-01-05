package klasy04_referencje;

public class Konto {
	int numer;
	Osoba wlasciciel;
	int saldo;
	
	public Konto() {
	}

	public Konto(int numer, Osoba wlasciciel, int saldo) {
		this.numer = numer;
		this.wlasciciel = wlasciciel;
		this.saldo = saldo;
	}
	
	void wplata(int kwota) {
		// saldo = noweSaldo;
		
		saldo += kwota;
	}
	
	void wyplata(int kwota) {
		saldo -= kwota;
	}
	
	static void przelew(Konto zrodlo, Konto cel, int kwota) {
		zrodlo.saldo -= kwota;
		cel.saldo += kwota;
	}
	
	void przelew(Konto cel, int kwota) {
		this.saldo -= kwota;
		cel.saldo += kwota;
	}
	
	
	public String toString() {
		return "Konto nr " + numer + ", saldo: "
				+ saldo + " (wł. " + wlasciciel + ")";	
	}
}
