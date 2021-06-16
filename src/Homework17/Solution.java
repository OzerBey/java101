package Homework17;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = scan.nextInt();
		// getEvenNumbers(number);// i did it using recursive method
		// findEvenNumbers(number);
		// System.out.println(findEvenNumbersArrayList(number)); // method that find
		// even numbers
		System.out.println("Average: " + getAverage(number));
	}

	// homework
	static float getAverage(int number) {
		int sum = 0, counter = 0;
		for (int i = 1; i <= number; i++) {
			if (i % 3 == 0 && i % 4 == 0) {
				sum += i;
				counter++;
			}
		}
		return sum / counter;

	}

	static ArrayList<Integer> findEvenNumbersArrayList(int number) {
		ArrayList<Integer> array = new ArrayList<Integer>();
		int result = 0;
		for (int i = 0; i <= number; i++) {
			if (i % 2 == 0) {
				array.add(i);
			}
		}
		return array;
	}

	static void findEvenNumbers(int number) {
		for (int i = 0; i < number; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}

	// my extra solving
	static int getEvenNumbers(int number) {
		if (number >= 1) {
			if (number % 2 == 0) {
				System.out.println(number);
			}
			getEvenNumbers(number - 1);
		} else {
			System.out.println("0");
			return 0;
		}
		return number;
	}
}
