package java_data_types;

import java.util.Scanner;

public class Day07_Loops {

	public static void main(String[] args) {

		// for loop

		// incrementing
		System.out.println("before loop");
		for (int i = 1; i <= 10; i++) {
			System.out.println("hello world");
		}
		System.out.println("after loop ");
		// decrementing
		for (int i = 10; i >= 0; i--) {
			System.out.println(i);
		}
		System.out.println("******** task *************");

		System.out.println("print numbers from 1 to 100");
		for (int a = 1; a <= 100; a++) {
			System.out.println(a);
		}
		System.out.println("print numbers frm 100 to 1 ");
		for (int b = 100; b >= 0; b--) {
			System.out.println(b);
		}

		System.out.println("print even numbers between 20 and 50");
		for (int c = 20; c <= 50; c++) {
			if (c % 2 == 0) {
				System.out.println(c);
			}
		}

		System.out.println("print odd numbers between 20 and 50");
		for (int d = 21; d <= 50; d++) {
			if (d % 2 == 1) {
				System.out.println(d);
			}
		}

		System.out.println("let user input month they were born and base on that tell if they were born"
				+ " in winter summer spring or fall  make your program run 3 times ");
		
		System.out.println("using switch statement ");

		// this is the object of the scanner class
		Scanner takeInput = new Scanner(System.in);
		for (int i = 1; i <= 3; i++) {

			System.out.println("enter birth month :");
			String month = takeInput.next();
			switch (month) {
			case "january":
				System.out.println("winter");
				break;
			case "febuary":
				System.out.println("winter");
				break;
			case "march":
				System.out.println("winter");
				break;
			case "april":
				System.out.println("spring");
				break;
			case "may":
				System.out.println("spring");
				break;
			case "june":
				System.out.println("spring");
				break;
			case "july":
				System.out.println("summer");
				break;
			case "august":
				System.out.println("summer");
				break;
			case "september":
				System.out.println("summer");
				break;
			case "october":
				System.out.println("fall");
				break;
			case "november":
				System.out.println("fall");
				break;
			case "december":
				System.out.println("fall");
				break;
			default:
				System.out.println("you have entered an invalid month ");
			}
			System.out.println(" using if else statement ");
		}
		for (int i = 1; i <= 3; i++) {
			System.out.println("enter birth month : ");
			String monthName = takeInput.next();
			if (monthName.equalsIgnoreCase("january") || monthName.equalsIgnoreCase("febuary") || monthName.equalsIgnoreCase("march")) {
				System.out.println("winter");
			} else if (monthName.equalsIgnoreCase("april") || monthName.equalsIgnoreCase("may") || monthName.equalsIgnoreCase("june")) {
				System.out.println("spring");
			} else if (monthName.equalsIgnoreCase("july") || monthName.equalsIgnoreCase("august") || monthName.equalsIgnoreCase("september")) {
				System.out.println("summer");
			} else if (monthName.equalsIgnoreCase("october") || monthName.equalsIgnoreCase("november") || monthName.equalsIgnoreCase("december")) {
				System.out.println("fall");
			} else {
				System.out.println("invalid month entered :");
			}

		}
	}

}
