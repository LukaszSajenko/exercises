package Liczby;

public class WypiszZakresy {

	public static void main(String[] args) {
    	System.out.println("byte " + Byte.SIZE + " bitów, zakres od " + Byte.MIN_VALUE + " do " + Byte.MAX_VALUE);
    	System.out.println("short " + Short.SIZE + " bitów, zakres od " +Short.MIN_VALUE + " do " + Short.MAX_VALUE);
    	System.out.println("int " + Integer.SIZE + " bitów, zakres od " +Integer.MIN_VALUE + " do " + Integer.MAX_VALUE);
    	System.out.println("long " + Long.SIZE + " bitów, zakres od " +Long.MIN_VALUE + " do " + Long.MAX_VALUE);

    	System.out.println("char " + Character.SIZE + " bitów, zakres od " +  (int)Character.MIN_VALUE + " do " + (int) Character.MAX_VALUE);
	}
}
