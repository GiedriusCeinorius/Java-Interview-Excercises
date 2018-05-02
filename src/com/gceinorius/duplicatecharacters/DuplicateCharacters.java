package com.gceinorius.duplicatecharacters;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DuplicateCharacters {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter word to calculate duplicate characters: ");
		String word = scan.nextLine();
		Map<Character, Integer> map = calculateDuplicates(word);
		for (Map.Entry<Character, Integer> en : map.entrySet()) {
			if (en.getValue() > 1) {
				System.out.println("Character " + en.getKey() + " repeated " + en.getValue() + " times");
			}
		}
	}

	private static Map<Character, Integer> calculateDuplicates(String word) {
		char[] array = word.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		for (char c : array) {
			if (map.containsKey(c)) {
				int num = map.get(c) + 1;
				map.put(c, num);
			} else {
				map.put(c, 1);
			}
		}
		return map;
	}

}
