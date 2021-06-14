package Homework3;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 1st edge of triangle");
		double firstEdge = scan.nextDouble();
		System.out.println("Enter 2nd edge of triangle");
		double secondEdge = scan.nextDouble();
		System.out.println("Enter 3rd edge of triangle");
		double thirdEdge = scan.nextDouble();

		double u = calculateU(firstEdge, thirdEdge, secondEdge);
		double perimeter = perimeterOfTriangle(thirdEdge, secondEdge, thirdEdge);
		System.out.println("Area of the triangle");
		System.out.println(calculateArea(u, firstEdge, secondEdge, thirdEdge));

	}

	static double calculateU(double a, double b, double c) {
		return ((a + b + c) / 2);
	}

	static double perimeterOfTriangle(double a, double b, double c) {
		return 2 * calculateU(a, b, c);
	}

	static double calculateArea(double u, double a, double b, double c) {
		double squareOfArea = u * (u - a) * (u - b) * (u - c);
		return Math.sqrt(squareOfArea);
	}

}
