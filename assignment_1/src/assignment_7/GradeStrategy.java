package assignment_7;

import java.util.List;
/**
 * 
 * @author tilic
 *
 */
public interface GradeStrategy {
	/**
	 * 
	 * @param grades
	 * @return the average of the grades
	 * @throws EmptyListException
	 */
	public int compute(List<Integer> grades) throws EmptyListException;
	/**
	 * 
	 * @param grades
	 * @return the average of the grades list after dropping
	 * the 2 lowest grades
	 * @throws EmptyListException
	 */
	public int dropTwo(List<Integer> grades) throws EmptyListException;
	/**
	 * 
	 * @param grades
	 * @return the median of the list of grades
	 * @throws EmptyListException
	 */
	public int median(List<Integer> grades) throws EmptyListException;
}
