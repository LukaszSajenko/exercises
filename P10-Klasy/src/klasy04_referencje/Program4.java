package klasy04_referencje;

public class Program4 {

	public static void main(String[] args) {
		Osoba ala = new Osoba("Ala", "Kowalska", "1995-03-13");
		Osoba ola = new Osoba("Ola", "Nowakowska", "1990-09-19");

		
		Konto kontoAli = new Konto(1234, ala, 2000);
		Konto kontoOli = new Konto(1313, ola, 5000);
		
		System.out.println(kontoAli);
		System.out.println(kontoOli);
		
		System.out.println("\nwpłata / wypłata");
		kontoAli.wplata(300);
		kontoOli.wyplata(100);

		System.out.println(kontoAli);
		System.out.println(kontoOli);
		
		System.out.println("\nprzelew");
		kontoAli.przelew(kontoOli, 750);
		System.out.println(kontoAli);
		System.out.println(kontoOli);

		System.out.println("\nprzelew static");
		Konto.przelew(kontoAli, kontoOli, 250);
		System.out.println(kontoAli);
		System.out.println(kontoOli);
		
	}

}
