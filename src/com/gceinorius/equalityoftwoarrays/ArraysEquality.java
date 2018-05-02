package com.gceinorius.equalityoftwoarrays;

import java.util.Arrays;

public class ArraysEquality {

	public static void main(String[] args) {

		int[] first = {2, 5, 8, 9};
		int[] second = {2, 5, 8, 10};

		boolean equalsOrNot = true;
		
		if(first.length != second.length) {
			equalsOrNot = false;
		} else {
			for (int i = 0; i < second.length; i++) {
				if(first[i] == second[i]) {
					equalsOrNot = true;
				} else {
					equalsOrNot = false;
				}
			}
		}
		
		if(equalsOrNot) {
			System.out.println("Arrays are equal");
		} else {
			System.out.println("Arrays are not equal");
		}
		
		//Using Arrays.equals method
		
		System.out.println("Arrays are equal: " + Arrays.equals(first, second));
	}
}
		

