package com.gceinorius.reversewordinasentence;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseWordsInASentensce {

	public static void main(String[] args) {

		String a = "This is a sensence to reverse";

		reverseWords(a);

	}

	private static void reverseWords(String a) {

		// Reverse every word
		List<String> list = Arrays.asList(a.split("\\s"));
		List<String> list2 = list.stream().map(s -> new StringBuilder(s).reverse().toString())
				.collect(Collectors.toList());
		System.out.println(list2);

		// Reverse words in a sentence
		List<String> l = new ArrayList<>();
		for (int i = list2.size() - 1; i >= 0; i--) {

			l.add(list2.get(i));
		}
		System.out.println(l);
	}

}
