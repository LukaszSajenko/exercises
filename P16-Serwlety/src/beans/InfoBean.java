package beans;

import java.time.LocalDate;
import java.time.LocalTime;

public class InfoBean {

	public LocalTime getCurrentTime() {
		return LocalTime.now();
	}
	
	public LocalDate getCurrentDate() {
		return LocalDate.now();
	}
	
}
