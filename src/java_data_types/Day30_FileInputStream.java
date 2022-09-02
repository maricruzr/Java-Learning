package java_data_types;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Day30_FileInputStream {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\maric\\eclipse-workspace\\Java_Basics\\data\\fis.txt");
		FileInputStream fis = new FileInputStream(file);
		int a = 0;
		while((a=fis.read()) != -1) {
			System.out.println((char)a);
		}
		FileOutputStream fos = new FileOutputStream("C:\\Users\\maric\\eclipse-workspace\\Java_Basics\\data\\fos.txt");
		String text="hello world";
		byte[] textvalue = text.getBytes();
		fos.write(textvalue);
		fos.close();
		
		
		

	}

}
