package tryWithResources;

class Temp implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("Closing!");
		throw new Exception("Oh no!");
		
	}
	
}
public class App1 {

	public static void main(String[] args) {

		try (Temp temp = new Temp()) {
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
