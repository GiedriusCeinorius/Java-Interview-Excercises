package com.gceinorius.factorial;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		System.out.println("Enter number to calculate it's factorial: ");
		int number = new Scanner(System.in).nextInt();

		System.out.println("Factorial of number " + number + " is: ");
		System.out.println(factorial(number) + " ");

	}

	public static int fact(int number) {
		int result = 1;
		while (number != 0) {
			result = result * number;
			number--;
		}

		return result;
	}

	//Or simpler solution:
	
	public static int factorial(int number) {
		if ((number == 1) || (number == 0)) {
			return 1;
		}
		return number * factorial(number - 1);
	}

}
