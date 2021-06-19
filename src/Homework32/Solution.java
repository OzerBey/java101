package Homework32;

import java.util.Scanner;

public class Solution {
	static int palindromeRecursion(int number, int temp) { // recursion method
		if (number == 0)
			return temp;
		// storing reverse of a number
		temp = (temp * 10) + (number % 10);
		return palindromeRecursion(number / 10, temp);
	}

	static boolean isPalindromeNumber(int number) {
		boolean result = false;
		int temp = palindromeRecursion(number, 0);
		if (temp == number)
			result = true;
		else
			result = false;
		return result;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = scan.nextInt();
		System.err
				.println(isPalindromeNumber(palindromeRecursion(number, 0)) == true ? number + " is a palindrome number"
						: number + " is not a palindrome number");
	}
}
