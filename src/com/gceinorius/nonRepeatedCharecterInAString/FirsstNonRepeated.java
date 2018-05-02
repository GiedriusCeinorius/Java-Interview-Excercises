package com.gceinorius.nonRepeatedCharecterInAString;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FirsstNonRepeated {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter word to search for the first non repeated character: ");
		String word = scan.nextLine();

		System.out.println("The first non repeated character in a word '" + word + "' is " + find(word));
	}

	public static char find(String word) {

		Map<Character, Integer> map = new LinkedHashMap<>();
		for (char ch : word.toCharArray()) {
			map.put(ch, map.containsKey(ch) ? map.get(ch) + 1 : 1);
			System.out.println(map);
		}

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1) {
				return entry.getKey();
			}

		}
		throw new RuntimeException("Didn't find any non repeated character");

	}
}
