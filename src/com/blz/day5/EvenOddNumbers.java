package com.blz.day5;

import java.util.Scanner;

public class EvenOddNumbers {

	public static void main(String[] args) {
		System.out.println("Welcome in Even-Odd Numbers...!!");
		evenOddCheck();
	}

	static void evenOddCheck() {
		System.out.println("The number is :");
		Scanner sc = new Scanner(System.in);
		int Num = sc.nextInt();

		if (Num % 2 == 0)
			System.out.println(Num + " number is Even");
		else
			System.out.println(Num + " number is Odd");

	}

}
