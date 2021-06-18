package Homework30;

import java.util.ArrayList;

public class Solution {
	public static ArrayList<Integer> getPrimaryNumbers() {
		ArrayList<Integer> array = new ArrayList<Integer>();
		for (int i = 2; i <= 100; i++) {
			int number = 0;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0)
					number++;
			}
			if (number == 0)
				array.add(i);
		}
		return array;
	}

	// recursive boolean method
	static boolean isPrimaryNumber(int number, int i) {
		if (i < number) {
			if (number % i != 0) {
				return isPrimaryNumber(number, i += 1);
			} else {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// Scanner scan = new Scanner(System.in);
		// System.out.println("Enter a number");
		// int number = scan.nextInt();
		// System.out.println("Is primary number :" + isPrimaryNumber(number, 2));
		System.err.println(getPrimaryNumbers());
	}
}
