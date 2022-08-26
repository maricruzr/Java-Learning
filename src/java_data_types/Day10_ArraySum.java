package java_data_types;

public class Day10_ArraySum {

	public static void main(String[] args) {

		// how to get the sum of array

		int[] numbers = { 2, 3, 4, 5, 6, 7 };
		int sum = 0;

		for (int a = 0; a < numbers.length; a++) {
			sum = sum + numbers[a];
		}
		System.out.println("the sum is : " + sum);

	}

}
