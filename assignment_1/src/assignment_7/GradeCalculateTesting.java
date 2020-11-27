package assignment_7;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

/**
 * 
 * @author tilic
 *
 */
public class GradeCalculateTesting {
	public GradeCalculate perfectGrades;
	public GradeCalculate emptySet;
	public GradeCalculate evenMedian;
	public GradeCalculate dropLowest;
	
	@Before
	/**
	 * sets up the list to be tested
	 * @throws Exception
	 */
	public void setUp() throws Exception {
		List<Integer> set1= new ArrayList<>();
		set1.add(100);
		set1.add(100);
		set1.add(100);
		set1.add(100);
		set1.add(100);
		set1.add(100);
		perfectGrades = new GradeCalculate(set1);
		
		List<Integer> set2= new ArrayList<>();
		emptySet = new GradeCalculate(set2);
		
		List<Integer> set3= new ArrayList<>();
		set1.add(74);
		set1.add(95);
		set1.add(23);
		set1.add(93);
		evenMedian = new GradeCalculate(set3);
		
		List<Integer> set4= new ArrayList<>();
		set1.add(74);
		set1.add(95);
		set1.add(23);
		set1.add(93);
		dropLowest = new GradeCalculate(set4);
	}
	/**
	 * tests the compute function
	 * @throws EmptyListException
	 */
	@Test public void isPerfectGrades() throws EmptyListException{
		List<Integer> set1= new ArrayList<>();
		set1.add(100);
		set1.add(100);
		set1.add(100);
		set1.add(100);
		set1.add(100);
		set1.add(100);
		assertEquals(perfectGrades.compute(set1), 100);
	}
	/**
	 * tests EmptyListException
	 * @throws EmptyListException
	 */
	@Test public void isEmptySet() throws EmptyListException{
		List<Integer> set1= new ArrayList<>();
		try {
			emptySet.compute(set1);
		}catch(Exception s) {System.out.println("EXCEPTION: " + s);}
		int output = emptySet.compute(set1);
		assertEquals(emptySet.compute(set1), output);
	}
	/**
	 * tests the median function
	 * @throws EmptyListException
	 */
	@Test public void isEvenMedian() throws EmptyListException{
		List<Integer> set1= new ArrayList<>();
		set1.add(74);
		set1.add(95);
		set1.add(23);
		set1.add(93);
		assertEquals(evenMedian.median(set1), 83);
	}
	/**
	 * tests the dropTwo function
	 * @throws EmptyListException
	 */
	@Test public void dropLow() throws EmptyListException{
		List<Integer> set1= new ArrayList<>();
		set1.add(74);
		set1.add(95);
		set1.add(23);
		set1.add(93);
		assertEquals(dropLowest.dropTwo(set1), 94);
	}
}