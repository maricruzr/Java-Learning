package java_data_types;

public class Day11_Methods {

	// main method
	public static void main(String[] args) {
		sample();
		hello();
		sum();
		add(5, 4);
		add(20, 50);

	}

	// user defined method without a parameter
	public static void sample() {
		System.out.println("hello world");

	}

	public static void hello() {
		System.out.println("today we are learning methods");
	}

	public static void sum() {
		int a = 5;
		int b = 10;
		System.out.println(a + b);
	}

	// user defined methods with parameters
	public static void add(int a, int b) {
		System.out.println(a + b);
	}

}
