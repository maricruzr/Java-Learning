package java_data_types;

public class Day16_Student_Child extends Day16_Faculty_Parent {
	int bonus = 2000;

	public static void main(String[] args) {

		Day16_Student_Child a = new Day16_Student_Child();
		System.out.println(a.salary);
		System.out.println(a.bonus);
		a.hello();

	}

}
