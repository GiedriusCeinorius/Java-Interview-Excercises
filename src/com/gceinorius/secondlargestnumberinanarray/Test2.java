package com.gceinorius.secondlargestnumberinanarray;

import java.util.Arrays;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter array legth:  ");
		int num = scan.nextInt();
		System.out.println("Enter numbers: ");
		int[] array = new int[num];
		for (int i = 0; i < array.length; i++) {
			array[i] = scan.nextInt();
		}
		
		
		System.out.print("The second largest number is: ");
		Arrays.stream(array).sorted().limit(array.length - 1).skip(array.length - 2).forEach(System.out :: println);
	}


}
