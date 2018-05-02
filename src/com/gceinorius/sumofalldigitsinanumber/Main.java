package com.gceinorius.sumofalldigitsinanumber;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number to find all of it's members sum: ");
		int num = scan.nextInt();

		System.out.println("The sum of the number " + num + " is : " + sumOfNum(num));

	}

	private static int sumOfNum(int num) {
		int sum = 0;
		while (num != 0) {
			int lastDigit = num % 10;
			sum += lastDigit;
			num = num / 10;
		}
		return sum;
	}

}
