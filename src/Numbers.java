
import java.util.ArrayList;
import java.util.Scanner;

/*
 @author Yasin Ozer
In a console application, ask the user to enter a positive number(n).
Then ask the user to enter n positive numbers.
Print the even numbers that the user has entered to the console.
 */
public class Numbers {
	static ArrayList<Integer> list = new ArrayList<Integer>();

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a positive number");
		int choise = scan.nextInt();
		isPostiveNumber(choise);
		int number;
		for (int i = 0; i < choise; i++) {
			System.out.println("Please enter positive number");
			number = scan.nextInt();
			isPostiveNumber(number);
			addIfEven(number);
		}
		showEvenNumbers();// list the even numbers
	}

	static void showEvenNumbers() {
		for (int item : list) {
			System.out.println(item);
		}
	}

	static void addIfEven(int number) {
		if (number % 2 == 0) {
			list.add(number);
			System.out.println("The number is even so added to list");
		} else {
			System.err.println("The number is not even! Please enter even number ");
		}
	}

	static boolean isPostiveNumber(int enNumber) {
		boolean result = false;
		if (enNumber > 0) {
			result = true;
		} else {
			System.err.println("it's not a positive number! Please enter positive number");
		}
		return result;
	}
}
