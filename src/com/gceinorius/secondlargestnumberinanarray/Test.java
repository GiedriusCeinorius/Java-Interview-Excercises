package com.gceinorius.secondlargestnumberinanarray;

import java.util.Arrays;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter array legth:  ");
		int num = scan.nextInt();
		System.out.println("Enter numbers: ");
		int[] array = new int[num];
		for (int i = 0; i < array.length; i++) {
			array[i] = scan.nextInt();
		}
		
		System.out.println(Arrays.toString(array));
		
		secondLargestNumber(num, array);
	}

	private static void secondLargestNumber(int arrayLength, int[] array) {
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		System.out.println(array[arrayLength - 2]);
	}

}
