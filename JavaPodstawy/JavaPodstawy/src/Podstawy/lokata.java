package Podstawy;

import java.util.Scanner;

public class lokata {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.println("Witaj w kalkulatorze zysk�w z lokat. Aby wyliczy� zysk z lokaty zadamy Ci kilka pyta�...");
		System.out.println("Wpisz jaki kapita� chcesz wp�aci� na lokat�...");
		double money = in.nextInt();
		System.out.printf("Chcesz wp�aci�%, .0f z�.", money);
		System.out.println();
		System.out.println("Wpisz na ilu miesi�czn� lokat� wp�acasz pieni�dze...");
		double time = in.nextInt();
		System.out.printf("Chcesz wp�aci� pieni�dze na lokat� trwaj�c�%, .0f dni.", time * 30);
		System.out.println();
		System.out.println("Wpisz jakie jest oprocentowanie w skali roku na lokacie...");
		double interestRate = in.nextInt();
		System.out.println("Oprocentowanie w skali roku na lokacie wynosi " + interestRate + "%");
		System.out.println("Obliczam zysk z lokaty...");
		double lokata = (double) (money * interestRate / 100.0 * (time * 30) / 365); 
		System.out.printf("Zysk z Twojej lokaty wyniesie%, .2f z�. Gratulacj�!", lokata);
	}

}
