package _JCF_NaturalOrdering;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

class Person implements Comparable<Person>{
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int compareTo(Person person) {
        int len1 = name.length();
        int len2 = person.name.length();
        
        if(len1 > len2) {
            return 1;
        }
        else if(len1 < len2) {
            return -1;
        }
        else {
            return name.compareTo(person.name);
        }
	}
}

public class App {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		SortedSet<String> set = new TreeSet<String>();
		
		List<Person> personList = new ArrayList<Person>();
		SortedSet<Person> personSet = new TreeSet<Person>();
		
		addElements(list);
		addElements(set);
		addPersonElements(personList);
		addPersonElements(personSet);
		
		Collections.sort(list);
		
		System.out.println("*** List ***");
		showElements(list);
		System.out.println();
		System.out.println("*** Set ***");
		showElements(set);		
		
		System.out.println("*** PersonList ***");
		showPersonElements(personList);
		System.out.println();
		System.out.println("*** PersonSet ***");
		showPersonElements(personSet);
	}
	
	private static void addElements(Collection<String> col) {
		col.add("Joe");
		col.add("Sue");
		col.add("Jake");
		col.add("Zoe");
		col.add("Graham");
		col.add("Mark");
	}	
	
	private static void showElements(Collection<String> col) {
		for (String element: col)
			System.out.println(element);
	}
	
	//////////////////////// Custom Objects ////////////////////

	private static void addPersonElements(Collection<Person> col) {
		col.add(new Person("Joe"));
		col.add(new Person("Sue"));
		col.add(new Person("Jake"));
		col.add(new Person("Zoe"));
		col.add(new Person("Graham"));
		col.add(new Person("Mark"));
	}	
	
	private static void showPersonElements(Collection<Person> col) {
		for (Person element: col)
			System.out.println(element);
	}
}
