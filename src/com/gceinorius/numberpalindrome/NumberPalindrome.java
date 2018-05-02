package com.gceinorius.numberpalindrome;

import java.util.Scanner;

public class NumberPalindrome {

	public static void main(String[] args) {

		System.out.println("Enter number to check if it's palindrome: ");
		int number = new Scanner(System.in).nextInt();

		if (isNumberPalindrome(number)) {
			System.out.println("Number " + "number" + " is palindrome");
		} else {
			System.out.println("NUmber " + "number" + " is not palindrome");
		}
	}

	public static boolean isNumberPalindrome(int str) {

		return str == Integer.parseInt(new StringBuilder().append(str).reverse().toString());
	}
}
