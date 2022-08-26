package java_data_types;

import java.util.Scanner;

public class Day05_Scanner {

	public static void main(String[] args) {
		// create an object / instance of the class

		// classname objectname = new classname();
		Scanner getInput = new Scanner(System.in);
		// getInput is the object of the Scanner class

		System.out.println("Enter the first value:");
		// Scanner class has methods which take the int value as input
		int aa = getInput.nextInt();

		System.out.println("Enter the second value:");
		int bb = getInput.nextInt();

		// ask question
		// store the value in the variable

		int cc = aa + bb;
		System.out.println("The sum is :" + cc);

	}

}
