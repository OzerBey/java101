package Homework18;

import java.util.Scanner;

public class Solution {

	static void sumOfOddNumbers() {
		Scanner scan = new Scanner(System.in);	
		int sum = 0;
		boolean isPositive = true;
		int number;
		while (isPositive) {
			System.out.println("Enter a number");
			number = scan.nextInt();
			if (isNegativeNumber(number)) {
				isPositive = false;
			}
			if (!(number % 2 == 0)) { // condition that find odd numbers
				sum += number;
			}
		}
		System.out.println("Sum of odd numbers: " + sum);
	}

	static boolean isNegativeNumber(int number) {
		boolean result = false;
		if (number < 0) {
			result = true;
		} else
			result = false;
		return result;
	}

	static boolean isOddNumber(int number) {
		boolean result = false;
		if (!(number % 2 == 0)) {
			result = true;
		} else
			result = false;
		return result;
	}

	static void sumOfEvenNumbers() {
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		boolean isEven = true;
		int number;
		while (isEven) {
			System.out.println("Enter a number");
			number = scan.nextInt();
			if (isOddNumber(number)) {// condition of exit of program
				isEven = false;
			}
			if (number % 2 == 0 && number % 4 == 0) {
				sum += number;
			}
		}
		System.out.println("Sum of even and multiples of 4 numbers: " + sum);
	}

	// test
	public static void main(String[] args) {
		System.err.println("! Enter negative number to exit the program");
		// sumOfOddNumbers();
		sumOfEvenNumbers();
	}
}
