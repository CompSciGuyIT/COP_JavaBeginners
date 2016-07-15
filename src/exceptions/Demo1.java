package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Demo1 {
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("example.txt");
		System.out.println(file.toString());
		
		FileReader fr = new FileReader(file);
		System.out.println("Finished.");
	}
}
