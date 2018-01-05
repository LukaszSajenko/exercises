package grafika;

public class Wspolrzedne {
	private int x, y;
	private final static int SKOK = 50;

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
		y -= 9;
	}
	public void wLewo() {
		x -= SKOK;
		y -= 9;
	}

	public void spad() {
		y += 5;
		
	}

}
