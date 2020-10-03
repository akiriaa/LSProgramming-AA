package assignment_2;
import java.util.ArrayList;
import java.util.List;
/**
 * Execute class
 * @author tilic
 *
 */
public class Execute {
/**
 * Tests the implementation from the IntegerSet class
 * @param args
 * @throws IntegerSetException
 */
   public static void main(String[] args) throws IntegerSetException {
		List<Integer> set1= new ArrayList<>();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		set1.add(6);
		set1.add(7);
		
		List<Integer> set2= new ArrayList<>();
		set2.add(3);
		set2.add(4);
		set2.add(2);
		set2.add(5);
		set2.add(6);
		set2.add(7);
		set2.add(8);
		
		List<Integer> set3= new ArrayList<>();
		set3.add(2);
		set3.add(1);
		set3.add(3);
		set3.add(4);
		set3.add(6);
		set3.add(5);
		set3.add(7);

		System.out.println("Set 1: "+set1.toString());
		System.out.println("Set 2: "+set2.toString());
		System.out.println("Set 3: "+set3.toString());
		
		System.out.println("\nSet 1 length: "+set1.size());
		System.out.println("Set 1 contains the number 1: "+set1.contains(1));
		System.out.println("Set 2 contains the number 1: "+set2.contains(1));
		System.out.println("Set 1 equals Set 2: "+set1.equals(set2));
		set3.remove(5);
		System.out.println("\nSet 3 remove number 5: "+set3.toString());
		System.out.println("Clearing Set 3");
		set3.clear();
		System.out.println("Set 3 empty: "+set3.isEmpty());
						
		IntegerSet intSet1= new IntegerSet(set1);
		IntegerSet intSet2= new IntegerSet(set2);
		
		System.out.println("\nLargest number in Set 1: "+intSet1.largest());
		System.out.println("Smallest number in Set 2: "+intSet2.smallest());
		
		IntegerSet setUnion= intSet1.union(intSet2);
		System.out.println("\nUnion: "+ setUnion.toString());
		IntegerSet setInter= intSet1.intersect(intSet2);
		System.out.println("Intersection: "+setInter.toString() );
		IntegerSet setDiff= intSet1.diff(intSet2);
		System.out.println("Difference: "+setDiff.toString() );
   }
}
