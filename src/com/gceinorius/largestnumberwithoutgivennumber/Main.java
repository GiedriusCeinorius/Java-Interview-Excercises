package com.gceinorius.largestnumberwithoutgivennumber;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number: ");
		int number = scan.nextInt();
		System.out.println("Enter number to be excluded: ");
		int ex = scan.nextInt();
		System.out.println(getLLessThanN(number, ex));
	}

	static int getLLessThanN(int number, int digit)
    {
        char c = Integer.toString(digit).charAt(0);
        for (int i = number; i > 0; --i)
        {
            if(Integer.toString(i).indexOf(c) == -1)
            {
                return i;
            }
        }
 
        return -1;
    }
 

}
