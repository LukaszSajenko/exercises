package towary;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Towar {
	private String nazwa;
	private BigDecimal cenaNetto;
	private BigDecimal vat;
	
	public Towar(String nazwa, BigDecimal cenaNetto, BigDecimal vat) {
		this.nazwa = nazwa;
		this.cenaNetto = cenaNetto;
		this.vat = vat;
	}

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public BigDecimal getCenaNetto() {
		return cenaNetto;
	}

	public void setCenaNetto(BigDecimal cenaNetto) {
		this.cenaNetto = cenaNetto;
	}

	public BigDecimal getVat() {
		return vat;
	}

	public void setVat(BigDecimal vat) {
		this.vat = vat;
	}

	public BigDecimal getCenaBrutto() {
		// cenaNetto * (1 + vat)
		return cenaNetto.multiply(BigDecimal.ONE.add(vat)).setScale(2, RoundingMode.HALF_UP);
	}
}
