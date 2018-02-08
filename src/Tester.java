
/**
 * 
 * @author Alfie Hippisley
 * 
 * @version 06/02/2018
 * 
 */

public class Tester {
	
	MySet testSetOne;
	MySet testSetTwo;
	
	public void initializeSets() {
		testSetOne = new MySet();
		testSetTwo = new MySet();
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
		testSetOne.addToSet(2);
		testSetOne.addToSet(3);
		testSetOne.addToSet(4);
		testSetOne.addToSet(5);
		
		testSetTwo.addToSet(1);
		testSetTwo.addToSet(2);
		testSetTwo.addToSet(3);
		testSetTwo.addToSet(4);
		testSetTwo.addToSet(5);
	}
	
	public void displaySet() {
		testSetOne.printSet();
	}
	
	public void isItemInSet() {
		boolean response = testSetOne.isInSet(7);
		
		if(response == true) {
			System.out.println("The Element Is In The Set");
		}
		else {
			System.out.println("The Element Is Not In The Set");
		} 
	}
	
	public void getSetCardinality() {
		int cardinality = testSetOne.getCardinality();
		
		System.out.println(cardinality);
	}
	
	public void getIntersection() {
		testSetOne.intersection(testSetTwo);
	}
	
	/**
	 * For MySet class testing do:
	 * 
	 * test1.initializeSets();
	 * test1.isSetEmpty();
	 * test1.addToSet();
	 * test1.isSetEmpty();
	 * test1.displaySet();
	 * test1.isItemInSet();
	 * test1.getSetCardinality();
	 * 
	 */
	
	public static void main(String[] args) {
		// Create Tester object and run tests
		Tester test1 = new Tester();
		
		test1.initializeSets();
		test1.isSetEmpty();
		test1.addToSet();
		//test1.isSetEmpty();
		test1.displaySet();
		test1.isItemInSet();
		test1.getSetCardinality();
		test1.getIntersection();
		test1.displaySet();
	}

}
