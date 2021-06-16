package Homework15;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your year of birth to learn Chinese Zodiac Sign ");
		int birthYear = scan.nextInt();
		getChineseZodiac(calculateChineseZodiac(birthYear));

	}

	static void getChineseZodiac(int number) {
		switch (number) {
		case 0:
			showChineseZodiacSign("Monkey");
			break;
		case 1:
			showChineseZodiacSign("Rooster");
			break;
		case 2:
			showChineseZodiacSign("Dog");
			break;
		case 3:
			showChineseZodiacSign("Pig");
			break;
		case 4:
			showChineseZodiacSign("Mice");
			break;
		case 5:
			showChineseZodiacSign("Ox");
			break;
		case 6:
			showChineseZodiacSign("Tiger");
			break;
		case 7:
			showChineseZodiacSign("Rabbit");
			break;
		case 8:
			showChineseZodiacSign("Dragon");
			break;
		case 9:
			showChineseZodiacSign("Snake");
			break;
		case 10:
			showChineseZodiacSign("Horse");
			break;
		case 11:
			showChineseZodiacSign("Sheep");
			break;
		default:
			System.out.println("You're so nice :)");
			break;
		}

	}

	static void showChineseZodiacSign(String zodiacSign) {
		System.out.println("Your Chinese Zodiac Sign :" + zodiacSign);
	}

	static int calculateChineseZodiac(int year) {
		int result;
		result = year % 12;
		return result;
	}
}
