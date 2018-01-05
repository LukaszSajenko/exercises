package Podstawy;

import java.util.Scanner;

public class lokata {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.println("Witaj w kalkulatorze zysków z lokat. Aby wyliczyæ zysk z lokaty zadamy Ci kilka pytañ...");
		System.out.println("Wpisz jaki kapita³ chcesz wp³aciæ na lokatê...");
		double money = in.nextInt();
		System.out.printf("Chcesz wp³aciæ%, .0f z³.", money);
		System.out.println();
		System.out.println("Wpisz na ilu miesiêczn¹ lokatê wp³acasz pieni¹dze...");
		double time = in.nextInt();
		System.out.printf("Chcesz wp³aciæ pieni¹dze na lokatê trwaj¹c¹%, .0f dni.", time * 30);
		System.out.println();
		System.out.println("Wpisz jakie jest oprocentowanie w skali roku na lokacie...");
		double interestRate = in.nextInt();
		System.out.println("Oprocentowanie w skali roku na lokacie wynosi " + interestRate + "%");
		System.out.println("Obliczam zysk z lokaty...");
		double lokata = (double) (money * interestRate / 100.0 * (time * 30) / 365); 
		System.out.printf("Zysk z Twojej lokaty wyniesie%, .2f z³. Gratulacjê!", lokata);
	}

}
