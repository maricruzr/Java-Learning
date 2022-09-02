package java_data_types;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Day30_AdvancedLoop {

	public static void main(String[] args) throws IOException {
		String[] names = {"john", "steve", "mike", "chris"};
		//advanced loop
		for(String name : names) {
			System.out.println(name);
		}
		
		File folder = new File("C:\\Users\\maric\\eclipse-workspace\\Java_Basics\\data");
		File[] files = folder.listFiles();
		for(File f : files) {
			System.out.println(f.getName());
			if(f.getName().endsWith(".txt")) {
				f.delete();
			}
		}
		File file = new File("C:\\Users\\maric\\eclipse-workspace\\Java_Basics\\data\\testFile.txt");
		FileWriter fw = new FileWriter(file);
		fw.write("hello");
		fw.close();
		
		File NewFile = new File("C:\\Users\\maric\\eclipse-workspace\\Java_Basics\\data\\testFile-new.txt");
		if(file.exists()) {
			file.renameTo(NewFile);
		}else {
			System.out.println("no file renamed");
		}
		
		

	}

}
