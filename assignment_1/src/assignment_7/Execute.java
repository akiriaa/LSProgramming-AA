package assignment_7;

import java.util.ArrayList;
import java.util.List;
/**
 * 
 * @author tilic
 *
 */
public class Execute {
	/**
	 * Tests the implementation in the GradeCalculate class
	 * @param args
	 * @throws EmptyListException
	 */
	public static void main(String[] args) throws EmptyListException {
		List<Integer> set1= new ArrayList<>();
		set1.add(74);
		set1.add(95);
		set1.add(23);
		set1.add(93);
		set1.add(72);
		set1.add(87);
		set1.add(86);
		
		GradeCalculate set= new GradeCalculate(set1);
		System.out.println("The average grade is "+set.compute(set1));
		System.out.println("The average grade is after dropping the lowest grades is "+set.dropTwo(set1));
		System.out.println("The median is " +set.median(set1));
	}
}
