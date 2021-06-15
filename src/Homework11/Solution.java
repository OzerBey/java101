package Homework11;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the air temperature ");
		int temperature = scan.nextInt();

		if (temperature < 5) {
			System.out.println("You should ski :)");
		} else if (temperature > 5 && temperature < 15) {
			System.out.println("You should go to cinema :)");
		} else if (temperature > 10 && temperature < 25) {
			System.out.println("You should go to picnic");
		} else if (temperature > 25) {
			System.out.println("You should go to swim in pool or sea :)");
		} else {
			System.err.println("It's so hot so you shouldn't go out");
		}

		// Extra solving (homework) - using ternary operator
		System.out
				.println(
						temperature < 5 ? "You should ski :)"
								: (temperature > 5) && (temperature < 10) ? "You should go to cinema :)"
										: temperature <= 10 ? "You should go to picnic"
												: temperature < 15 ? "You should go to cinema :)"
														: temperature < 25 ? "You should go to picnic"
																: temperature > 25
																		? "You should go to swim in pool or sea :)"
																		: "It's so hot so you shouldn't go out");
	}
}
