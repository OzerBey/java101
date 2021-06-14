package Homework4;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter km value");
		float km = scan.nextFloat();
		System.out.println(calculateTaximeter(km) + "₺");

	}

	static float calculateTaximeter(float km) {
		float starter = (float) 10.0;
		float fee = (float) (km * 2.20);
		float result = starter + fee;
		if (isProvide(result)) {
			return (float) 20.0;
		}
		return result;
	}

	static boolean isProvide(float fee) {

		boolean result = false;
		if (fee <= 20) {
			result = true;
		}
		return result;
	}

}
