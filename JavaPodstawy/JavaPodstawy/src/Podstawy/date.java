package Podstawy;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class date {

	public static void main(String[] args) {
		
		

		new Date();
		System.out.println(new Date());
		String s = new Date().toString();
	
		Date birthday = new Date();
		System.out.println(birthday);
		
//		LocalDate.now(); To wskazuje aktualny czas (data)
		System.out.println(LocalDate.now());
		System.out.println(LocalDate.of(2017, 12, 12));
		LocalDate newYearsEve = LocalDate.of(2017, 12, 31);
		System.out.println("Sylwester w tym roku zaczyna siê " + newYearsEve + " o godzinie 20 na Polsacie! :)");
		
		int year = newYearsEve.getYear();
		int month = newYearsEve.getMonthValue();
		int day = newYearsEve.getDayOfMonth();
		System.out.println("Dzieñ to: " + day + ", miesi¹c, to: " + month + ", a rok, to: " + year);
		LocalDate aThousandDaysLater = newYearsEve.plusDays(1000);
		int year_1 = aThousandDaysLater.getYear();
		int month_1 = aThousandDaysLater.getMonthValue();
		int day_1 = aThousandDaysLater.getDayOfMonth();
		System.out.println("Za tysi¹c dni, bêdzie to rok " + year_1 + ", miesi¹c " + month_1 + " i dzieñ " + day_1);
		System.out.println("Sylwester w tym roku, to: " + newYearsEve + ". A za tysi¹c dni bêdzie to dzieñ: " + aThousandDaysLater);
	}

}
