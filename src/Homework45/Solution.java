package Homework45;

import java.util.Scanner;

public class Solution {

	public static int[][] createArray(Scanner scan, int row, int column) {
		int number;
		int array[][] = new int[row][column];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.println("Enter");
				number = scan.nextInt();
				array[i][j] = number;
			}
		}
		return array;
	}

	public static void main(String args[]) {
		// int arrayL[][] = { { 1, 3, 4 }, { 2, 4, 3 }, { 3, 4, 5 } };
		Scanner scan = new Scanner(System.in);
		int row, column;
		System.out.println("Enter row of array");
		row = scan.nextInt();
		System.out.println("Enter column of array");
		column = scan.nextInt();
		int array[][] = createArray(scan, row, column);

		System.out.println("Matrix without transpose:");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Printing Matrix After Transpose:");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[j][i] + " ");
			}
			System.out.println();// new line
		}
	}
}