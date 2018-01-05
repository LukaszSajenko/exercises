package klasy04_referencje;

public class DzialanieReferencji2 {

    public static void main(String[] args) {
   	 Osoba ala = new Osoba("Ala", "Kowalska", "1995-03-13");
   	 Osoba ola = new Osoba("Ola", "Nowakowska", "1990-09-19");

   	 Konto a = new Konto(1, ala, 2000);
   	 Konto b = new Konto(2, ola, 5000);
   	 Konto c = new Konto(3, ola, 8000);
   	 
   	 System.out.println("a: " + a);
   	 System.out.println("b: " + b);
   	 System.out.println("c: " + c);
   	 System.out.println();

   	 a.wlasciciel.imie = "Alicja";
   	 
   	 System.out.println("a: " + a);
   	 System.out.println("b: " + b);
   	 System.out.println("c: " + c);
   	 System.out.println();
   	 
   	 b.wlasciciel.imie = "Aleksandra";
   	 
   	 System.out.println("a: " + a);
   	 System.out.println("b: " + b);
   	 System.out.println("c: " + c);
   	 System.out.println();
   	 
   	 
   	 
    }

}



