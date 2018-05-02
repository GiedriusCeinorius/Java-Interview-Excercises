package com.gceinorius.binarysearchinarray;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchInArray {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter total number of elements: ");
		int in = scan.nextInt();
		int[] elements = new int[in];
		System.out.println("Enter elements: ");
		for (int i = 0; i < elements.length; i++) {
			elements[i] = scan.nextInt();
		}
		System.out.println("Enter number to be searched: ");
		int searchNum = scan.nextInt();
		scan.close();

		if (searchInArray(elements, searchNum) >= 0) {
			System.out.println("Number " + searchNum + " is founded at index " + searchInArray(elements, searchNum));
		} else {
			System.out.println("Number " + searchNum + " not found");

		}

	}

	private static int searchInArray(int[] elements, int searchNum) {
		Arrays.sort(elements);
		return Arrays.binarySearch(elements, searchNum);
	}
}
