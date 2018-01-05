package cwieczenia;

public class Wypisywanie {

	public static void main(String[] args) {
		
		Konsole xbox = new Konsole("Xbox", "Microsoft", 1700);
		System.out.println(xbox);
		
		System.out.println();
		
		rozszerzenie ps4 = new rozszerzenie("PlayStation 4", "Sony", 1800, 2);
		System.out.println(ps4);
		
		System.out.println();
		
		rozszerzenie xbox1 = new rozszerzenie("Xbox", "Microsoft", 1700, 1);
		System.out.println(xbox1);

	}

}
