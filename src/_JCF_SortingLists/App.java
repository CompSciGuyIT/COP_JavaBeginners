package _JCF_SortingLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

class Person{
	private int id;
	private String name;
	
	Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return id + ": " + name;
	}
	
	
}
class StringLengthComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {

		int len1 = s1.length();
		int len2 = s2.length();
		
		if (len1 > len2)
			return 1;
		else if (len1 < len2)
			return -1;
		return 0;
	}
}

class AlphabeticalComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {

		return s1.compareTo(s2);
	}
}

class ReverseAlphabeticalComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {

		return -s1.compareTo(s2);
	}
}

public class App {

	public static void main(String[] args) {

        ////////////////////// Sorting Strings ////////////////////////////////
		List<String> animals = new ArrayList<String>();

		animals.add("flea");
		animals.add("snale");
		animals.add("dog");
		animals.add("wolf");
		animals.add("cat");
		animals.add("dingo");
		animals.add("fish");

		Collections.sort(animals, new StringLengthComparator());
		System.out.println("Stringlength");
		for (String animal: animals) {
			System.out.println(animal);
		}
		System.out.println();

		Collections.sort(animals, new AlphabeticalComparator());
		System.out.println("Alphabetical");
		for (String animal: animals) {
			System.out.println(animal);
		}
		System.out.println();

		Collections.sort(animals, new ReverseAlphabeticalComparator());
		System.out.println("Reverse Alphabetical");
		for (String animal: animals) {
			System.out.println(animal);
		}
		System.out.println();
		
        ////////////////////// Sorting Numbers ////////////////////////////////
		List<Integer> numbers = new ArrayList<Integer>();

		numbers.add(5);
		numbers.add(23);
		numbers.add(14);
		numbers.add(56);
		numbers.add(3);
		numbers.add(45);
		numbers.add(21);
		
		Collections.sort(numbers);
		
		for (Integer number: numbers) {
			System.out.println(number);
		}
		System.out.println();
		
		// Reverse numerical using an anonymous class
		Collections.sort(numbers, new Comparator<Integer>() {

			@Override
			public int compare(Integer num1, Integer num2) {
				return -num1.compareTo(num2);
			}
		});
		
		for (Integer number: numbers) {
			System.out.println(number);
		}
		System.out.println();
		
        ////////////////////// Sorting Arbitrary Objects ////////////////////////////////
	
		List<Person> people = new LinkedList<Person>();
		
		people.add(new Person(1, "Joe"));
		people.add(new Person(3, "Mary"));
		people.add(new Person(4, "Jane"));
		people.add(new Person(2, "Steve"));
		
		System.out.println("Original order");
		for (Person person: people)
			System.out.println(person);
		System.out.println();
		
		// Sort by ID
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person p1, Person p2) {
				if (p1.getId() > p2.getId())
					return 1;
				else if (p1.getId() < p2.getId())
					return -1;
				return 0;
			}
		});
		
		System.out.println("Sort by ID");
		for (Person person: people)
			System.out.println(person);
		System.out.println();
		
		// Sort by Name
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person p1, Person p2) {
				return p1.getName().compareTo(p2.getName());
			}
		});
		
		System.out.println("Compare by Name");
		for (Person person: people)
			System.out.println(person);
		
	}

}
