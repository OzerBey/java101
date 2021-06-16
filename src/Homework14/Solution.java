package Homework14;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter valid km value for trip");
		int kmOfTrip = scan.nextInt();
		System.out.println("Please enter your age");
		int age = scan.nextInt();
		System.out.print("Choose your trip type\n 1. One way\n 2. Round trip ");
		int choise = scan.nextInt();
		System.out.println("Trip fee: " + calculateDiscount(age, choise, kmOfTrip) + " ₺");

	}

	static float calculateDiscount(int age, int typeOfTrip, int km) {
		float result = 0;
		if (typeOfTrip == 1 || typeOfTrip == 2) {
			switch (typeOfTrip) {
			case 1:// just one way
				if (age <= 12) {
					result = (float) (calculateFee(km) - (calculateFee(km) * .5)); // 50% discount for age<=12
				} else if (age > 12 && age < 24) {
					result = (float) (calculateFee(km) - (calculateFee(km) * .1));// 10% discount for age>12 and age<24
				} else if (age > 65) {
					result = (float) (calculateFee(km) - (calculateFee(km) * .3));// 30% discount for age>65
				} else {
					result = calculateFee(km);
				}
				break;
			case 2: // round trip *_*extra 20% discount*_*
				if (age <= 12) {
					result = (float) (calculateFee(km) - (calculateFee(km) * .7)); // 50%+20% discount for age<=12
				} else if (age > 12 && age < 24) {
					result = (float) (calculateFee(km) - (calculateFee(km) * .3));// 10%+20% discount for age>12 and
																					// age<24
				} else if (age > 65) {
					result = (float) (calculateFee(km) - (calculateFee(km) * .5));// 30%+20% discount for age>65
				} else {
					result = calculateFee(km);
				}
				break;
			default:
				showAlertMessage();
				break;
			}
		} else {
			System.err.println("You entered Wrong Data!");
		}
		return result;
	}

	/*
	 * static boolean isGreaterThenZero(int number) { boolean result = true; if
	 * (number < 0) { result = false; } return result; }
	 */

	static float calculateFee(float km) { // total fees paid
		float result = (float) (km * .10);
		return result;
	}

	static void showAlertMessage() {
		System.err.println("Invalid value, Please try again! ");
	}

}
