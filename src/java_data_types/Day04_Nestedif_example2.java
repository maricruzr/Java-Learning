package java_data_types;

public class Day04_Nestedif_example2 {

	public static void main(String[] args) {
		// if the person's age is less than 18 he can apply for learner permit
		// if the age is greater than 18 he can apply for driving license
		// if the age is greater than 21 he can start working
		// if the age is greater than 65 he is ready to retire

		int age = 68;
		String name = "John";
		if (age < 18) {
			System.out.println(name + " can apply for a lerners permit");
		} else {
			System.out.println(name + " is greater than age 18, he can apply for driving license ");
			if (age < 21) {
				System.out.println(name + " is less than 21, you are not ready to work");
			} else {
				System.out.println(name + " is greater than 21, you can start working");
				if (age < 65) {
					System.out.println(name + " can continue to work");
				} else {
					System.out.println(name + " is ready to retire");
				}
			}
		}

		// crystals rose_quartz, smokey_quartz, clear_quartz
		// shape sphere, tower

		String crystal = "smokey_quartz";
		String shape = "tower";

		if (crystal == "rose_quartz") {
			System.out.println("crystal is rose quartz");
			if (shape == "shpere") {
				System.out.println("shape is sphere");
			} else if (shape == "tower") {
				System.out.println("shape is tower ");
			} else {
				System.out.println("crystal is a freeform");
			}
		} else if (crystal == "smokey_quartz") {
			System.out.println(" crystal is smokey quartz");
			if (shape == "sphere") {
				System.out.println("shape is sphere");
			} else if (shape == "tower") {
				System.out.println("shape is tower");
			} else {
				System.out.println("crystal is a freeform");
			}
		} else if (crystal == "clear_quartz") {
			System.out.println("crystal is clear quartz");
			if (shape == "sphere") {
				System.out.println("shape is sphere");
			} else if (shape == "tower") {
				System.out.println("shape is tower");
			} else {
				System.out.println("crystal is a freeform");
			}
		}

	}

}
