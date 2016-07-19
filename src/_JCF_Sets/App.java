package _JCF_Sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {

	public static void main(String[] args) {
		
		// HashSet does not retain order
		Set<String> hash = new HashSet<String>();
		
		// LinkedHashSet remembers the order items were added
		Set<String> linked = new LinkedHashSet<String>();
		
		// TreeSet sorts in natural order
		Set<String> tree = new TreeSet<String>();

		if (hash.isEmpty()) {
			System.out.println("HashSet is empty!");
			System.out.println();
		}
		
		hash.add("dog");
		hash.add("cat");
		hash.add("mouse");
		hash.add("snake");
		hash.add("bear");

		linked.add("dog");
		linked.add("cat");
		linked.add("mouse");
		linked.add("snake");
		linked.add("bear");

		tree.add("dog");
		tree.add("cat");
		tree.add("mouse");
		tree.add("snake");
		tree.add("bear");
		
		if (hash.isEmpty()) {
			System.out.println("HashSet is empty! it will not get here.");
			System.out.println();
		}
		
		// adding duplicate items does nothing
		hash.add("mouse");
		
		System.out.println("HashSet");
		System.out.println(hash);
		System.out.println();
		System.out.println("LinkedSet");
		System.out.println(linked);
		System.out.println();
		System.out.println("TreeSet");
		System.out.println(tree);
		System.out.println();
		
		///////////// Iteration //////////
		for (String element: hash) {
			System.out.println(element);
		}
		System.out.println();
		
		///// Does set contain a given item? //////
		if (hash.contains("aardvark")) {
			System.out.println("Contains Aardvark");
		}
		if (hash.contains("cat")) {
			System.out.println("Contains Cat");
		}
		System.out.println();
		
		// tree2 contains contains some common elements with tree, and some new
		Set<String> tree2 = new TreeSet<String>();
		
		tree2.add("dog");
		tree2.add("cat");
		tree2.add("giraffe");
		tree2.add("monkey");
		tree2.add("ant");
		
		////////// Intersection /////////////
		Set<String> intersection = new HashSet<String>(tree);
		
		System.out.println("Intersection before");
		System.out.println(intersection);
		System.out.println();
		System.out.println("tree");
		System.out.println(tree);
		System.out.println();
		
		// Retains only the elements in this set that are contained in the specified collection 
		intersection.retainAll(tree2);
		
		System.out.println("Intersection after");
		System.out.println(intersection);
		System.out.println();
		
		////////// Difference /////////////
		Set<String> difference = new HashSet<String>(tree2);
		
		System.out.println("Difference before");
		System.out.println(difference);
		System.out.println();
		System.out.println("tree2");
		System.out.println(tree2);
		System.out.println();
		
		// Removes from this set all of its elements that are contained in the specified collection 
		difference.removeAll(tree);

		System.out.println("Difference after");
		System.out.println(difference);
		System.out.println();
		
	}

}
