package java_data_types;

import java.util.Scanner;

public class Day10_task {

	public static void main(String[] args) {

		// task write a program which asks user that how many values they want to do a
		// sum for?
		// lets say user enters 5
		// it should ask user to enter those 5 values
		// once the user enters those 5 values it should print the sum of those 5 values
		// scanner, single dimension array, for loop
		int values;
		Scanner takeInput = new Scanner(System.in);
		System.out.println("how many values would you like to sum ? ");
		values = takeInput.nextInt();
		int[] vals = new int[values];

		for (int a = 0; a < values; a++) {
			System.out.println("enter the " + (a + 1) + " value");
			vals[a] = takeInput.nextInt();
		}
		int sum = 0;
		
		for (int a = 0; a < vals.length; a++) {
			sum = sum + vals[a];
		}
		System.out.println("the sum is : " + sum);

	}

}
