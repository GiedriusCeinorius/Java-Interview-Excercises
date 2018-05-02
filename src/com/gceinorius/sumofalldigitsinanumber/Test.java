package com.gceinorius.sumofalldigitsinanumber;

import java.util.Scanner;


//Using recursive method
public class Test {

	int sum = 0;

	private int sumOfNum(int num) {

		if (num != 0) {

			int lastDigit = num % 10;
			sum += lastDigit;
			num = num / 10;
			sumOfNum(num);
		}

		return sum;

	}

	public static void main(String[] args) {
				
		Test test = new Test();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number to find all of it's members sum: ");
		int num = scan.nextInt();

		System.out.println("The sum of the number " + num + " is : " + test.sumOfNum(num));


	}

}
