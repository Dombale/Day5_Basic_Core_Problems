package com.blz.day5;

import java.util.Scanner;

public class SwapNumber {

	public static void main(String[] args) {
		System.out.println(" Welcome to Swapping Numbers..!!");
		swapNumbers();
	}

	static void swapNumbers() {
		System.out.println(" Numbers before Swap");
		// Declare the object and initialize with
		// predefined standard input object
		System.out.println(" First Number:");
		// Print the input number values
		Scanner sc = new Scanner(System.in);
		// integer input
		int num1 = sc.nextInt();
		System.out.println(" Second Number:");
		int num2 = sc.nextInt();

		// Logic to swapping two numbers :

		num1 = num1 - num2; // Assume num1=1, num2=3,then num1 is (1-3) = -2.
		num2 = num1 + num2; // now num1=-2, num2=3, then num2 is (-2+3) = 1.(num2 swap to 1)
		num1 = num2 - num1; // now num1=-2, num2=1, then num1 is (1-(-2))=3. (num1 swap to 3)

		System.out.println(" Numbers After Swap");
		System.out.println(" First Number:" + num1);
		System.out.println(" Second Number:" + num2);

	}

}
