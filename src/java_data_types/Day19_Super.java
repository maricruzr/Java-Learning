package java_data_types;

class Phone1 { // parent class (sub class)
	String make = "Apple";
	String color = "black";
	
	void hello() { // method in parent class
		System.out.println("this method is from parent class ");
	}
}
class SmartPhone extends Phone1 { // child class (sub class)
	String make ="Samsung";
	String color ="yellow";
	
	void hello() { // method in child class
		System.out.println("this method is from child class ");
	}
	void displayChildMake() { // method in child class
		super.hello();
		System.out.println("the phone is : "+make);
		System.out.println("the color is : "+color);
	}
	void displayParentMembers() { // method in child class
		System.out.println("the phone in parent class is : "+super.make);
		System.out.println("the color in parent class is : "+super.color);
	}
}
public class Day19_Super { // main class (public class)

	public static void main(String[] args) { // main method in main class 
		SmartPhone a = new SmartPhone();
		a.displayChildMake();
		a.displayParentMembers();

	}

}
