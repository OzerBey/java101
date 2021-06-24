package Homework42;

public class Solution {
	public static void main(String[] args) {
		System.out.println("--Homework--");
		letterB();
		System.out.println("------------");
		letterY();
		System.out.println();
		letterA();
		System.out.println();
		letterS();
		System.out.println();
		letterI();
		System.out.println();
		letterN();
		System.out.println();
	}

	// homework
	private static void letterB() {
		String[][] letter = new String[7][4];

		for (int i = 0; i < letter.length; i++) {
			for (int j = 0; j < letter[i].length; j++) {
				if (i == 0 || i == 3 || i == 6) {
					letter[i][j] = " * ";

				} else if (j == 0 || j == 3) {
					letter[i][j] = " * ";
				} else {
					letter[i][j] = "   ";
				}
			}
		}

		for (String[] row : letter) {
			for (String col : row) {
				System.out.print(col);
			}
			System.out.println();
		}
	}

	private static void letterY() {
		String[][] letter = new String[6][4];

		for (int i = 0; i < letter.length; i++) {
			for (int j = 0; j < letter[i].length; j++) {
				if ((i < 4 && j == 0) || i == 3 || j == 3 || (i == 5)) {
					letter[i][j] = " = ";

				} else {
					letter[i][j] = "   ";
				}
			}
		}

		for (String[] row : letter) {
			for (String col : row) {
				System.out.print(col);
			}
			System.out.println();
		}
	}

	private static void letterA() {
		String[][] letter = new String[6][4];

		for (int i = 0; i < letter.length; i++) {
			for (int j = 0; j < letter[i].length; j++) {
				if (i == 0 || i == 2) {
					letter[i][j] = " = ";
				} else if (j == 0 || j == 3) {
					letter[i][j] = " = ";
				} else {
					letter[i][j] = "   ";
				}
			}
		}

		for (String[] row : letter) {
			for (String col : row) {
				System.out.print(col);
			}
			System.out.println();
		}
	}

	private static void letterS() {
		String[][] letter = new String[6][4];

		for (int i = 0; i < letter.length; i++) {
			for (int j = 0; j < letter[i].length; j++) {
				if (i == 0 || (i < 4 && j == 0) || i == 3 || (i > 3 && j == 3) || i == 5) {
					letter[i][j] = " = ";

				} else {
					letter[i][j] = "   ";
				}
			}
		}

		for (String[] row : letter) {
			for (String col : row) {
				System.out.print(col);
			}
			System.out.println();
		}
	}

	private static void letterI() {
		String[][] letter = new String[6][4];

		for (int i = 0; i < letter.length; i++) {
			for (int j = 0; j < letter[i].length; j++) {
				if (j == 2) {
					letter[i][j] = " = ";

				} else {
					letter[i][j] = "   ";
				}
			}
		}

		for (String[] row : letter) {
			for (String col : row) {
				System.out.print(col);
			}
			System.out.println();
		}
	}

	private static void letterN() {
		String[][] letter = new String[6][4];

		for (int i = 0; i < letter.length; i++) {
			for (int j = 0; j < letter[i].length; j++) {
				if (j == 0 || (i - 1 == j) || j == 3) {
					letter[i][j] = " = ";

				} else {
					letter[i][j] = "   ";
				}
			}
		}

		for (String[] row : letter) {
			for (String col : row) {
				System.out.print(col);
			}
			System.out.println();
		}
	}

}
