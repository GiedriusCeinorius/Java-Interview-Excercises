package com.gceinorius.squareroot;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Emter number to find it's square root: ");
		double square = scan.nextDouble();

		double squareroot = Math.sqrt(square);

		System.out.printf("The root of number: %f is: %f", square, squareroot);

	}

}
