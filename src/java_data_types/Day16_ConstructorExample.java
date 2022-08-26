package java_data_types;

public class Day16_ConstructorExample {

	public static void main(String[] args) {
		//instantiating
		// created a new instance
		// created the object of the class
		Day16_Constructor cons = new Day16_Constructor();
		Day16_Constructor para_cons = new Day16_Constructor("administrator");
		Day16_Constructor para_cons2 = new Day16_Constructor("editor");
		Day16_Constructor twoPara_cons = new Day16_Constructor("admin", "qa.codegator.us");
		Day16_Constructor int_cons = new Day16_Constructor(1000);
		
		// calling the method
		cons.hello();
		para_cons.hello();
		//class reference when method is declared static
		//Day16_Constructor.hello();

	}

}
