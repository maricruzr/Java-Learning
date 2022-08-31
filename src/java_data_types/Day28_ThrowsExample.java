package java_data_types;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Day28_ThrowsExample {

	public static void main(String[] args) {
		try {
			validateAge(21);
			validateAge(18);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void validateAge(int age) throws Exception  {
		if(age<18) {
			throw new Exception("age is less than 18");
		}else if(age>=18) {
			System.out.println("allowed");
		}
		
	}
	
	public static void writeInFile() throws FileNotFoundException {
		String file = "C:\\Users\\codegator\\file1.txt";
		FileInputStream fis = new FileInputStream(file);
	}

}
