package assignment_7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 
 * @author tilic
 *
 */
public class GradeCalculate implements GradeStrategy {

	private List<Integer> grades = new ArrayList<Integer>();

	public GradeCalculate(List<Integer> grades) {
	       this.grades = grades;
	}
	
	//1.	Calculate the average grade for a list of integer numbers
	@Override
	public int compute(List<Integer> grades) throws EmptyListException {
		// TODO Auto-generated method stub
		if(grades.size()==0) {
			throw new EmptyListException("EMPTY SET"); 
	    }
		int total = 0;
		for(int i=0; i<grades.size(); i++) {
			total += grades.get(i);
		}
		int avg = total/grades.size();
		return avg;
	}

	//2.	Calculate the average grade for a list of integers, dropping the lowest two grades
	@Override
	public int dropTwo(List<Integer> grades) throws EmptyListException {
		// TODO Auto-generated method stub
		if(grades.size()==0) {
			throw new EmptyListException("EMPTY SET"); 
	    }
		int count = 0;
		while(count != 2) {
			int low = 100;
			int index = 0;
			for(int i=0; i<grades.size(); i++) {
				if(grades.get(i)<low) {
					low = grades.get(i);
					index = i;
				}
			}
			grades.remove(grades.get(index));
			count +=1;
		}
		
		int total = 0;
		for(int i=0; i<grades.size(); i++) {
			total += grades.get(i);
		}
		int avg = total/grades.size();
		return avg;
	}

	//3.	Calculate the median grade for a list of integer numbers
	@Override
	public int median(List<Integer> grades) throws EmptyListException {
		// TODO Auto-generated method stub
		if(grades.size()==0) {
			throw new EmptyListException("EMPTY SET"); 
	    }
		int length = grades.size();
		int half;
		Collections.sort(grades);
		if(length%2 == 0) {
			double med = length/2;
			int first = (int)(med+.5);
			int second = (int)(med-.5);
			half = (grades.get(first)+grades.get(second))/2;
		}
		else {
			int med = length/2;
			half = grades.get(med);
		}
		return half;
	}
}




