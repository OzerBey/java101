package Homework6;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your weight in kilograms");
		float weight = scan.nextFloat();
		System.out.println("Enter your height in centimeters");
		float height = scan.nextFloat();
		System.out.println("BMI:" + calculateBodyMassIndex(weight, height) + " kg/m²");
	}

	static float calculateBodyMassIndex(float weight, float height) {
		return (weight / (height / 100 * height / 100));
	}

}
