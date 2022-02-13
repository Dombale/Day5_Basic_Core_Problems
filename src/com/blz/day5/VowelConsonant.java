package com.blz.day5;

import java.util.Scanner;

public class VowelConsonant {

	public static void main(String[] args) {

		System.out.println(" Welcome to Vowel_Consonant..!!");
		findVowelConsonant();
	}

	static void findVowelConsonant() {

		// Declare the object and initialize with
		// predefined standard input object
		Scanner sc = new Scanner(System.in);
		// Print the input
		System.out.println(" An alphabet is : ");
		// Character input
		char ch = sc.next().charAt(0);

		// Use switch case for checking vowel and consonant.
		switch (ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println(ch + " is Vowel");
			break;
		default:
			System.out.println(ch + " is a Consonant");
		}

	}
}