package klasy;

import java.time.LocalDate;

public class Student extends Osoba {
	private int rokStudiow;
	private String kierunek;
	
	public Student() {
		super();
	}
	
	public Student(String i, String n, LocalDate d,
			int rokStudiow, String kierunek) {
		super(i, n, d);
		this.rokStudiow = rokStudiow;
		this.kierunek = kierunek;
	}

	public int getRokStudiow() {
		return rokStudiow;
	}

	public void setRokStudiow(int rokStudiow) {
		this.rokStudiow = rokStudiow;
	}

	public String getKierunek() {
		return kierunek;
	}

	public void setKierunek(String kierunek) {
		this.kierunek = kierunek;
	}

	@Override
	public String toString() {
		return "Student " + super.toString()
			+ ", kierunek " + kierunek + " rok " + rokStudiow;
	}
	
	
	
}
