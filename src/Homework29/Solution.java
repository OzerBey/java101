package Homework29;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a value");
		int value = scan.nextInt();
		createInvertedTraingleShape(value);
	}

	private static void createInvertedTraingleShape(int value) {
		for (int i = value - 1; i >= 1; i--) {
			for (int j = 1; j <= value - i; j++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
