
public class Cechy extends Ogloszenie {
	private String miejscowosc;
	private int metraz;
	private int liczbaPokoi;

	public Cechy(String t, String o, int c, String miejscowosc, int metraz, int liczbaPokoi) {
		super(t, o, c);
		this.miejscowosc = miejscowosc;
		this.metraz = metraz;
		this.liczbaPokoi = liczbaPokoi;

	}
	
	public String toString() {
		return super.toString() + " Ma " + liczbaPokoi + " i " + miejscowosc + " m^2." + " Znajduje siê w miejscowoœci " + miejscowosc + ".";
	}

	public String getMiejscowosc() {
		return miejscowosc;
	}

	public void setMiejscowosc(String miejscowosc) {
		this.miejscowosc = miejscowosc;
	}

	public int getMetraz() {
		return metraz;
	}

	public void setMetraz(int metraz) {
		this.metraz = metraz;
	}

	public int getLiczbaPokoi() {
		return liczbaPokoi;
	}

	public void setLiczbaPokoi(int liczbaPokoi) {
		this.liczbaPokoi = liczbaPokoi;
	}

}
