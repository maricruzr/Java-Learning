package packageOne;

class ClassFour {
	public int a4 = 50;
	private int b4 = 80;
	
	private static void methodSix() {
		System.out.println("this is method 6");
	}
}

public class ClassTwo {
	public int a2 = 20;

	public static void main(String[] args) {
		ClassOne c2 = new ClassOne();
		c2.methodOne();
		System.out.println(c2.a1);
		// c2.methodFour(); this method is not accessible because it is private
		// System.out.println(c2.b1);this variable is not accessible because it is
		// private
		c2.methodSeven();
		System.out.println(c2.c1);

	}

	public static void methodTwo() {
		System.out.println("this is method 2");
	}

}
