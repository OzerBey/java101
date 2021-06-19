package Homework34;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a base number ");
		int baseNumber = scan.nextInt();
		System.out.println("Enter a power of base number");
		int powerNumber = scan.nextInt();
		System.err.println("Result :" + calcualteExponantial(baseNumber, powerNumber));
	}

	static int calcualteExponantial(int base, int power) {
		if (power == 0)
			return 1;
		else if (base == 1)
			return 1;
		else
			return base * calcualteExponantial(base, power - 1);
	}
}
