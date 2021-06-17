package Homework23;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter N number ");
		double n = scan.nextInt();
		/*double result = 0;
		while (n > 0) {
			result += (1 / n);
			n--;
		}
		System.out.println(result);
	*/
		calculateHarmonicNumbers(n);
	}

	static void calculateHarmonicNumbers(double n) {
		double result = 0;
		for (double i = n; i > 0; i--) {
			result += (1 / i);
		}
		System.out.println(result);
	}

}
