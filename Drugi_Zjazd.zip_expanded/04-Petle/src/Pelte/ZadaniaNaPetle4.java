package Pelte;

public class ZadaniaNaPetle4 {
	
	public static int max(int[] t){
		int max = 0;
		for (int element : t) {
			if(element >= max) {
				max = element;
			}
			
		}
		return max;	
	}
	
    
    public static void main(String[] args) {
   	 int[] a = {13, 6, 13, 9, 10, 40, 2, 44, 2, 32, 31, 25, 32, 9};
   	 int[] b = {10, 30, 50, 20, 40};
   	 
   	 System.out.println("max(a) = " + max(a));
   	 System.out.println("max(b) = " + max(b));
   	 
   	
    }

}

	
	//x % 10 == 0
	