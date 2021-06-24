package Homework44;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("What is your lenght of array ?");
		int lenght = scan.nextInt();
		int[] arr = new int[lenght];

		for (int i = 0; i < lenght; i++) {
			System.out.print("Enter number to add to integer array");
			arr[i] = scan.nextInt();
		}
		System.out.println("The lenght of array :" + lenght);
		showItemOfArray(arr);
		System.out.println("Sorted array\n");
		sortTheArray(arr, lenght);
		System.out.print("[ ");
		for (int i = 0; i < lenght; i++) {
			System.out.print(i == 0 ? arr[i] : "," + arr[i]);
		}
		System.out.println(" ]");
	}

	public static void sortTheArray(int[] arr, int lenght) {
		int temp;
		for (int i = 0; i < lenght - 1; i++) {
			for (int j = i + 1; j < lenght; j++) {
				if (arr[j] < arr[i]) {
					temp = arr[i]; // swap values
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public static void showItemOfArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i + 1 + ". item :" + arr[i]);
		}
	}
}
