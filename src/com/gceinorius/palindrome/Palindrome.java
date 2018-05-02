package com.gceinorius.palindrome;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println("Enter word to check if it's palindrome: ");
		String word = new Scanner(System.in).nextLine();
		isPalindrome(word);

	}

	private static void isPalindrome(String word) {
		String reverse = "";
		int lenght = word.length();
		for (int i = lenght - 1; i >= 0; i--) {
			reverse = reverse + word.charAt(i);
		}
		if (word.equals(reverse)) {
			System.out.println("Word " + "word" + " is palindrome");
		} else {
			System.out.println("Word " + "word" + " is not palindrome");
		}

	}

	// Or simpler solution:

	public static boolean isPalindrome2(String str) {
		return str.equals(new StringBuilder(str).reverse().toString());
	}

}
