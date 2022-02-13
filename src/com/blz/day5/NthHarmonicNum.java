package com.blz.day5;

import java.util.Scanner;

public class NthHarmonicNum {

	public static void main(String... a) {
		System.out.println("Enter any number : ");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		System.out.print("The Harmonic Series is : ");
		double result = 0.0;
		while (num > 0) {
			result = result + (double) 1 / num;
			num--;
			System.out.println(result + "  ");
		}

		System.out.println("Output of Harmonic Series is " + result);
	}
}
