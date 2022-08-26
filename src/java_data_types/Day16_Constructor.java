package java_data_types;

public class Day16_Constructor {

	Day16_Constructor() {
		System.out.println("login as admin ");
	}

	Day16_Constructor(String name) {
		System.out.println("logged in as : " + name);
	}

	Day16_Constructor(String name, String env) {
		System.out.println("logged in as : " + name);
		System.out.println("logged into : " + env);
	}

	Day16_Constructor(int value) {
		System.out.println("the value is : " + value);
	}
	void hello() {
		System.out.println("this is the hello method ");
	}

}
