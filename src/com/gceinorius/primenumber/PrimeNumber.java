package com.gceinorius.primenumber;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		System.out.println("Enter number to check if it's prime: ");
		int number = new Scanner(System.in).nextInt();
		 if(isPrime(number)) {
			 System.out.println("Number " + number + " is prime");
		 } else {
			 System.out.println("Number " + number + " is not prime");
		 }
	}
	
	public static boolean isPrime(int n) {
	    int i;
	    for (i = 2; i < n; i++) {
	        if (n % i == 0) {
	            return false;
	        }
	    }
	    return true;
	}

}
