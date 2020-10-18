package midterm;

/**
 * RangeExecution class
 * @author tilic
 *
 */
public class RangeExecute {
	/**
	 * Tests the implementation from the Range class
	 * @param args
	 */
	public static void main(String[] args) {
		Range range0 = new Range(3, 5);
		Range range1 = new Range(5, 12);
		System.out.println(range0.contains(4));
		System.out.println(range0.overlaps(range1));
		System.out.println(range1.size());
	}
}
