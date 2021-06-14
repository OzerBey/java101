package Homework5;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a radius value");
		float r = scan.nextFloat();
		System.out.println("Enter a angle value");
		int angle = scan.nextInt();
		System.out.println(area(r, angle));
	}

	// Extras
	static float calculateAreaOfCircle(float r) {
		float result = (float) (3.14 * (r * r));
		return result;
	}

	static float calculatePerimeterOfCircle(float r) {
		return (float) (2 * 3.14 * r);
	}

	// homework method
	static float area(float r, int angle) {
		return (calculateAreaOfCircle(r) * angle) / 360;
	}

}
