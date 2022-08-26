package packageOne;

import packageTwo.ClassThree;

public class ClassOne {
	public int a1 = 10;
	private int b1 = 20;
	int c1 = 90;

	public static void main(String[] args) {
		ClassOne c1 = new ClassOne();
		c1.methodOne();
		System.out.println(c1.a1);

		ClassFour c4 = new ClassFour();
		System.out.println(c4.a4);
		// System.out.println(c4.b4);variable is not accessible because it is private

		ClassThree c3 = new ClassThree();
		c3.methodThree();
		System.out.println(c3.a3);
		// c3.methodFive(); not accessible method is private
		// System.out.println(c3.b3);not accessible variable is private
		// c3.methodEight(); not accessible because its present in different package
		// c3.c3 not accessible because its present in different package

		c1.methodFour();
		System.out.println(c1.b1);

		c1.methodSeven();
		System.out.println(c1.c1);

	}

	static void methodSeven() {
		System.out.println("this is method 7");
	}

	public static void methodOne() {
		System.out.println("this is method 1");
	}

	private static void methodFour() {
		System.out.println("this is method 4 ");
	}

}
