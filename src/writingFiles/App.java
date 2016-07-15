package writingFiles;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class App {

	public static void main(String[] args) {

		File file = new File("text.txt");
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
			bw.write("This is one line");
			bw.newLine();
			bw.write("This is another line");
			bw.newLine();
			bw.write("This is the last line");
			
		} catch (IOException e) {
			System.out.println("Unable to write file " + file.toString());
		}
	}

}
