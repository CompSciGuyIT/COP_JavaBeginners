package exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class Demo4 {

	public static void main(String[] args) {
		Test test = new Test();
		
		// Multiple try/catch blocks
		try {
			test.run();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ParseException e1) {
			System.out.println("Could not parse line file.");
		}
		
		// try multi-catch 
		try {
			test.run();
		} catch (IOException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Using polymorphism to catch the parent of all exeptions
		try {
			test.run();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		// Important to catch exceptions in the right order!
        // IOException cannot come first, because it's the parent
        // of FileNotFoundException, so would catch both exceptions
        // in this case.
		try {
			test.input();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}

}
