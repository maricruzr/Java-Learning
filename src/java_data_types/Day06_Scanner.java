package java_data_types;

import java.util.Scanner;

public class Day06_Scanner {

	public static void main(String[] args) {
		// how to create an object
		// classname objectname = new classname();

		// nextInt : reads a int value from the user
		Scanner takeInput = new Scanner(System.in);
		System.out.println("enter the int value: ");
		int val1 = takeInput.nextInt();
		System.out.println("the entered value is :" + val1);

		// nextBoolean : reads a boolean value from user (true, flase)
		System.out.println("it is raining outside :");
		boolean val2 = takeInput.nextBoolean();// ture or false
		System.out.println("if its true its raining, if its false its not raining " + val2);

		// next : (String) reads a String value from user
		System.out.println("enter your name :");
		String name = takeInput.next();
		System.out.println("the name you entered is :" + name);

		// nextByte : reads a byte value from user
		System.out.println("enter your age :");
		byte age = takeInput.nextByte();
		System.out.println("age entered : " + age);

		// nextDouble : reads a double value from user
		System.out.println("enter your double value :");
		double val3 = takeInput.nextDouble();
		System.out.println("value entered is :" + val3);

		// nextFloat : reads a float value from user
		System.out.println("enter a float value :");
		float val4 = takeInput.nextFloat();
		System.out.println("value entered is :" + val4);

		// nextLong : reads a long value from user
		System.out.println("enter a long value");
		long val5 = takeInput.nextLong();
		System.out.println("value entered is : " + val5);

		// nextShort : reads a short value from user
		System.out.println(" enter a short value :");
		short val6 = takeInput.nextShort();
		System.out.println("value entered is :" + val6);

		//for fun

		System.out.println("enter first name :");
		String fname = takeInput.next();
		System.out.println("enter a color:");
		String color = takeInput.next();
		System.out.println("enter type of animal :");
		String animal = takeInput.next();
		System.out.println(fname + " likes " + color + ' ' + animal);

		// task : create a calculator

		System.out.println("enter first value :");
		int num1 = takeInput.nextInt();
		System.out.println("enter second value :");
		int num2 = takeInput.nextInt();
		System.out.println("what operator would you like to use ?");
		char op = takeInput.next().charAt(0);
		if (op == '+') {
			System.out.println(num1 + num2);
		} else if (op == '-') {
			System.out.println(num1 - num2);
		} else if (op == '/') {
			System.out.println(num1 / num2);
		} else if (op == '*') {
			System.out.println(num1 * num2);
		} else {
			System.out.println("error invalid operator ");
		}

	}

}
