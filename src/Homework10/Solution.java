package Homework10;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// for math
		System.out.println("Enter your Math grades (1st and 2nd grade)");
		int mathGrade1 = scan.nextInt();
		int mathGrade2 = scan.nextInt();
		int averageMath = calculateAverage(mathGrade1, mathGrade2);
		showGradeAverage(averageMath);
		showIsPass(isPass(averageMath));

		// for physics
		System.out.println("Enter your Physics grades (1st and 2nd grade)");
		int physicsGrade1 = scan.nextInt();
		int physicsGrade2 = scan.nextInt();
		int averagePhysic = calculateAverage(physicsGrade1, physicsGrade2);
		showGradeAverage(averagePhysic);
		showIsPass(isPass(averagePhysic));

		// for turkish
		System.out.println("Enter your Turkish grades (1st and 2nd grade)");
		int turkishGrade1 = scan.nextInt();
		int turkishGrade2 = scan.nextInt();
		int averageTurkish = calculateAverage(turkishGrade1, turkishGrade2);
		showGradeAverage(averageTurkish);
		showIsPass(isPass(averageTurkish));

		// for chemistry
		System.out.println("Enter your Chemistry grades (1st and 2nd grade)");
		int chemistryGrade1 = scan.nextInt();
		int chemistryGrade2 = scan.nextInt();
		int averageChemistry = calculateAverage(chemistryGrade1, chemistryGrade2);
		showGradeAverage(averageChemistry);
		showIsPass(isPass(averageChemistry));

		// for music
		System.out.println("Enter your Music grades (1st and 2nd grade)");
		int musicGrade1 = scan.nextInt();
		int musicGrade2 = scan.nextInt();
		int averageMusic = calculateAverage(musicGrade1, musicGrade2);
		showGradeAverage(averageMusic);
		showIsPass(isPass(averageMusic));
	}

	public static int calculateAverage(int grade1, int grade2) {
		int result = 0;
		if (isValid(grade1) && isValid(grade2)) {
			result = (grade1 + grade2) / 2;
		} else {
			System.err.println("Please enter valid grade (The grades must be 0-100 between)");
		}
		return result;
	}

	public static boolean isValid(int grade) {
		boolean result = false;
		if (grade >= 0 && grade <= 100) {
			result = true;
		}
		return result;
	}

	public static void showGradeAverage(int result) {
		System.out.println("Average: " + result);
	}

	public static boolean isPass(int averageGrade) {
		boolean result = false;

		if (averageGrade >= 55) {
			result = true;
		}
		return result;
	}

	public static void showIsPass(boolean isPass) {
		if (isPass) {
			System.out.println("Is pass :" + true);
		} else {
			System.err.println("Is pass: " + false);
		}
	}

}
