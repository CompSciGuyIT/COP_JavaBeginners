package stringBuilding;

public class App {

	public static void main(String[] args) {

		StringBuilder myString = new StringBuilder();
		myString.append("Hello, ")
		.append("my name is ")
		.append("Gary.");
		
		System.out.println(myString.toString());
		
		StringBuffer newString = new StringBuffer();
		newString.append("StringBuffers are more thread-safe than StringBuilders, ")
		.append("however StringBuilders are nore light-weight.");
		
		System.out.println(newString.toString());

	}

}
