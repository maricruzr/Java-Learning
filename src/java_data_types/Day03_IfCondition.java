package java_data_types;

public class Day03_IfCondition {

	public static void main(String[] args) {

		// true statement
		if (2 == 2) {
			System.out.println("the value is 2");
		}
		System.out.println("after the if statement");

		// false statement
		if (2 == 3) {
			System.out.println("the value is not 2");
		}

		// else
		int a = 31;
		if (a == 30) {
			System.out.println("the value of a is 30");
		} else {
			System.out.println("the value of a is not 30");
		}

		// task
		System.out.println("****compare 2 double values using if else statement****");
		double c = 25.25484747;
		double d = 30.5498425138;
		if (c >= d) {
			System.out.println("c is greater than d");
		} else {
			System.out.println("c is not greater than d");
		}

		System.out.println("**check if the number is positive or negative using if else statement**");
		int b = -5;
		if (b > 0) {
			System.out.println("the value is positive");
		} else {
			System.out.println("the value is negative");
		}

		// if else else if statement
		char value = 'e';
		if (value == 'a') {
			System.out.println("the value is a");
		} else if (value == 'b') {
			System.out.println("the value is b");
		} else if (value == 'c') {
			System.out.println("the value is c");
		} else if (value == 'd') {
			System.out.println("the va;ue is d");
		} else {
			System.out.println("the value is something else");
		}

		String happy = "sunday";
		if (happy == "monday") {
			System.out.println("value is Monday");
		} else if (happy == "tuesday") {
			System.out.println("value is Tuesday");
		} else if (happy == "wednesday") {
			System.out.println("value is Wednesday");
		} else if (happy == "thursday") {
			System.out.println("value is Thursday");
		} else if (happy == "friday") {
			System.out.println("value is Friday");
		} else if (happy == "saturday") {
			System.out.println("value is Saturday");
		} else if (happy == "sunday") {
			System.out.println("value is Sunday");
		} else {
			System.out.println("not happy any day of the week");
		}

		int day2 = 1;
		if (day2 == 1) {
			System.out.println("value is Monday");
		} else if (day2 == 2) {
			System.out.println("value is Tuesday");
		} else if (day2 == 3) {
			System.out.println("value is Wednesday");
		} else if (day2 == 4) {
			System.out.println("value is Thursday");
		} else if (day2 == 5) {
			System.out.println("value is Friday");
		} else if (day2 == 6) {
			System.out.println("value is Saturday");
		} else if (day2 == 7) {
			System.out.println("value is Sunday");
		} else {
			System.out.println("not happy any day of the week");
		}

		boolean isRaining = true;
		if (isRaining == true) {
			System.out.println("it is raining ");
		} else {
			System.out.println("it is not raining");
		}

	}

}
