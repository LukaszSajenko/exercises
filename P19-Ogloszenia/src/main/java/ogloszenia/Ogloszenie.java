package ogloszenia;

public class Ogloszenie {
	private String tytul;
	private int cena;
	private int rocznik;
	private int przebieg;
	private String silnik;
	private String url;
	
	public Ogloszenie() {
	}
	
	public Ogloszenie(String tytul, int cena, int rocznik, int przebieg, String silnik, String url) {
		this.tytul = tytul;
		this.cena = cena;
		this.rocznik = rocznik;
		this.przebieg = przebieg;
		this.silnik = silnik;
		this.url = url;
	}

	public String getTytul() {
		return tytul;
	}

	public int getCena() {
		return cena;
	}

	public int getRocznik() {
		return rocznik;
	}

	public int getPrzebieg() {
		return przebieg;
	}

	public String getSilnik() {
		return silnik;
	}

	public String getUrl() {
		return url;
	}

	@Override
	public String toString() {
		return "Ogloszenie [tytul=" + tytul + ", cena=" + cena + ", rocznik=" + rocznik + ", przebieg=" + przebieg
				+ ", silnik=" + silnik + ", url=" + url + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cena;
		result = prime * result + przebieg;
		result = prime * result + rocznik;
		result = prime * result + ((silnik == null) ? 0 : silnik.hashCode());
		result = prime * result + ((tytul == null) ? 0 : tytul.hashCode());
		result = prime * result + ((url == null) ? 0 : url.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ogloszenie other = (Ogloszenie) obj;
		if (cena != other.cena)
			return false;
		if (przebieg != other.przebieg)
			return false;
		if (rocznik != other.rocznik)
			return false;
		if (silnik == null) {
			if (other.silnik != null)
				return false;
		} else if (!silnik.equals(other.silnik))
			return false;
		if (tytul == null) {
			if (other.tytul != null)
				return false;
		} else if (!tytul.equals(other.tytul))
			return false;
		if (url == null) {
			if (other.url != null)
				return false;
		} else if (!url.equals(other.url))
			return false;
		return true;
	}

}
