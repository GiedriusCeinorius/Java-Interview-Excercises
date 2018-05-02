package com.gceinorius.leapyear;

import java.time.LocalDate;
import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter year to check:");
		isitLeapYear(scan.nextInt());
	}

	private static void isitLeapYear(int year) {
		LocalDate date = LocalDate.now();
		if(date.withYear(year).isLeapYear()) {
			System.out.println("Yes, the year of " + year + " is leap year. The year has " + date.withYear(year).lengthOfYear() + " days");
		} else {
			System.out.println("No, the year of " + year + " is not leap year. The year has " + date.withYear(year).lengthOfYear() + " days");
		}
		
		
	}

}
