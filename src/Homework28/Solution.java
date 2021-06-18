package Homework28;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean isExit = true;
		int number;
		while (isExit) {
			System.out.println("Enter a number");
			number = scan.nextInt();
			isPerfectNumber(number);
			System.out.println("Do you want to terminate the program ?  y/n ");
			char answer = scan.next().charAt(0);
			isExit = answer == 'y' ? false : true;
			if (isExit == false) {
				System.err.println("The program is terminated..");
			}
		}
	}

	private static void isPerfectNumber(int number) {
		int sum = 0, i = 1;
		while (i < number) {
			if (number % i == 0) {
				sum += i;
			}
			i += 1;
		}
		System.err.println(number == sum ? number + " is perfect number" : number + " is not a perfect number");
	}
}
