package com.gceinorius.occurenciesinastringcount;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter string to count occurencies: ");
		String str = scan.nextLine();
		System.out.println("Occurencies are: " + countOccurencies(str));
	}

	private static Map<Character, Integer> countOccurencies(String str) {
		char[] array = str.replaceAll("\\s", "").toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		for (char c : array) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}

		return map;
	}

}
