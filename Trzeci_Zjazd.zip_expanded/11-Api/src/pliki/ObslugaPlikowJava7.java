package pliki;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class ObslugaPlikowJava7 {

    public static void main(String[] args) {
   	 Path sciezka = Paths.get("src", "pliki", "KlasaFile.java");
   	 // to te� dzia�a:
   	 // Path sciezka = Paths.get("src/pliki/KlasaFile.java");
   	 
   	 System.out.println(sciezka);
   	 System.out.println(sciezka.getFileName());
   	 System.out.println(sciezka.getParent());
   	 
   	 // operacje, kt�rych nie dalo si� robi� za pomoc� File:
   	 Path wynik = Paths.get("kopia.txt");
   	 
   	 try {
   		 Files.copy(sciezka, wynik, StandardCopyOption.REPLACE_EXISTING);
   		 System.out.println("Skopiowałem");
   		 
   	 } catch (IOException e) {
   		 e.printStackTrace();
   	 }

    }

}



