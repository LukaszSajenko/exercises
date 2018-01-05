package cwieczenia;

public class rozszerzenie extends Konsole {
	private int pady;

	public rozszerzenie(String n, String p, int c, int pady){
		super(n, p, c);
		this.setPady(pady);
	}
	
	

	public int getPady() {
		return pady;
	}

	public void setPady(int pady) {
		this.pady = pady;
	}

	public String toString() {
		return super.toString() + ". W zestawie s¹: " + pady + " pady.";
	}
}
