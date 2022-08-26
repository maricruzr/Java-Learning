package java_data_types;

public class Day19_This_Keyword {
	int rollnum;
	String name;
	float fee;

	Day19_This_Keyword() {
		System.out.println("this is a default constructor ");
	}
	
	Day19_This_Keyword(int rollnum){
		this();
		System.out.println("this is a 1 parameter constructor "+rollnum);
	}

	Day19_This_Keyword(int rollnum, String name, float fee) {
		// can be used to invoke current class constructor
		this(333);
		this.rollnum = rollnum;
		this.name = name;
		this.fee = fee;

	}

	void displayData() {
		System.out.println("roll number : " + rollnum);
		System.out.println("name : " + name);
		System.out.println("fee : " + fee);
	}

}
