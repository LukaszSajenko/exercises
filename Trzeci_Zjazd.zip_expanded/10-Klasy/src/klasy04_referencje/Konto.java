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
		return "Kontro nr " + numer + ", saldo: " + saldo + " (w�. " + wlasciciel +")";
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
	
	// Mo�na te� inaczej przelew ale wtedy 2x prosi o konto z kt�rego przelewa sie pieni�dze
//	public void przelew(Konto zrodlo, Konto cel, int Kwota) {	
//		zrodlo.saldo -= kwota;
//		cel. saldo += kwota;
//	}

}
