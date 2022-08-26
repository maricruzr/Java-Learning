package java_data_types;

public class Day12_moreReturnMethods {

	public static void main(String[] args) {
		int sum = task();// 95
		if (sum % 2 == 0) {
			System.out.println("the sum is even");
		} else {
			System.out.println("the sum is odd");
		}
		int sum2 = task2(4, 3);
		System.out.println(sum2);

		boolean a = itsRaining();
		System.out.println(a);
		
		System.out.println(name(" Maricruz ", "Ortiz"));

	}

	// non void method without parameters
	// write a method which is going to return the sum of 2 values
	// which is a=5 and b=90 if the mod is 0 we can print the sum is even number
	public static int task() {
		int a = 5;
		int b = 90;
		int sum = a + b;
		return sum;

	}

	public static int task2(int a, int b) {
		int sum = a + b;
		return sum;

	}

	public static boolean itsRaining() {
		return true;
	}
	public static String name(String f, String l) {
		return "my name is" +f+l;
	}

}
