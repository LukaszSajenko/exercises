package Podstawy;

import java.util.Scanner;

public class p�tle {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Ile pieni�dzy potrzebujesz, aby przej�� na emerytur�?");
		double goal = in.nextDouble();
		
		System.out.println("Ile pieni�dzy rocznie b�dziesz wp�aca�?");
		double payment = in.nextDouble();
		
		System.out.println("Stopa procentowa w %: ");
		double interestRate = in.nextDouble();
		
		double balance = 0;
		int years = 0;
		
//		while (balance < goal) {
//			balance += payment;
//			double interest = balance * interestRate / 100;
//			balance += interest;
//			years++;
//		}
		
		String input;
		
		do {
			balance += payment;
			double interest = balance + interestRate / 100;
			balance += interest;
			
			years++;
			
			System.out.printf("Po up�ywie %d lat stan Twojego konta wyniesie %,.2f%n", years, balance);
			
			System.out.println("Czy chcesz przej�� na emerytur�? (T/N) ");
			input = in.next();
			
		}
		
		while (input.equals("N"));
//		System.out.println("Mo�esz przej�� na emerytur� za " + years + " lat.");
	

	}
	
	
	
	

}
