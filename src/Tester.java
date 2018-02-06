
/**
 * 
 * @author Alfie Hippisley
 * 
 * @version 06/02/2018
 * 
 */

public class Tester {
	
	MySet testSetOne;
	
	public void initializeSets() {
		testSetOne = new MySet();
	}
	
	public void isSetEmpty() {
		boolean response = testSetOne.isSetEmpty();
		
		if(response == true) {
			System.out.println("The Set Is Empty");
		}
		else {
			System.out.println("The Set Contains Elements");
		}
	}
	
	public void addToSet() {
		testSetOne.addToSet(1);
	}
	
	public static void main(String[] args) {
		// Create Tester object and run tests
		Tester test1 = new Tester();
		
		test1.initializeSets();
		test1.isSetEmpty();
		test1.addToSet();
		test1.isSetEmpty();
	}

}
