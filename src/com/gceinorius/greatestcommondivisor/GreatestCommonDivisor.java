package com.gceinorius.greatestcommondivisor;

import java.util.Scanner;

public class GreatestCommonDivisor {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter first number to find GCD");
		int number1 = scanner.nextInt();
		System.out.println("Please enter second number to find GCD");
		int number2 = scanner.nextInt();
		System.out.println("GCD of two numbers " + number1 + " and " + number2 + " is :"
				+ findGreatestCommonDivisor(number1, number2));

	}

	private static int findGreatestCommonDivisor(int number1, int number2) {
		if (number2 == 0) {
			return number1;
		}
		return findGreatestCommonDivisor(number2, number1 % number2);
	}

}
