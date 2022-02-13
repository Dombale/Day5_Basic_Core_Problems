package com.blz.day5;

import java.util.Scanner;

public class PowerOfTwo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Declare the object and initialize with
		// predefined standard input object
		System.out.println("Enter a power N is:");
		// integer input
		int n = sc.nextInt();
		int i = 0;
		if ((i <= 0) && (n <= 30)) { // Use condition for Only works if 0 <= N < 31.

			for (int i1 = 0; i1 <= n; i1++) { // since 2^31 overflows an int.
				System.out.println(i1 + "\t" + ((int) (Math.pow(2, i1)))); // Use math function to find power of
																			// number(i.e 2)
			}
		} else
			System.out.println("Overflow");
	}

}
