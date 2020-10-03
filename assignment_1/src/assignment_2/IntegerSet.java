package assignment_2;

import java.util.*;

/**
 * 
 * @author tilic
 *
 */
public class IntegerSet  {
	// Hint: probably best to use an array list.  You will need to do a little research
	/**
	 * 
	 */
	private List<Integer> set = new ArrayList<Integer>();
	/**
	 * 
	 * @param set
	 */
	public IntegerSet(List<Integer> set) {
	       this.set = set;
	}
	// Clears the internal representation of the set
	/**
	 * 
	 */
	public void clear() {
		set.clear();
	};
	
	// Returns the length of the set
	/**
	 * 
	 * @return the size of the set
	 */
	public int length() {
		return set.size();
	}; // returns the length
	
	/*
	 * Returns true if the 2 sets are equal, false otherwise;
	 * Two sets are equal if they contain all of the same values in ANY order.
	*/
	/**
	 * 
	 * @param b takes the set as an IntegerSet
	 * @return true if the sets are equal or false if they are not
	 */
	public boolean equals(IntegerSet b) {
		ArrayList<Integer> temp2 = (ArrayList<Integer>) b.set;
        ArrayList<Integer> temp1 = (ArrayList<Integer>) set;
	    if(temp1.size()!=temp2.size()) {
	    	return false;
	    }   
	       
	    Collections.sort(temp1);
	    Collections.sort(temp2);
	         
	    for(int i=0; i<temp1.size(); i++) {
	    	if(temp1.get(i)!=temp2.get(i)) {
	    		return false;
	    	}
	    }
	    return true;
	}; 
	
	// Returns true if the set contains the value, otherwise false
	/**
	 * 
	 * @param value takes a number for comparison
	 * @return true if the set contains the value or false if it doesnt
	 */
	public boolean contains(int value) {
		for(int i=0; i<set.size(); i++) {
			if(set.get(i)==value) {
				return true;
			}
		}
		return false;
	};    
	
	// Returns the largest item in the set; Throws a IntegerSetException if the set is empty
	/**
	 * 
	 * @return the highest number in the set
	 * @throws IntegerSetException if the set is empty
	 */
	public int largest() throws IntegerSetException {
		if(set.size()==0) {
			throw new IntegerSetException("EMPTY SET"); 
	    }
		int max = set.get(0);
		for(int i=0; i<set.size(); i++) {
			if(set.get(i)>max) {
				max = set.get(i);
			}
		}
		return max;
	}; 
	
	// Returns the smallest item in the set; Throws a IntegerSetException if the set is empty
	/**
	 * 
	 * @return the lowest number in the set
	 * @throws IntegerSetException if the set is empty
	 */
	public int smallest() throws IntegerSetException{
		if(set.size()==0) {
			throw new IntegerSetException("EMPTY SET"); 
	    }
		int min = set.get(0);
		for(int i=0; i<set.size(); i++) {
			if(set.get(i)<min) {
				min = set.get(i);
			}
		}
		return min;
	}
	
	// Adds an item to the set or does nothing it already there	
	/**
	 * 
	 * @param item takes a number that is added to a set
	 */
 	public void add(int item) {
 		int present = 0;
 	      
        for(int i=0;i<set.size();i++) {
            if(set.get(i)==item) {
                present=1;
            }
        }
        if(present==0) {
            set.add(item);
        }
	 }; // adds item to s or does nothing if it is in set
	
		// Removes an item from the set or does nothing if not there
	/**
	 *  
	 * @param item number to be removed from set
	 */
	public void remove(int item) {
		for(int i=0;i<set.size();i++) {
            if(set.get(i)==item) {
                set.remove(set.get(i));
            }
        }
	}; 
	
	// Set union
	/**
	 * 
	 * @param intSetb takes the set as IntegerSet
	 * @return the union of the sets
	 */
	public IntegerSet union(IntegerSet intSetb) {//public static
		ArrayList<Integer> temp = (ArrayList<Integer>) intSetb.set;
       	Set<Integer> temp2 = new HashSet<>();
       	temp2.addAll(set);
       	temp2.addAll(temp);       
        ArrayList<Integer> temp3= new ArrayList<>(temp2);
        IntegerSet temp4= new IntegerSet(temp3);
		return temp4;
	};
	
	// Set intersection
	/**
	 * 
	 * @param intSetb takes the set as IntegerSet
	 * @return the intersection of the sets
	 */
	public IntegerSet intersect(IntegerSet intSetb) {
		ArrayList<Integer> temp = (ArrayList<Integer>) intSetb.set;
	    set.retainAll(temp);
	    IntegerSet temp1= new IntegerSet(set);		
	    return temp1;
	}; 
	
	// Set difference, i.e., s1 –s2
	/**
	 * 
	 * @param intSetb takes the set as IntegerSet
	 * @return the difference of the set
	 */
	public IntegerSet diff(IntegerSet intSetb) { // set difference, i.e. s1 - s2
		ArrayList<Integer> temp = (ArrayList<Integer>) intSetb.set;
		set.removeAll(temp);
		IntegerSet temp1= new IntegerSet(set); 
	    return temp1;
	}
	// Returns true if the set is empty, false otherwise
	/**
	 * 
	 * @return true if the set is empty or false if it isnt
	 */
	boolean isEmpty() {
		if(set.size()==0) {
			return true;
		}
		return false;
	} 
	
	// Return String representation of your set
	/**
	 * @return the set in string form
	 */
	public String toString() {
		String setRep = "[";
		for(int i=0;i<set.size();i++) {
			if(i==(set.size()-1)) {
				String temp1 = String.valueOf(i);
				setRep += temp1;
			}
			else {
				String temp1 = String.valueOf(i) +", ";
				setRep += temp1;
			}
		}
		setRep += "]";
		return setRep;
	};	// return String representation of your set
}
