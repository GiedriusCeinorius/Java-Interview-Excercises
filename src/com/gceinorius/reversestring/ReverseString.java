package com.gceinorius.reversestring;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		System.out.println("Enter word to reverse:");
		String word = new Scanner(System.in).nextLine();
		System.out.println("The reversed word would be: " + recursiveMethod(word));

	}

	private static String reversed2(String word) {
		String reverse = "";
		int lenght = word.length();
		for (int i = lenght - 1; i >= 0; i--) {
			reverse = reverse + word.charAt(i);
		}
		return reverse;

	}
	
	static String recursiveMethod(String str)
	{
	     if ((null == str) || (str.length() <= 1))
	     {
	            return str;
	     }
	 System.out.println(str);
	     return recursiveMethod(str.substring(1)) + str.charAt(0);
	}

	// Or simpler solution:

	public static String reversed(String str) {
		return new StringBuilder(str).reverse().toString();
	}

}
