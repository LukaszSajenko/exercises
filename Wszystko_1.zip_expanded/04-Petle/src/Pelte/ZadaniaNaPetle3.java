package Pelte;

public class ZadaniaNaPetle3 {
	
	public static int sumaPodzielnychPrzez10(int[] t){
		int suma = 0;
		for(int i = 0; i < t.length; i++) {
			
			if(t[i] % 10 == 0) {
				suma += t[i];
				
			}
			
		}
		return suma;		
	}
	
	public static int sumaPodzielnychPrzez102(int[] t) {
		int wynik = 0;
		for(int liczba : t) {
			if(liczba % 10 == 0) {
				wynik += liczba;
			}
			
		}
		return wynik;	
	}
		public static int ilePodzielnychPrzez(int dzielnik, int[] t){
			int licznik = 0;
			for(int element : t) {
				if(element % dzielnik == 0){
					licznik += 1;
				}
				
			}
			return licznik;
			
		} 
    
    
    public static void main(String[] args) {
   	 int[] a = {13, 6, 13, 9, 10, 40, 2, 44, 2, 32, 31, 25, 32, 9};
   	 int[] b = {10, 30, 50, 20, 40};
   	 
   	 int wynik;
   	 
   	wynik = sumaPodzielnychPrzez10(a);
  	 System.out.println("wynik a " + wynik);

  	 wynik = sumaPodzielnychPrzez10(b);
  	 System.out.println("wynik b " + wynik);
  	 
  	wynik = sumaPodzielnychPrzez102(a);
 	 System.out.println("wynik a " + wynik);

 	 wynik = sumaPodzielnychPrzez102(b);
 	 System.out.println("wynik b " + wynik);
 	 

   	 System.out.println("\nparzyste ile sztuk");
   	 wynik = ilePodzielnychPrzez(2, a);
   	 System.out.println("wynik a " + wynik);

   	 wynik = ilePodzielnychPrzez(2, b);
   	 System.out.println("wynik b " + wynik);

   	


   	
    }

}

	
	//x % 10 == 0
	