package _JCF_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		// Adding
		numbers.add(35);
		numbers.add(43);
		numbers.add(56);
		
		// Retrieving
		System.out.println(numbers.get(0));
		
		System.out.println("\nIteration #1: ");
		// Indexed For loop iteration
		for (int i = 0; i < numbers.size(); i++)
			System.out.println(numbers.get(i));
		
		// Removing items
		numbers.remove(numbers.size() - 1);
		
		// Slow removing from front of arraylist when it is large
		numbers.remove(0);
		
		System.out.println("\nIteration #2: ");
		for (Integer value: numbers)
			System.out.println(value);
		
		// List interface
		List<String> values = new ArrayList<String>();

	}

}
