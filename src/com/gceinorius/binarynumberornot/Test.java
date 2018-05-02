package com.gceinorius.binarynumberornot;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number to check if it is binary: ");
		int number = scan.nextInt();

		checkBinaryOrNot(number);
	}

	private static void checkBinaryOrNot(int nr) {
		boolean yesNo = false;
		int number = nr;
		while (number != 0) {
			int remainder = number % 10;
			if ((remainder == 0) || (remainder == 1)) {
				number = number / 10;
				yesNo = true;
			} else {
				yesNo = false;
				break;
			}
		}
		if (yesNo == true) {
			System.out.println(nr + " is binary!");
		} else {
			System.out.println(nr + " is not binary!");
		}

	}

}
