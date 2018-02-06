import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 
 * @author Alfie Hippisley
 * 
 * @version 06/02/2018
 *
 */

public class MySet {
	
	private Set<Integer> setData;

	public MySet() {
		setData = new HashSet<Integer>();
	}
	
	public boolean isSetEmpty() {
		// Returns true if set is empty
		return setData.isEmpty();
	}
	
	public boolean isInSet(Object searchObject) {
		// Returns true if set contains desired element
		return setData.contains(searchObject);
	}
	
	public void addToSet(Integer Number) {
		// Will add desired element to the set
		setData.add(Number);
	}
	
	public void printSet() {
		// Create local iterator
		Iterator<Integer> iterator;
		
		// Get data from the set
		iterator = setData.iterator();
		
		// Display that data
		while (iterator.hasNext()) {
	         System.out.println("Value: "+iterator.next() + " ");  
	    }
	}
	
	public Integer getCardinality() {
		// Returns the cardinality of the set
		return setData.size();
	}
	
	public void intersection() {
		
	}
}
