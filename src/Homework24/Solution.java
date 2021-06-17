package Homework24;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to height of code ");
		int height = scan.nextInt();
		int halfHeight = (int) (height / 2) + 1;
		// the other lower top of the shape
		getTopShape(halfHeight);
		// the other lower half of the shape
		getLowerShape(halfHeight);

	}

	private static void getLowerShape(int halfHeight) {
		for (int i = halfHeight - 1; i >= 1; i--) {
			for (int j = 1; j <= halfHeight - i; j++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	private static void getTopShape(int halfHeight) {
		for (int i = 1; i <= halfHeight; i++) {
			for (int j = 1; j <= halfHeight - i; j++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
