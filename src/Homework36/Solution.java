package Homework36;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		myRecursiveMethod(number);
	}

	// it doesn't working true correctly :(
	static int myRecursiveMethod(int number) {
		int result;
		if (number <= 0) {
			result = myRecursiveMethod(number + 5);
			System.out.println(result);
			return result;
		} else {
			result = myRecursiveMethod(number - 5);
			System.out.println(result);
			return result;
		}
	}
}
