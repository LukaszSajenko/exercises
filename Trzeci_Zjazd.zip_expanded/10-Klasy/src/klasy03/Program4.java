package klasy03;

public class Program4 {

	public static void main(String[] args) {

		Osoba ala = new Osoba("Ala", "Kowalska", "1995-03-13");
		Osoba ola = new Osoba("Ola", "Mazurek", "1990-07-28");

		Konto kontoAli = new Konto(1234, ala, 2000);
		Konto kontoOli = new Konto(2314, ola, 5000);

		System.out.println("\nWp³ata");
		kontoAli.wplata(300);
		kontoOli.wplata(400);

		System.out.println(kontoAli);
		System.out.println(kontoOli);

		System.out.println("\nWyp³ata");
		kontoAli.wyplata(300);
		kontoOli.wyplata(200);

		System.out.println(kontoAli);
		System.out.println(kontoOli);

		System.out.println("\nPrzelew");
		kontoAli.przelew(kontoOli, 1000);
		kontoOli.przelew(kontoAli, 400);

		System.out.println(kontoAli);
		System.out.println(kontoOli);

	}

}
