package Homework7;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter kilograms of pear");
		float pear = scan.nextFloat();
		System.out.println("Enter kilograms of apple");
		float apple = scan.nextFloat();
		System.out.println("Enter kilograms of tomatoe");
		float tomatoe = scan.nextFloat();
		System.out.println("Enter kilograms of banana");
		float banana = scan.nextFloat();
		System.out.println("Enter kilograms of eggplant");
		float eggplant = scan.nextFloat();
		System.out.println("Total: " + totalFee(pear, apple, tomatoe, banana, eggplant) + " ₺");// 12.87

	}

	static float totalFee(float pear, float apple, float tomatoe, float banana, float eggplant) {
		float result = feeOfPear(pear) + feeOfApple(apple) + feeOfTomatoe(tomatoe) + feeOfBanana(banana)
				+ feeOfEggplant(eggplant);
		return result;
	}

	static float feeOfPear(float kg) {
		return (float) (kg * 2.14);
	}

	static float feeOfApple(float kg) {
		return (float) (kg * 3.67);
	}

	static float feeOfTomatoe(float kg) {
		return (float) (kg * 1.11);
	}

	static float feeOfBanana(float kg) {
		return (float) (kg * .95);
	}

	static float feeOfEggplant(float kg) {
		return (float) (kg * 5.00);
	}
}
