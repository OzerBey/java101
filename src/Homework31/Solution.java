package Homework31;

public class Solution {
	public static void main(String[] args) {

		int n = 10, firstTerm = 0, secondTerm = 1;
		System.out.println("Fibonacci Series first 10 items :");

		for (int i = 1; i <= n; ++i) {
			if (i != n) {
				System.out.print(firstTerm + ", ");
			} else {
				System.out.print(firstTerm);
			}
			int temp = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = temp;
		}
	}
}