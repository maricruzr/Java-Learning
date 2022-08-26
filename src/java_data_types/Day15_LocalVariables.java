package java_data_types;

public class Day15_LocalVariables {

	public static void main(String[] args) {
		// local variable
		int age = 10;
		String name = "john";
		float temp = 45.88f;
		
		System.out.println(age);
		System.out.println(name);
		System.out.println(temp);
		
		Day15_LocalVariables a = new Day15_LocalVariables ();
		a.possible();
		
		if(true) {
			//local variable
			int b =40;
			System.out.println(b);
		}

	}
	public static void possible() {
		
		//local variable
		String environment = "qa.codegator.us";
		String username = "test@gmail.com";
		String password = "Welcome1";
		System.out.println(environment);
		System.out.println(username);
		System.out.println(password);
	}

}
