package daty;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatowanieDat_Standard {

	public static void main(String[] args) {
		LocalDateTime teraz = LocalDateTime.now();
		
		DateTimeFormatter[] formats = {
				DateTimeFormatter.BASIC_ISO_DATE,
				DateTimeFormatter.ISO_DATE,
				DateTimeFormatter.ISO_DATE_TIME,
				DateTimeFormatter.ISO_LOCAL_DATE_TIME,
				DateTimeFormatter.ISO_ORDINAL_DATE,
				DateTimeFormatter.ISO_WEEK_DATE,
		};
		
		for (DateTimeFormatter df : formats) {
			System.out.println(teraz.format(df));
			
		}

	}

}
