package java_data_types;

public class Day10_2DArray {

	public static void main(String[] args) {

		// two dimensional arrays
		String[][] countries = new String[2][2];
		countries[0][0] = "usa";
		countries[0][1] = "canada";
		countries[1][0] = "switzerland";
		countries[1][1] = "france";
		System.out.println(countries[1][1]);
		System.out.println(countries[1][0]);

		// other way to create
		String[][] _countries = { { "usa", "canada" }, { "france", "switzerland", "china" }, { "germany", "england" } };
		System.out.println(_countries[1][1]);
		System.out.println(_countries[2][1]);

		// how to print with loop
		for (int rows = 0; rows < _countries.length; rows++) {
			for (int column = 0; column < _countries[rows].length; column++) {
				System.out.println(_countries[rows][column]);
			}
		}

		// own example
		int[][] num = new int[3][3];
		num[0][0] = 1010;
		num[0][1] = 1020;
		num[0][2] = 1030;
		num[1][0] = 1040;
		num[1][1] = 1050;
		num[1][2] = 1060;
		num[2][0] = 1070;
		num[2][1] = 1080;
		num[2][2] = 1090;
		System.out.println(num[2][0]);

		// other way
		int[][] number = { { 1010, 1020, 1030 }, { 1040, 1050, 1060 }, { 1070, 1080, 1090 } };
		System.out.println(number[2][1]);

		// to print with loop
		for (int rows = 0; rows < num.length; rows++) {
			for (int column = 0; column < num[rows].length; column++) {
				System.out.println(num[rows][column]);
			}
		}
		// task write a program which asks user that how many values they want to do a sum for?
		// lets say user enters 5
		// it should ask user to enter those 5 values
		//once the user enters those 5 values it should print the sum of those 5 values 
		//scanner, single dimension array, for loop
		
		

	}

}
