package Homework16;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter year to find if it is a leap year");
		int year = scan.nextInt();
		System.out.println("is leap year :" + isLeapYear(year));
		showLeapYear(year);

	}

	static boolean isLeapYear(int year) {
		boolean result = false;
		if (((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0))) {

			result = true;
		} else {
			result = false;
		}
		return result;
	}

	static void showLeapYear(int year) {
		if (((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0))) {

			System.out.println(year + " is a leap year ✓");
		} else {
			System.err.println(year + " is not a leap year ✗");

		}
	}

}
