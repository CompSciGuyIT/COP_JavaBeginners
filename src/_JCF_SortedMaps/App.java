package _JCF_SortedMaps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class App {

	public static void main(String[] args) {
		Map<Integer, String> hashMap = new HashMap<Integer, String>();
		Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		Map<Integer, String> treeMap = new TreeMap<Integer, String>();
		
		// could be printed out in a random order. NO GUARANTEES
		System.out.println("********* HashMap **********");
		testMap(hashMap);
		System.out.println();
		
		// prints out in order info was entered
		System.out.println("********* LinkedHashMap **********");
		testMap(linkedHashMap);
		System.out.println();
		
		// prints out in order of keys
		System.out.println("********* TreeMap **********");
		testMap(treeMap);
		System.out.println();
	}

	public static void testMap(Map<Integer, String> map) {
		map.put(9, "fox");
		map.put(4, "cat");
		map.put(8, "dog");
		map.put(1, "giraffe");
		map.put(0, "swan");
		map.put(15, "bear");
		map.put(6, "snake");
		
		for (Integer key: map.keySet()) {
			String value = map.get(key);
			System.out.println(key + ": " + value);
		}
	}

}
