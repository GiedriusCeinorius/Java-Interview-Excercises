package com.gceinorius.removewhitespacefromastring;

public class Main {

	public static void main(String[] args) {
		String sentense = " Remove	all	 the white spaces			from this sentence";
		System.out.println(removeSpaces2(sentense));

	}

	 public static String removeSpaces(String word) {
	 String whiteSpacesRemoved = word.replaceAll("\\s", "");
	 return whiteSpacesRemoved;
	 }

	public static String removeSpaces2(String word) {
		char[] array = word.toCharArray();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < array.length; i++) {
			if ((array[i] != ' ') && (array[i] != '\t')) {
				sb.append(array[i]);
			}
		}
		return sb.toString();
	}

}
