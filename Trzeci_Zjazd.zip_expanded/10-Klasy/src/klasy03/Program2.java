package klasy03;

import java.time.LocalDate;

public class Program2 {

    public static void main(String[] args) {
   	 Osoba ala = new Osoba("Ala", "Kowalska", LocalDate.of(1999, 7, 22));
   	 System.out.println(ala.imie + " " + ala.nazwisko);
   	 System.out.println( ala.wiekRocznikowo() );
   	 System.out.println( ala.wiek() );
   			 
   	 Osoba janek = new Osoba("Jan", "Kowalski", LocalDate.parse("1990-02-21"));
   	 System.out.println(janek.imie + " " + janek.nazwisko);
   	 System.out.println( janek.wiekRocznikowo() );
   	 System.out.println( janek.wiek() );
    }

}



