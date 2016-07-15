package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Demo3 {

	public static void main(String[] args) {
		try {
			openFile();
		} catch (FileNotFoundException e) {
			System.out.println("Could not open file");
		}

	}

	private static void openFile() throws FileNotFoundException {
		File file = new File("example.txt");
		FileReader fr = new FileReader(file);
	}

}
