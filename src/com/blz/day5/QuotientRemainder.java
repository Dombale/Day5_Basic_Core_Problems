package com.blz.day5;

import java.util.Scanner;

public class QuotientRemainder {

	public static void main(String[] args) {

		System.out.println(" Welcome to Computation of Quotient & Remainder..!!");
		findQuoRemainder();

	}

	static void findQuoRemainder() {
		System.out.println(" Taking Input from user :");

		Scanner sc = new Scanner(System.in);
		System.out.println(" The Divident is : ");
		int divident = sc.nextInt();
		System.out.println(" The Diviser is : ");
		int divisor = sc.nextInt();

		int quotient = divident / divisor;
		int remainder = divident % divisor;

		System.out.println(" Quotient is : " + quotient);
		System.out.println(" Remainder is : " + remainder);

	}

}
