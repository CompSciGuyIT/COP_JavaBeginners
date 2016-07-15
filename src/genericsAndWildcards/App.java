package genericsAndWildcards;

import java.util.ArrayList;
import java.util.HashMap;

class Animal {
	
}

class Machine {

	@Override
	public String toString() {
		return "I am a Machine";
	}
	
	public void start() {
		System.out.println("Machine starting");
	}
	
}

class Camera extends Machine {

	@Override
	public String toString() {
		return "I am a Camera";
	}
	
	public void snap() {
		System.out.println("Snap!");
	}
	
}

public class App {

	public static void main(String[] args) {
		
		///////////// Before Java 5 ////////////
		ArrayList list = new ArrayList();
		
		list.add("apple");
		list.add("banana");
		list.add("orange");
		
		String fruit = (String) list.get(1);
		
		System.out.println(fruit);

		//////////// Modern style ////////////
		ArrayList<String> strings  = new ArrayList<String>();
		
		strings.add("cat");
		strings.add("dog");
		strings.add("aligator");
		
		String animal = strings.get(1);
		
		System.out.println(animal);
		
		//////////// There can be more than one type of argument /////////
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		//////////// Java 7 style ///////////////
		ArrayList<Animal> alist = new ArrayList<>();
		
		
		////////// Generics /////////////
		ArrayList<Machine> list1 = new ArrayList<Machine>();
		
		list1.add(new Machine());
		list1.add(new Machine());
		
		ArrayList<Camera> list2 = new ArrayList<Camera>();
		
		list2.add(new Camera());
		list2.add(new Camera());
		
		showList(list2);
		showList2(list1);
		showList3(list1);
		
	}
	
	public static void showList(ArrayList<? extends Machine> list) {
		for (Machine value : list) {
			System.out.println(value);
			value.start();
		}
	}
	
	public static void showList2(ArrayList<? super Camera> list) {
		for (Object value : list) {
			System.out.println(value);
		}
	}
	
	public static void showList3(ArrayList<?> list) {
		for (Object value : list) {
			System.out.println(value);
		}
	}

}
