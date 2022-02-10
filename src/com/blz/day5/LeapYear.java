package com.blz.day5;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		System.out.println(" Welcome in Leap Year Calculator : ");
		checkLeapYear();
	}
	// Using static method for checking leap year condition.

	static void checkLeapYear() {
		System.out.println(" Please enter Year in YYYY : ");
		Scanner sc = new Scanner(System.in); // use scanner function to ask user input(Year)
		int year = sc.nextInt();

		/*
		 * According to Gregorian calender Any year that is evenly divisible by 4 is a
		 * leap year. year that is evenly divisible by 100 is a leap year only if it is
		 * also evenly divisible by 400.
		 */

		if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) { // use condition and check year divisible or
																			// not by 4,100,400.

			System.out.println(year + " is leap Year");
		} else
			System.out.println(year + " is not leap Year");
	}

}
