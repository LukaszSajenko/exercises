package klasy04_referencje;

public class DzialanieReferencji3 {
	
	static void metoda(int x, Konto a, Konto b) {
		System.out.println("Początek metody");
		System.out.println("x: " + x);
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println();

		x += 100;
		x++;
		x = x + 10;
		
		a.wplata(200);
		a.saldo += 20;
		a.saldo++;
		
		// tak naprawdę nie zmieniam przekazanego obiektu Konto,
		// tylko tworzę nowy, a zmieniam tylko parametr b (referencję)
		b = new Konto(b.numer, b.wlasciciel, b.saldo + 500);
		
		System.out.println("Koniec metody");
		System.out.println("x: " + x); // zmieniony
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println();		
	}

	public static void main(String[] args) {
		Osoba ala = new Osoba("Ala", "Kowalska", "1995-03-13");
		Osoba ola = new Osoba("Ola", "Nowakowska", "1990-09-19");

		int x = 1000;
		Konto a = new Konto(1, ala, 2000);
		Konto b = new Konto(2, ola, 5000);
		
		System.out.println("Początek maina");
		System.out.println("x: " + x);
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println();

		metoda(x, a, b);
		
		System.out.println("Koniec maina");
		System.out.println("x: " + x); // niezmieniony
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println();
	}

}
