package Homework41;

public class Solution {
	public static void main(String[] args) {
		int[] list = { 15, 12, 788, 1, -1, -778, 2, 0 };
		// findMaxAndMinItem(list); method that find min and max item in an array
		getNearestNumber(list, 5);
	}

	public static void findMaxAndMinItem(int[] array) {

		int min = array[0];
		int max = array[0];

		for (int item : array) {
			if (item < min) {
				min = item;
			}
			if (item > max) {
				max = item;
			}
		}
		System.out.println("Minimum value " + min);
		System.out.println("Maximum value " + max);
	}

	public static void getNearestNumber(int arr[], int number) {
		int min = arr[0];
		int max = arr[0];

		for (int i : arr) {
			if (i < number && (number - i < 0 ? (number - i) * -1 // i didn't create this code structure (!)
					: number - i) < (number - min < 0 ? (number - min) * -1 : number - min)) {
				min = i;
			}
			if (i > number && (number - i < 0 ? (number - i) * -1
					: number - i) < (number - min < 0 ? (number - min) * -1 : number - min)) {
				max = i;
			}
		}
		System.out.println("Entered number is " + number);
		System.out.println("The nearest number smaller than the entered number: " + min);
		System.out.println("The nearest number smaller than the entered number:" + max);
	}
}
