package zInternetu;

public class wypisywanie {

	public static void main(String[] args) {

		cwiczenieDziedziczenie samochod = new cwiczenieDziedziczenie("Saab", 2500);
		System.out.println(samochod);
		
		uzupelnienieCwiczenia samochod1 = new uzupelnienieCwiczenia("Saab", 2500, "9-5");
		System.out.println(samochod1);

	}

}
