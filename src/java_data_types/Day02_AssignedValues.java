package java_data_types;

public class Day02_AssignedValues {
	// default value
	static int b;
	static char c;
	static double e;
	static float g;
	static boolean i;
	static String k;

	public static void main(String[] args) {
		// initializing a variable,
		// variable name is a and the value is 5
		int a = 5;
		// declared a variable b
		System.out.println(a);
		System.out.println(b);
		// initialize a char variable d
		char d = 'h';
		System.out.println(c);
		System.out.println(d);
		double f = 10.546841681631321684321354654132;
		System.out.println(e);
		System.out.println(f);
		float h = 10.65484355168465135486f;
		System.out.println(g);
		System.out.println(h);
		boolean j = true;
		System.out.println(i);
		System.out.println(j);
		String l = "Hello";
		System.out.println(k);
		System.out.println(l);

		// String concatenation
		String first_name = "Maricruz";
		String last_name = "Ortiz";
		System.out.println(first_name + last_name);

		// to add a space in between
		System.out.println(first_name + ' ' + last_name);
		System.out.println("Maricruz" + ' ' + "Ortiz");
		System.out.println(f + h);
		System.out.println("***********************");
		System.out.println("Arithematic Example");
		System.out.println("*************************");

		int value1 = 50;
		int value2 = 10;

		// addition
		System.out.println(value1 + value2);
		int sum = value1 + value2;
		System.out.println(sum);

		// subtraction
		System.out.println(value1 - value2);
		int sub = value1 - value2;
		System.out.println(sub);

		// division
		System.out.println(value1 / value2);
		int div = value1 / value2;
		System.out.println(div);

		// multiplication
		System.out.println(value1 * value2);
		int mul = value1 * value2;
		System.out.println(mul);

		// mod
		System.out.println(value1 % value2);
		int mod = value1 % value2;
		System.out.println(mod);

		System.out.println("***********************");
		System.out.println("Task");
		System.out.println("*************************");

		// write a java Write a Java program to print an int, double and char.
		int m = 2;
		System.out.println(m);
		double n = 10.2548541584684875;
		System.out.println(n);
		char o = 'c';
		System.out.println(o);

		// Write a program to add an integer variable having value 5 and a double
		// variable having value 6.2.
		int p = 5;
		double q = 6.2;
		System.out.println(p + q);

		// Write a program to find the square of the number 3.9.
		float r = 3.9f;
		System.out.println(r * r);

		// Write a program to print the area of a rectangle of sides 2 and 3
		// Area = Length x Width
		int length = 2;
		int width = 3;
		int area = length * width;
		System.out.println(area);

		System.out.println("***********************");
		System.out.println("Operators");
		System.out.println("*************************");

		int aa = 500;
		int bb = 600;

		// equals to
		System.out.println(aa == bb);
		boolean cc = aa == bb;
		System.out.println(cc);

		// not equal to
		System.out.println(aa != bb);
		boolean dd = aa != bb;
		System.out.println(dd);

		// greater than
		System.out.println(aa > bb);
		boolean ee = aa > bb;
		System.out.println(ee);

		// greater than or equal to
		System.out.println(200 >= 200);
		boolean ff = 200 >= 200;
		System.out.println(ff);

		// less than
		System.out.println(100 < 200);
		boolean gg = 100 < 200;
		System.out.println(gg);

		// less than or equal to
		System.out.println(2000 <= 300);
		boolean hh = 2000 <= 300;
		System.out.println(hh);

	}

}
