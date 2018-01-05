package skoki.baza;

import java.util.List;

import skoki.model.Zawodnik;

public class BazaBean {
	private String kraj;
	
	public String getKraj() {
		return kraj;
	}

	public void setKraj(String kraj) {
		this.kraj = kraj;
	}
	
	public List<Zawodnik> getWszyscyZawodnicy() throws BladBazyDanych {
		try(DostepDoBazy db = new DostepDoBazy()) {
			return db.wszyscyZawodnicy();
		}
	}

	public List<Zawodnik> getZawodnicyZKraju() throws BladBazyDanych {
		try(DostepDoBazy db = new DostepDoBazy()) {
			return db.zawodnicyZKraju(kraj);
		}
	}
}
