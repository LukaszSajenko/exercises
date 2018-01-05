package grafika;

public class Wspolrzedne {
	private int x, y;
	private static final int SKOK = 50;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void wPrawo() {
		x += SKOK;
	}
	
	public void wLewo() {
		x -= SKOK;
	}

	public void spad() {
		y += 10;
	}

}
