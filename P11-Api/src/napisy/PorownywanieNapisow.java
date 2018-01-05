package napisy;

public class PorownywanieNapisow {

	public static void main(String[] args) {
		String ala = "Ala";
		String s1 = "Ala ma kota";
		String s2 = ala + " ma kota";
		String s3 = "Ala" + " ma kota";
		
		final String alaFinal = "Ala";
		String s4 = alaFinal + " ma kota";

		
		System.out.println("s1: " + s1);
		System.out.println("s2: " + s2);
		System.out.println("s3: " + s3);
		System.out.println("s4: " + s4);
		System.out.println();
		
		System.out.println("s1 == s2 " + (s1 == s2));
		System.out.println("s1 eq s2 " + s1.equals(s2) );
		System.out.println();
		
		System.out.println("s1 == s3 " + (s1 == s3));
		System.out.println("s1 eq s3 " + s1.equals(s3) );
		System.out.println();
		
		System.out.println("s1 == s4 " + (s1 == s4));
		System.out.println("s1 eq s4 " + s1.equals(s4) );
		System.out.println();
		

	}

}
