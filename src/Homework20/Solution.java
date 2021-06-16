package Homework20;

import java.util.Scanner;

public class Solution {

	// i did this method using recursion :)
	public static int calculateFactorial(int number) {
		if (number >= 1) {
			return number * calculateFactorial(number - 1);
		} else {
			return 1;
		}
	}

	public static void showResultOfFactorial(int result) {
		System.out.println("Factorial :" + result);
	}

	public static int calculateCombination(int n, int r) {
		int result = calculateFactorial(n) / (calculateFactorial(r) * calculateFactorial(n - r));
		return result;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to calculate factorial");
		int number = scan.nextInt();
		showResultOfFactorial(calculateFactorial(number));
		System.out.println("Enter values to calculate the combination (C(n,r))");
		System.out.println("Enter n value");
		int n = scan.nextInt();
		System.out.println("Enter r value");
		int r = scan.nextInt();
		System.out.println("Result :" + calculateCombination(n, r));
		;

	}
}
