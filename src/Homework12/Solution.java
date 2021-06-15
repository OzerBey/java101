package Homework12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int array[] = new int[3];
		ArrayList<Integer> integerArray = new ArrayList<Integer>();

		// create integer array
		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter a number");
			int number = scan.nextInt();
			array[i] = number;
			integerArray.add(number);
		}
		// System.out.println(Arrays.toString(sortArray(array)));
		System.out.println("Sorted list");
		sortNumbers(integerArray);
	}

	public static void sortNumbers(ArrayList<Integer> array) {
		Collections.sort(array);
		for (Integer integer : array) {
			System.out.print(integer + " ");
		}
	}

	public static int[] sortArray(int[] array) {

		for (int i = 0; i < array.length - 1; i++) {

			if (array[i] > array[i + 1]) {
				int temp = array[i];
				array[i] = array[i + 1];
				array[i + 1] = temp;

				i = -1;
			}
		}
		return array;
	}
}
