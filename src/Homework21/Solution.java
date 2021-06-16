package Homework21;

import java.util.Scanner;

public class Solution {

	public static int calculateExponantialNumbers(int base, int power) {
		return (int) Math.pow(base, power);
	}

	public static int calculateExponantialNumbersWithForLoop(int base, int power) {
		int result = 1;
		for (int i = 0; i < power; i++) {
			result *= base;
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter base number");
		int base = scan.nextInt();
		System.out.println("Enter power number");
		int power = scan.nextInt();
		// System.out.println("Result :" + calculateExponantialNumbers(base, power)); // using Math library :)
		System.out.println("Result :" + calculateExponantialNumbersWithForLoop(base, power)); //with for loop
	}
}
