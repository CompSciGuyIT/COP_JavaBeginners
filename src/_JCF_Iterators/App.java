package _JCF_Iterators;

import java.util.Iterator;
import java.util.LinkedList;

public class App {

	public static void main(String[] args) {

		LinkedList<String> animals = new LinkedList<String>();

		animals.add("fox");
		animals.add("bear");
		animals.add("whale");
		animals.add("penguin");
		animals.add("beaver");
		
		// Pre-Java 5 way of iterating through a list
		// Allows you to remove an item from the list as you iterate through it
		// aomething that cannot be done in a normal for-each loop
		Iterator<String> it = animals.iterator();
		
		while(it.hasNext()) {
			String value = it.next();
			System.out.println(value);
			
			if (value.equals("whale")) {
				it.remove();
			}
		}
		
		System.out.println();
		
		// Modern iteration, Java 5 and above
		for (String animal: animals) {
			System.out.println(animal);
		}
	}

}
