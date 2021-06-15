package Homework8;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter 1st value");
		float firstVal = scan.nextInt();

		System.out.println("Enter 2nd value");
		float secondVal = scan.nextInt();

		System.out.println("Choose a value for operations");
		System.out.println(" 1. Sum\n 2. Sub\n 3. Mult\n 4. Div ");

		int key = scan.nextInt();
		double result = 0;

		switch (key) {
		case 1:
			result = firstVal + secondVal;
			break;
		case 2:
			result = firstVal - secondVal;
			break;

		case 3:
			result = firstVal * secondVal;
			break;
		case 4:
			if (secondVal == 0) {
				System.err.println("infinite divide error");
			}
			result = firstVal / secondVal;
			break;

		default:
			System.err.println("Invalid operation");
			break;
		}
		System.out.println("Result: " + result);

	}
}
