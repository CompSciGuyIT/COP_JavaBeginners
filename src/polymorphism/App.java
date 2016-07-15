package polymorphism;

public class App {

	public static void main(String[] args) {

		Plant plant1 = new Plant();
		
		
		Tree tree = new Tree();
		
		Plant plant2 = new Tree();
		
		plant2.grow();
		
		// wont work because plant2 is a Plant
		// and Plant doesn't have a shedLeaves() method
		//plant2.shedLeaves();
		
		tree.shedLeaves();
		
		doGrow(tree);

	}

	public static void doGrow(Plant plant) {
		plant.grow();		
	}
	

}
