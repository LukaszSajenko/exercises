package ogloszenia;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

public class ObslugaCSV {
	public static void zapiszCSV(List<Ogloszenie> ogloszenia, String plik) {
		zapiszCSV(ogloszenia, new File(plik));
	}

	public static void zapiszCSV(List<Ogloszenie> ogloszenia, File plik) {
		try(Writer wyjscie = new PrintWriter(plik, "utf-8")) {
			CSVPrinter csvPrinter = null;
			try {
				csvPrinter = CSVFormat.DEFAULT
						.withDelimiter(';')
						.withHeader("Cena", "Rocznik", "Przebieg", "Silnik", "Opis", "Adres")
						.print(wyjscie);
			
				for(Ogloszenie ogloszenie : ogloszenia) {
					csvPrinter.printRecord(
							ogloszenie.getCena(),
							ogloszenie.getRocznik(),
							ogloszenie.getPrzebieg(),
							ogloszenie.getSilnik(),
							ogloszenie.getTytul(),
							ogloszenie.getUrl());
				}
			} finally {
				if(csvPrinter != null)
					csvPrinter.close();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
}