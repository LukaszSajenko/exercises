package Podstawy;

import java.util.Scanner;

public class pêtle {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Ile pieniêdzy potrzebujesz, aby przejœæ na emeryturê?");
		double goal = in.nextDouble();
		
		System.out.println("Ile pieniêdzy rocznie bêdziesz wp³acaæ?");
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
			
			System.out.printf("Po up³ywie %d lat stan Twojego konta wyniesie %,.2f%n", years, balance);
			
			System.out.println("Czy chcesz przejœæ na emeryturê? (T/N) ");
			input = in.next();
			
		}
		
		while (input.equals("N"));
//		System.out.println("Mo¿esz przejœæ na emeryturê za " + years + " lat.");
	

	}
	
	
	
	

}
