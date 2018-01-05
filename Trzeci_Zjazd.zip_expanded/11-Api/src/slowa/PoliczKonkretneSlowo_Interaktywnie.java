package slowa;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import com.sun.org.apache.bcel.internal.generic.CPInstruction;

public class PoliczKonkretneSlowo_Interaktywnie {

	public static void main(String[] args) {
		JFileChooser fileChooser = new JFileChooser("."); // "." informacja o szukaniu na początku w folderze gdzie jest klasa
		File plik;
		
		int coSieStalo = fileChooser.showOpenDialog(null); // Tu można dac referencję do okna
		if(coSieStalo == JFileChooser.APPROVE_OPTION) {
			// Tzn. że użytkownik wybrał plik i kliknął "ok"; pobieramy ten plik
			plik = fileChooser.getSelectedFile();
		} else {
			// jeśli plik nie został wybrany
			return;
		}
		
		String szukaneSlowo = JOptionPane.showInputDialog("Podaj szukane słowo");
		if(szukaneSlowo == null) {
			return;
		}

		try (Scanner sc = new Scanner(plik)) {
			sc.useDelimiter("[^\\p{L}]+");

			System.out.println("Otworzyłem plik");
			
			int ileWszystkich = 0, ileSzukanych = 0;
			
				
			

			while (sc.hasNext()) {
				String slowo = sc.next();
				if(slowo.equals(szukaneSlowo)) {
					ileSzukanych++;
				}
				// System.out.println("kolejne słowo: [" + slowo + "]");
				ileWszystkich++;
			}
			
			String napis = String.format("Szukane słowo %s wystepowało %d razy.\n" + "Wszystkich słów: %d.", szukaneSlowo, ileSzukanych, ileWszystkich);
			JOptionPane.showMessageDialog(null, napis);
			
			// System.out.println("W tekście jest: " + ileWszystkich + "
			// słów.");
			// System.out.println("Słowo występuje " + ileSzukanych + " razy.");
			

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		
	}
}
