package Homework40;

public class Solution {
	public static void main(String[] args) {
		float array[] = { 1.0f, 2.0f, 3.0f }; // 1+(1/2)+(1/3)..
		float result = harmicSeries(array, array.length);
		// System.err.println(array.length);
		System.out.println(result);

	}

	public static float harmicSeries(float array[], int n) {
		float sum = 0;
		for (float i : array) {
			sum += 1 / i;
		}
		return n / sum;
	}
}
