package com.gceinorius.amstrongnumber;

import java.util.Scanner;

public class AmstrongNumber {

	public static void main(String[] args) {

		System.out.println("Enter number to check if it's Amstrong number: ");
		int number = new Scanner(System.in).nextInt();

		if (isNumberAmstrong(number)) {
			System.out.println("Number " + "number" + " is Amstrong number");
		} else {
			System.out.println("Number " + "number" + " is not Amstrong number");
		}
	}

	private static boolean isNumberAmstrong(int number) {
		int result = 0;
		int originalNum = number;
		while (number != 0) {
			int remainder = number % 10;
			result = result + remainder * remainder * remainder;
			number = number / 10;
		}
		if (result == originalNum) {
			return true;
		} else {
			return false;
		}
	}

}
