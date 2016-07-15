package serialisingArrays;

import java.io.Serializable;

public class Person implements Serializable {

	private static final long serialVersionUID = -8775367384616899300L;
	
	private int id;
	private String name;
	
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public String toString() {
		return "Person [id = " + id + ", name = " + name + "]";
	}

}
