package Liczby;

public class WypiszZakresy {

	public static void main(String[] args) {
    	System.out.println("byte " + Byte.SIZE + " bit�w, zakres od " + Byte.MIN_VALUE + " do " + Byte.MAX_VALUE);
    	System.out.println("short " + Short.SIZE + " bit�w, zakres od " +Short.MIN_VALUE + " do " + Short.MAX_VALUE);
    	System.out.println("int " + Integer.SIZE + " bit�w, zakres od " +Integer.MIN_VALUE + " do " + Integer.MAX_VALUE);
    	System.out.println("long " + Long.SIZE + " bit�w, zakres od " +Long.MIN_VALUE + " do " + Long.MAX_VALUE);

    	System.out.println("char " + Character.SIZE + " bit�w, zakres od " +  (int)Character.MIN_VALUE + " do " + (int) Character.MAX_VALUE);
	}
}
