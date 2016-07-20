package lambdaExpressions;

interface Executable {
	int execute(int a, int b);
}

interface StringExecutable {
	int execute(String a);
}

class Runner {
	public void run(Executable e) {
		System.out.println("Executing code block..");
		int value = e.execute(12, 13);
		System.out.println("Return value is: " + value);
	}

	public void run(StringExecutable e) {
		System.out.println("Executing code block..");
		int value = e.execute("Hello");
		System.out.println("Return value is: " + value);
	}
}


/*
  	() -> System.out.println("Hello there.")
  	
  	() -> {
			  return 8;
		  }
  	
  	() -> 8
  
  	() -> {
			  System.out.println("Hello there.");
			  System.out.println("This is code passed in a lambda experssion.");
		  } 

	() -> {
			  System.out.println("Hello there.");
			  System.out.println("This is code passed in a lambda experssion.");
			  return 9;
		  }
	
	(int a) -> {
			  System.out.println("Hello there.");
			  System.out.println("This is code passed in a lambda experssion.");
			  return 9 + a;
		  }
		  
	Will not work with methods that have the same number of arguments of different types
	(a) -> {
			  System.out.println("Hello there.");
			  System.out.println("This is code passed in a lambda experssion.");
			  return 9 + a;
		  }
		
	Same as above
	a -> {
			  System.out.println("Hello there.");
			  System.out.println("This is code passed in a lambda experssion.");
			  return 9 + a;
		  }
 */


public class App {

	public static void main(String[] args) {

		int c = 10;
		
		// Cannot do this.  Variable must be final or effectively final
		// c = 7;
		
		int d = 7;
		
		Runner runner = new Runner();
		runner.run(new Executable() {
			public int execute(int a, int b) {
				System.out.println("Hello there.");
				
				// We can re-declare and use variables in anonymous classes
				// They are not considered within the same scopoe
				int d = 8;
				return a + b + c + d;
			}			
		});
		
		System.out.println("------------------------------");
		
		runner.run((a, b) -> a + b);

		System.out.println("------------------------------");
		
		runner.run((a, b) -> {
			// Cannot do this, as it is not within an anonymous class
			// and is considered within the same scope
			// int d = 13;
			return a + b + d;
		});

		System.out.println("------------------------------");
		
		runner.run((a) -> {
			System.out.println(a + " there.");
			System.out.println("This is code passed in a lambda experssion.");
			return 7;
		});
		
		System.out.println("------------------------------");
		
		runner.run((a, b) -> {
			System.out.println("Hello there.");
			return a + b;
		});

		System.out.println("------------------------------");
		
		Executable ex = (a, b) -> {
			System.out.println("Hello there.");
			return a + b;
		};
		
		runner.run(ex);
		
		Object codeblock = (Executable)(a, b) -> {
			System.out.println("Hello there.");
			return a + b;
		};
	}

}
