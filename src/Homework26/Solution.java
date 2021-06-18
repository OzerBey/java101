package Homework26;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		calculateWithWhile();
	}

	private static void calculateWithWhile() {
		Scanner scan = new Scanner(System.in);
		int temp;
		int ebob = 0, value = 1;
		System.out.print("Enter 1st number");
		int number1 = scan.nextInt();
		System.out.print("Enter 2nd number ");
		int number2 = scan.nextInt();
		if (number1 > number2) {// swap operation
			temp = number1;
			number1 = number2;
			number2 = temp;
		}
		while (value < number1) {
			if (number1 % value == 0 && number2 % value == 0) {
				ebob = value;
				System.out.print(ebob + " ");
			}
			value += 1;
		}
		System.out.println();
		System.out.println("Ebob : " + ebob);
		System.out.println("Ekok : " + calculateEkok(number1, number2, ebob));
	}

	static int calculateEkok(int number1, int number2, int ebob) {
		int ekok = ((number1 * number2) / ebob);
		return ekok;
	}
}