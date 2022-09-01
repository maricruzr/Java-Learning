package java_data_types;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Day29_FileWritterExample {

	public static void main(String[] args) throws IOException {
		// step 1 : create an object of the file class
		File f = new File("C:\\Users\\maric\\eclipse-workspace\\Java_Basics\\data\\file.txt");
		// step 2 : create an object of the FileWriter class and pass the f object as argument
		FileWriter fw = new FileWriter(f);
		// step 3 : use the fw object to write in the file
		fw.write("hello today we are learning FileWriter class");
		fw.write("\n");
		fw.write("some more text.");
		//step 4 : we close the file at the end

		Scanner getInput = new Scanner(System.in);
		System.out.println("please enter text now ");
		String txt = getInput.next();
		fw.write("\n");
		fw.write(txt);
		fw.close();
		
		
		// Delete concept
		File ff = new File("C:\\Users\\maric\\eclipse-workspace\\Java_Basics\\data\\file3.txt");
		if(ff.exists()) {
			ff.delete();
		}else {
			System.out.println("no file with that name");
		}
		
		
		
		
		

	}

}
