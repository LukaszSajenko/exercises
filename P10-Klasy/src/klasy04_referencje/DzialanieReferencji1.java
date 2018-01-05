package klasy04_referencje;

public class DzialanieReferencji1 {

	public static void main(String[] args) {
		Osoba ala = new Osoba("Ala", "Kowalska", "1995-03-13");
		Osoba ola = new Osoba("Ola", "Nowakowska", "1990-09-19");

		Konto a = new Konto(1, ala, 2000);
		Konto b = new Konto(2, ola, 5000);
		Konto c = b;
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);
		System.out.println();

		a.wplata(100);
		b.wplata(500);
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);
		System.out.println();

		b = a;
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);
		System.out.println();

		c.saldo = b.saldo;
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);
		System.out.println();

		b.saldo += 444;
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);
		System.out.println();

		c = a;
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);
		System.out.println();
		
		a = null;
		b = a;
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);
		System.out.println();
		
	}

}
