package readingFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
	public static void main(String[] args) throws FileNotFoundException {
		//String fileName = "C:/Users/me/Desktop/example.txt";
		String filename = "example.txt";
		
		File textfile = new File(filename);
		
		Scanner in = new Scanner(textfile);
		
		int value = in.nextInt();
		System.out.println("Read value: " + value);
		
		// .nextInt does not read the carriage return at the end
		in.nextLine();
		
		int count = 2;
		while (in.hasNextLine()) {
			String line = in.nextLine();
			
			System.out.println(count + ": " + line);
			count++;
		}
		in.close();
	}
}
