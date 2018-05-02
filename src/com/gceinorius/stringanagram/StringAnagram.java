package com.gceinorius.stringanagram;

import java.util.Arrays;

public class StringAnagram {

	public static void main(String[] args) {

		System.out.println(checkIfAnagram("Wo rd", "r	odw"));
		System.out.println(checkIfAnagram("wood", "boobs"));
		
		System.out.println(checkIfAnagram2("word", "rodw"));
		System.out.println(checkIfAnagram2("wood", "boo"));
	}

	private static boolean checkIfAnagram(String string, String string2) {
		char[] a = string.toLowerCase().replaceAll("\\s", "").toCharArray();
		char[] b = string2.toLowerCase().replaceAll("\\s", "").toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		System.out.println(a);
		System.out.println(b);
		return Arrays.equals(a, b);
	}
	
	//Another method (more complicated)

	private static boolean checkIfAnagram2(String str, String str2) {
		if (str.length() != str2.length()) {
			return false;
		}
		int counter = 0;
		char[] a = str.toCharArray();
		char[] b = str2.toCharArray();
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					counter++;
				}
			}
		}
		return counter == str.length();
	}

}
