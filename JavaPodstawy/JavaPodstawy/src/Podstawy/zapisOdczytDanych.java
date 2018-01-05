package Podstawy;

import java.nio.file.Paths;
import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class zapisOdczytDanych {

	public static void main(String[] args) throws IOException {
		
		Scanner in = new Scanner(Paths.get("C:\\Users\\£ukasz\\Desktop\\Aplikacje CV.docx"));
		
//		PrintWriter out = new PrintWriter("Aplikacje CV.docx");
		
//		PrintWriter out = new PrintWriter("Aplikacje CV.docx");
//		System.out.println(out);
		
		FileReader fr = new FileReader("Aplikacje CV.docx");
		Scanner plik = new Scanner(fr);
			while(plik.hasNext()) {
//				s = plik.next();
//				System.out.println(s + " ");
//			}
		System.out.println(fr);
		
		

	}
	}

}
