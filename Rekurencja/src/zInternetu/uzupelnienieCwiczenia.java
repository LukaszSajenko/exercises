package zInternetu;

public class uzupelnienieCwiczenia extends cwiczenieDziedziczenie {
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	private String model;
	
	public uzupelnienieCwiczenia(String n, int c, String model) {
		super(n, c);
		this.model = model;
		
	}
	
	public String toString() {
		return super.toString() + " i jest to model " + model;
	}
	
}

