package com.gceinorius.dublicatesinanarray;

import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		String[] array = {"ONE", "TWO", "THREE", "TWO", "FOUR"};
		
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if((array[i] == array[j]) && (i !=j)) {
					System.out.println("Dublicate elementis: " + array[j]);
				}
			}
		}
		
		
		//Using HashSet
		
		Set<String> set = new HashSet<>();
		for (String string : array) {
			if(!set.add(string)) {
				System.out.println("Dublicate elementis: " + string);
			}
		}
		
	}

}
