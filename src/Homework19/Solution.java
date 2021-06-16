package Homework19;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to find multiple of two");
		int number = scan.nextInt();
		System.out.println("For multiple of two");
		findMultipleOfTwo(number);
		System.out.println("\nFor multiple of four and five");
		findMulitpleOfFourAndFive(number);
	}

	static void findMultipleOfTwo(int number) {
		for (int i = 1; i <= number; i *= 2) {
			System.out.print(i + " ");
		}
	}

	// other method
	static void findMulitpleOfFourAndFive(int number) {
		for (int i = 1; i <= number; i++) {
			System.out.print("for 4 :" + Math.pow(i, 4) + " |");
			System.out.print("for 5:" + Math.pow(i, 5) + " \n");
		}
	}

}
