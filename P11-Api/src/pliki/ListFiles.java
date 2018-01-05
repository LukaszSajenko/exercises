package pliki;

import java.io.File;

public class ListFiles {

	public static void main(String[] args) {
		String start;
		if(args.length > 0)
			start = args[0];
		else start = ".";
		
		File dir = new File(start);
		listFilesRec(dir, "");
	}
	
	public static void listFilesRec(File dir, String indent) {
		if(dir.isDirectory()) {
			String nextIndent = indent + "    ";
			File[] files = dir.listFiles();
			if(files != null)
				for(File file: files) {
					System.out.print(indent);
					if(file.isFile()) {
						System.out.print("F ");
					} else	if(file.isDirectory()) {
						System.out.print("D ");
					} else {
						System.out.print("S ");
					}
					System.out.println(file.getName());
					listFilesRec(file, nextIndent);
				}
		}
	}
}
