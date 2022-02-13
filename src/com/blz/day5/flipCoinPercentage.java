package com.blz.day5;

import java.util.Scanner;

public class flipCoinPercentage {

	public static void main(String[] args) {

		System.out.println("Welcome in coin flip..!!!");
		// Declare and Initialize variables.
		Scanner sc = new Scanner(System.in);
		System.out.println("How many times coin flip...??");
		float flip = sc.nextFloat(); // taking user input for coin flipping.
		int headCount = 0; // Initial headcount is 0.
		int tailCount = 0; // Initial headcount is 0.
		float tailpercentage;
		float headpercentage;

		// Use for loop for flip coin
		for (int i = 0; i < flip; i++) {
			double flipCoin = Math.random(); // create random flipcoin using math function
			System.out.println(flipCoin);

			if (flipCoin <= 0.5) { // use condition if random number =>0.5 i.e "head" else tail.
				headCount++;
			} else {
				tailCount++;
			}

			System.out.println("Headcount: " + headCount);
			System.out.println("Tailscount: " + tailCount);

		}
		// find percentage of headcount and tailcount
		tailpercentage = (float) ((tailCount / flip) * 100);
		System.out.println("Tail % : " + tailpercentage);
		headpercentage = (float) ((headCount / flip) * 100);
		System.out.println("Head % : " + headpercentage);

	}

}