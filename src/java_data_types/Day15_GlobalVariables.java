package java_data_types;

public class Day15_GlobalVariables {
// global variable
	String phone = "Iphone";
	String color = "black";
	static int memory = 32;

	public static void main(String[] args) {
		Day15_GlobalVariables johnsPhone = new Day15_GlobalVariables();
		System.out.println(johnsPhone.phone);
		System.out.println(johnsPhone.color);
		System.out.println(johnsPhone.memory);//32

		Day15_GlobalVariables stevesPhone = new Day15_GlobalVariables();
		stevesPhone.phone = "Iphone 13 ";
		stevesPhone.color = "red";
		stevesPhone.memory = 64;
		System.out.println(stevesPhone.phone);
		System.out.println(stevesPhone.color);
		System.out.println(stevesPhone.memory);//64

		Day15_GlobalVariables mikesPhone = new Day15_GlobalVariables();
		System.out.println(mikesPhone.phone);
		System.out.println(mikesPhone.color);
		System.out.println(mikesPhone.memory);//64

		Day15_GlobalVariables vinsPhone = new Day15_GlobalVariables();
		vinsPhone.possible();
	}

	public static void possible() {
		Day15_GlobalVariables vinsPhone = new Day15_GlobalVariables();
		vinsPhone.phone = "Iphone 12 ";
		vinsPhone.color = "grey ";
		System.out.println(vinsPhone.phone);
		System.out.println(vinsPhone.color);
		System.out.println(vinsPhone.memory);//64
	}

}
