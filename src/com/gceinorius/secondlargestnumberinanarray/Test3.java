package com.gceinorius.secondlargestnumberinanarray;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter array legth:  ");
		int num = scan.nextInt();
		System.out.println("Enter numbers: ");
		int[] array = new int[num];
		for (int i = 0; i < array.length; i++) {
			array[i] = scan.nextInt();
		}
		
		System.out.print("Second largest number is: ");
		System.out.println(secondLargest(array));

	}

	private static int secondLargest(int[] array) {
		int first;
		int second;
		if(array[0] > array[1]) {
			first = array[0];
			second = array[1];
		} else {
			first = array[1];
			second = array[0];
		}
		
		for (int i = 2; i < array.length; i++) {
			if(array[i] > first) {
				second = first;
				first = array[i];
			} else if ((array[i] < first) && (array[i] > second)){
				second = array[i];
			}
		}
		return second;
	}

}
