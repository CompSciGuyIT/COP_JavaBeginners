package _JCF_LinkedLists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		/*
		 * ArrayLists manage arrays internally
		 * [0][1][2][3][4][5] ...
		 */
		List<Integer> arrayList = new ArrayList<Integer>();
		
		/*
		 * LinkedLists consist of elements where each element
		 * has a reference to the previous and next element
		 * [0]->[1]->[2]->[3] ...
		 *    <-   <-   <-
		 */
		List<Integer> linkedList = new LinkedList<Integer>();
		
		doTimings("ArrayList", arrayList);
		doTimings("LinkedList", linkedList);
	}
	
	private static void doTimings(String type, List<Integer> list) {
		for (int i = 0; i < 1E5; i++) {
			list.add(i);
		}
		
		long start = System.currentTimeMillis();
		
		// add items at end of list
		for (int i = 0; i < 1E5; i++) {
			list.add(i);
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println("Time taken for add at end: " + (end - start) + "ms for " + type);
		
		start = System.currentTimeMillis();
		
		// add items elsewhere in the list
		for (int i = 0; i < 1E5; i++) {
			list.add(0, i);
		}
		
		end = System.currentTimeMillis();
		
		System.out.println("Time taken for add elsewhere: " + (end - start) + "ms for " + type);
		
		
		

	}

}
