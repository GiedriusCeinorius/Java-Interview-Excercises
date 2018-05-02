package com.gceinorius.reversearray;

public class ReverseArray {

	public static void main(String[] args) {

		int[] a = new int[] { 1, 2, 3, 4, 5, -1 };

		int[] b = reverse(a);
		for (int i : b) {
			System.out.print(i);
		}

	}

	public static int[] reverse(int[] a) {
		int[] b = new int[a.length];
		for (int i = a.length - 1, j = 0; i >= 0; i--, j++) {
			b[j] = a[i];
		}
		return b;
	}

}
