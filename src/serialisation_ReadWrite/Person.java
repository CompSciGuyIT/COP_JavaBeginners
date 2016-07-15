package serialisation_ReadWrite;

import java.io.Serializable;

public class Person implements Serializable {

	private static final long serialVersionUID = 3546918879446982470L;
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
