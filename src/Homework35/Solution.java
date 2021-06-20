package Homework35;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		System.out.println("Enter a number to learn isPrime number");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		System.err.println(
				isPrimeNumber(number, 2) == true ? number + " is a prime number" : number + " is not a prime number");
	}

	static boolean isPrimeNumber(int number, int i) {
		if (number < 2) {
			return true;
		}
		if (i == (number / 2)) {
			return true;
		} else if (number % i == 0) {
			return false;
		} else {
			return isPrimeNumber(number, i + 1);
		}
	}
}
