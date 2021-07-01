package Homework48;

import java.util.Random;
import java.util.Scanner;

public class MineSweeper {

	Scanner sc = new Scanner(System.in);

	public void run() {

		System.out.print("Enter number of raw :");
		int raw = sc.nextInt();
		System.out.print("Enter number of column :");
		int column = sc.nextInt();
		int numberOfMine = (raw * column) / 4;
		createDesign(raw, column, numberOfMine);
	}

	private void createDesign(int raw, int column, int numberOfMine) {
		String[][] matrix = new String[raw][column];
		int[] tempArr;
		for (int i = 0; i < raw; i++) {
			for (int j = 0; j < column; j++) {
				matrix[i][j] = "-";
			}
		}
		for (int i = 0; i < numberOfMine; i++) {
			do {
				tempArr = mayin(raw, column);

			} while (matrix[tempArr[0]][tempArr[1]].equals("*"));
			matrix[tempArr[0]][tempArr[1]] = "*";
		}

		System.out.println("Location of mines");

		for (int i = 0; i < raw; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.print("\n");
		}
		drawLine();
		start(matrix, raw, column);

	}

	public int[] mayin(int raw, int column) {
		Random rnd = new Random();
		int[] location = { rnd.nextInt(raw), rnd.nextInt(column) };
		return location;
	}

	public void drawLine() {
		System.out.println();
		System.out.println("____________________________________");
	}

	public void start(String[][] matrix, int raw, int column) {
		System.out.println("Welcome our game !");
		String[][] tempMatrix = new String[raw][column];
		for (int i = 0; i < raw; i++) {
			for (int j = 0; j < column; j++) {
				tempMatrix[i][j] = "-";
			}
		}
		boolean status = true;
		int count = 0;
		int r, c, info = 0;
		do {
			for (int i = 0; i < raw; i++) {
				for (int j = 0; j < column; j++) {
					System.out.print(tempMatrix[i][j] + " ");
				}
				System.out.print("\n");
			}

			do {
				System.out.print("Enter raw");
				r = sc.nextInt();
				System.out.print("Enter column ");
				c = sc.nextInt();
				if (r >= raw || c >= column) {
					System.err.println("Your number must not be greater than raw and column.Please try again ");
				}
			} while (r >= raw || c >= column);

			if (matrix[r][c].equals("*")) {
				System.err.println("Game Over!!");
				status = false;
			} else {
				info = 0;
				if (r - 1 >= 0) {
					if (matrix[r - 1][c].equals("*")) {
						info++;
					}
				}
				if (r - 1 >= 0 && c - 1 >= 0) {
					if (matrix[r - 1][c - 1].equals("*")) {
						info++;
					}
				}
				if (c - 1 >= 0) {
					if (matrix[r][c - 1].equals("*")) {
						info++;
					}
				}
				if (c + 1 < column) {
					if (matrix[r][c + 1].equals("*")) {
						info++;
					}
				}
				if (c + 1 < column && r + 1 < raw) {
					if (matrix[r + 1][c + 1].equals("*")) {
						info++;
					}
				}
				if (r + 1 < raw) {
					if (matrix[r + 1][c].equals("*")) {
						info++;
					}
				}
				if (r - 1 >= 0 && c + 1 < column) {
					if (matrix[r - 1][c + 1].equals("*")) {
						info++;
					}
				}
				if (r + 1 < raw && c - 1 >= 0) {
					if (matrix[r + 1][c - 1].equals("*")) {
						info++;
					}
				}
				tempMatrix[r][c] = String.valueOf(info);
				count++;
			}
			drawLine();
		} while (status && count < (raw * column) - ((raw * column) / 4));
		if (status) {
			System.out.println("You won :)");
			for (int i = 0; i < raw; i++) {
				for (int j = 0; j < column; j++) {
					if (tempMatrix[i][j].equals("-")) {
						System.out.print("* ");
					} else {
						System.out.print(tempMatrix[i][j] + " ");
					}
				}
				System.out.print("\n");
			}
		}
	}
}
