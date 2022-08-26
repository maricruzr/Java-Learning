package java_data_types;

public class Day09_Arrays {

	public static void main(String[] args) {

		int a; // declare the variable
		a = 50; // initialize the variable
		System.out.println(a);

		// int[] rollNumber;// declare an array variable
		// rollNumber = new int[5];

		int[] _rollNumber = new int[5];
		_rollNumber[0] = 500;
		_rollNumber[1] = 300;
		_rollNumber[2] = 100;
		_rollNumber[3] = 400;
		_rollNumber[4] = 200;

		System.out.println(_rollNumber[4]);

		System.out.println("*********task**********");
		// create an array of String and store student names in different indeces
		String[] sName = new String[8];
		sName[0] = "maricruz";
		sName[1] = "noel";
		sName[2] = "lesly";
		sName[3] = "kenny";
		sName[4] = "gary";
		sName[5] = "waqas";
		sName[6] = "ruth";
		sName[7] = "veronica";
		System.out.println(sName[7]);

		// second way to create array
		int[] rollnum = { 100, 200, 300, 400, 500 };
		System.out.println(rollnum[3]);
		// example 2 based on task
		String[] name = { "maricruz", "noel", "lesly", "kenny", "gary", "waqas", "ruth", "veronica" };
		System.out.println(name[0]);
		// to find length of array
		System.out.println(name.length);
		
		for(int i=0; i<rollnum.length;i++) {
			System.out.println(rollnum[i]);
		}
		// task for loop 
		for(int c=0; c<name.length; c++) {
			System.out.println(name[c]);
		}
		
		char[] grade = { 'a','b', 'c', 'd', 'f'};
		System.out.println(grade[0]);
		for(int g =0; g< grade.length; g++) {
			System.out.println(grade[g]);
		}

	}

}
