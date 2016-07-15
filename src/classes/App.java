package classes;

class Person {
	String name;
	int age;
}

class Vehicle {
	String type;
	int numOfWheels;
	
	void drive() {
		System.out.println("The " + type + " is driving");
	}
}

public class App {

	public static void main(String[] args) {
		Person person1 = new Person();
		person1.name = "Steve";
		person1.age = 28;
		
		Person person2 = new Person();
		person2.name = "Karen";
		person2.age = 32;
		
		System.out.println(person2.name + "'s age is " + person2.age);

		Vehicle vehicle1 = new Vehicle();
		vehicle1.type = "Boat";
		vehicle1.numOfWheels = 0;
		
		Vehicle vehicle2 = new Vehicle();
		vehicle2.type = "Car";
		vehicle2.numOfWheels = 4;
		
		System.out.println(vehicle2.type + "'s have " + vehicle2.numOfWheels + " wheels");
		vehicle2.drive();
	}

}
