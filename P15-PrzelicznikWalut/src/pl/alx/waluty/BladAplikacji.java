package pl.alx.waluty;

public class BladAplikacji extends Exception {
	private static final long serialVersionUID = -1383355356355500497L;

	public BladAplikacji() {
		super();
	}

	public BladAplikacji(String message, Throwable cause) {
		super(message, cause);
	}

	public BladAplikacji(String message) {
		super(message);
	}

	public BladAplikacji(Throwable cause) {
		super(cause);
	}
}
