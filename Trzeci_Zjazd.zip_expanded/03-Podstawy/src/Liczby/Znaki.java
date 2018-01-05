package Liczby;

public class Znaki {
	
	public static void main(String[] args) {
		
		char ch = 'A';
		System.out.println(ch);
		ch++;
		System.out.println(ch);
		
		int i = ch;
		System.out.println(i);
		//NK ch = i (NK = nie kompiluje siê)
		
		//Trochê inny temat
		System.out.println("A" + 5);
		System.out.println("A" + 5 + 3);
		System.out.println(5 + "A" + 3);
		System.out.println(5 + 3 + "A");
		
		System.out.println("A" + 5); // A5
	   	 System.out.println("A" + 5 + 3); // A53
	   	 System.out.println("A" + 5 * 3);  // A15
	   	 System.out.println("A" + (5 + 3)); // A8
	   	 System.out.println(5 + "A" + 3); // 5A3
	   	 System.out.println(5 + 3 + "A");  // 8A
	   	 System.out.println(5 + (3 + "A")); // 53A
	   	 
	   	 System.out.println('A' + 5); // 70

	}

}
