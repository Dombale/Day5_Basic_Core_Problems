package com.blz.day5;

import java.util.Scanner;

public class PrimeFactorization {
	public static void main(String[] args) {
		System.out.println("Enter any number : ");
		Scanner scn = new Scanner(System.in);
		// Declare the object and initialize with
		// predefined standard input object
		int n = scn.nextInt();

		for (int div = 2; div * div <= n; div++) { // for loop -> Traverse till i*i <= N instead of i <= N for
													// efficiency.
			while (n % div == 0) {
				System.out.print(div + " ");
				n = n / div;
			}
		}
		if (n != 1) { // if N not equl to 1 print value N.i.e its own factor of given number.
			System.out.print(n);
		}

	}
}