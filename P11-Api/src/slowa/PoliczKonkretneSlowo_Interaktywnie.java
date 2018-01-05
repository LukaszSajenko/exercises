package slowa;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class PoliczKonkretneSlowo_Interaktywnie {

	public static void main(String[] args) {
		File plik;
		JFileChooser fileChooser = new JFileChooser(".");
		
		fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
		//fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		
		// To usuwa z "filtrów" wpis "wszystkie pliki":
//		fileChooser.removeChoosableFileFilter(
//				fileChooser.getChoosableFileFilters()[0]);
		
		fileChooser.addChoosableFileFilter(
				new FileNameExtensionFilter("Plik tekstowy", "txt"));
		
		int coSieStalo = fileChooser.showOpenDialog(null);  // tu można dać referencję do okna
		if(coSieStalo == JFileChooser.APPROVE_OPTION) {
			// tzn. użytkownik wybrał plik i kliknął OK; pobieramy ten plik
			plik = fileChooser.getSelectedFile();
		} else {
			// jeśli plik nie został wybrany - przerywam program
			return;
		}
		
		
		String szukaneSlowo = JOptionPane.showInputDialog("Podaj szukane słowo");
		if(szukaneSlowo == null) {
			return;  // przerywa metodę main, czyli program
		}
		
		try(Scanner sc = new Scanner(plik)) {
			sc.useDelimiter("[^\\p{L}]+");
			
			int ileWszystkich=0, ileSzukanych=0;
			
			while(sc.hasNext()) {
				String slowo = sc.next();
				ileWszystkich++;
				
				if(slowo.equals(szukaneSlowo)) {
					ileSzukanych++;
				}
			}
			
			String napis = String.format("Słowo '%s' występowało %d razy.\n"
					+ "Wszystkich słów: %d.",
					szukaneSlowo, ileSzukanych, ileWszystkich);
			
			JOptionPane.showMessageDialog(null, napis);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
