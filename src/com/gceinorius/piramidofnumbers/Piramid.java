package com.gceinorius.piramidofnumbers;

import java.util.Scanner;

public class Piramid {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter rows of piramid: ");
		int rows = scan.nextInt();
		System.out.println("Here is your piramid: ");
		
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < rows - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i + 1; k++) {
				System.out.print(k + " ");
			}
			System.out.println();
		}

	}

}
