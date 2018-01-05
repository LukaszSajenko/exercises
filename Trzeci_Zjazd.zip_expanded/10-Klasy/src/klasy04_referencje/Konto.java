package klasy04_referencje;

public class Konto {
	int numer;
	Osoba wlasciciel;
	int saldo;

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
	
	// Mo¿na te¿ inaczej przelew ale wtedy 2x prosi o konto z którego przelewa sie pieni¹dze
//	public void przelew(Konto zrodlo, Konto cel, int Kwota) {	
//		zrodlo.saldo -= kwota;
//		cel. saldo += kwota;
//	}

}
