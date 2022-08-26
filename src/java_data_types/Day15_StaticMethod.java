package java_data_types;

public class Day15_StaticMethod {

	public static void main(String[] args) {
		methodOne();
		Day15_StaticMethod aa = new Day15_StaticMethod();
		aa.methodTwo();
		aa.methodThree();
		
		String bb = aa.methodThree();
		System.out.println(bb);
	

	}
	public static void methodOne() {
		System.out.println("this is method 1 ");
	}
	public void methodTwo() {
		System.out.println("this is method 2 ");
	}
	public String methodThree() {
		return "hello";
		}

}
