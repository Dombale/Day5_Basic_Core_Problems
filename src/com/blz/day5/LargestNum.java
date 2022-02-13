package com.blz.day5;

import java.util.Scanner;

public class LargestNum {

	public static void main(String[] args) {
		System.out.println(" Welcome to find Largest Number..!!");
		findLargestNum();
	}

	static void findLargestNum() {

		// Declare the object and initialize with
		// predefined standard input object
		Scanner sc = new Scanner(System.in);
		// Print the input number values
		System.out.println(" The First Number is :");
		// integer input
		int num1 = sc.nextInt();

		System.out.println(" The Second Number is :");
		int num2 = sc.nextInt();

		System.out.println(" The Third Number is :");
		int num3 = sc.nextInt();

		if ((num1 >= num2) && (num1 >= num3)) // Condition checking largest number between three numbers
			System.out.println(num1 + "is largest number among three numbers ");
		else if ((num2 >= num1) && (num2 >= 3))
			System.out.println(num2 + "is largest number among three numbers ");
		else
			System.out.println(num3 + " is largest number among three numbers ");
	}
}