package java_data_types;

public class Day12_Methods {

	public static void main(String[] args) {
		name();

		// argument
		name2("john");
		name2("sam");
		name2("alex");
		
		name3("vero", 11);
		name3("noel", 29);
		name3("maricruz", 27);
		
		String a = day();// in return its going to give me String value
		System.out.println(a);
		
		String b = month();
		System.out.println(b);
		
		int c = age();
		System.out.println(c);
		
		String value = topic("void and non void methods");
		System.out.println(value);
		//or
		System.out.println(topic("parameterized and non parameterized methods" ));
	}

	// method without parameter
	public static void name() {
		System.out.println("my name is maricruz ortiz");
	}

	// method with parameter
	public static void name2(String a) {
		System.out.println("my name is " + a);
	}

	// method with 2 parameters
	public static void name3(String name, int age) {
		System.out.println(name + " is " + age + " years old.");
	}

	//non void method without parameter ( return values)
	public static String day() {
		String todaysDay = "tuesday";
		return todaysDay;
	}

	public static String month() {
		return "august";
	}
	//task
	public static int age() {
		return 27;
	}
	//non void method with parameter
	public static String topic(String a) {
		return"today we are learning "+a;
	}
	
}
