
public class Ogloszenie {
	private String tytul, opis;
	private int cena;
	
public Ogloszenie(String t, String o, int c) {
	tytul = t;
	opis = o;
	cena = c;
}

public Ogloszenie() {
	
}

public String toString() {
	
	return "Og³oszenie " + tytul + " " + opis + " Dom kosztuje " + cena + " z³.";
}

public String getTytul() {
	return tytul;
}

public void setTytul(String tytul) {
	this.tytul = tytul;
}

public String getOpis() {
	return opis;
}

public void setOpis(String opis) {
	this.opis = opis;
}

public int getCena() {
	return cena;
}

public void setCena(int cena) {
	this.cena = cena;
}

}
