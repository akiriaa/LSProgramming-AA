package midterm;
/**
 * 
 * @author tilic
 *
 */
public class Range {
	private int lower;
    private int upper;
    /**
     * constructor for the range class
     * @param lower
     * @param upper
     */
    public Range(int lower, int upper) {  // Constructor
        this.lower = lower;
        this.upper = upper;
    }
    
    // Returns true if value is >= lower bound and <= upper bound
    /**
     * 
     * @param value
     * @return true if the value is greater than or equal to lower bound and less than or equal to upper bound and false otherwise
     */
    public boolean contains( int value ) {
    	if (value>=lower && value<=upper){
    		return true;
    	}
    	else {
    		return false;
    	}
    }

    /*
     * Returns true if the receive contains at least one value in
     * common with the other, and false otherwise.
     */
    /**
     * 
     * @param other
     * @return true if there is one value in common and false otherwise
     */
    public boolean overlaps( Range other ) {
    	if((other.lower<=lower && other.lower>=upper)||(other.lower>=lower && other.lower<=upper)){
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    // Returns the number of integers in the range
    /**
     * 
     * @return the number of integers
     */
    public int size() {
    	return ((upper-lower)+1);
    }
    // returns the number of integers in the range

}
