import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Day29_FileReaderExample {

	public static void main(String[] args) throws IOException  {
		File f = new File("C:\\Users\\maric\\eclipse-workspace\\Java_Basics\\data\\file.txt");
		FileReader fr = new FileReader(f);
		int value = 0;
		while((value = fr.read()) != -1){
			System.out.println((char)value);
		}
		fr.close();

	}

}
