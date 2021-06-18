package Homework27;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		ArrayList<Integer> array = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
		boolean isExit = true;
		int number;
		while (isExit) {
			System.out.println("Enter a number");
			number = scan.nextInt();
			array.add(number);
			showBigNumber(array);
			System.out.println("Do you want to terminate the program ?  y/n ");
			char answer = scan.next().charAt(0);
			isExit = answer == 'y' ? false : true;
			if (isExit == false) {
				System.err.println("The program is terminated..");
			}
		}
	}

	private static void showBigNumber(ArrayList<Integer> array) {
		Integer maxOfNumber = Collections.max(array);
		Integer minOfNumber = Collections.min(array);
		System.out.println("Max value :" + maxOfNumber);
		System.out.println("Min value :" + minOfNumber);
	}
}
