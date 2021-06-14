package Homework2;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a value");
		double value = scan.nextDouble();
		if (isBetween(value)) {
			System.out.println("18:" + calculateKdvRate18(value));
		} else if (value > 1000) {
			System.out.println("8:" + calculateKdvRate8(value));
		} else {
			System.err.println("System error!");
		}
	}

	static boolean isBetween(double amount) {
		boolean result = false;
		if (amount > 0 && amount <= 1000) {
			result = true;
		}
		return result;
	}

	static double calculateKdvRate18(double amount) {
		double result18 = 0;
		result18 = (double) (amount + (amount * .18));
		return result18;
	}

	static double calculateKdvRate8(double amount) {
		double result8 = 0;
		result8 = (double) (amount + (amount * .08));
		return result8;
	}
}
