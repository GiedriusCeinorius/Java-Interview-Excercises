package com.gceinorius.fibonacci;

import java.util.Scanner;

public class FibonacciCalcullator {

	public static void main(String[] args) {

		System.out.println("Enter number upto calculate Fibonacci series: ");
		int number = new Scanner(System.in).nextInt();

		System.out.println("Fibonacci series upto " + number + ":");
		for (int i = 1; i <= number; i++) {
			System.out.println(fibonacci2(i) + " ");
		}

	}

	public static int fibonacci(int number) {
		if ((number == 1) || (number == 2)) {
			return 1;
		}
		int first = 1;
		int second = 1;
		int fibonacci = 1;
		for (int i = 3; i <= number; i++) {
			fibonacci = first + second;
			first = second;
			second = fibonacci;

		}
		return fibonacci;

	}
	
	//Or simpler solution:

	public static int fibonacci2(int number) {
		if (number == 1 || number == 2) {
			return 1;
		}
		return fibonacci2(number - 1) + fibonacci2(number - 2);
	}

}
