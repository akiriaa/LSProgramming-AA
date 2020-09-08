package assignment_1;
/**
 * execute class
 * @author tilic
 *
 */
public class execute {
/**
 * 
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] input = {1, 2, 3, 4, 5, 6};
		int target_sum = 6;
		calculate calc = new calculate();
		String sum = calc.calcombos(input, target_sum);
		System.out.println(sum);
		
		int[] input1 = {5, 5, 15, 10};
		int target_sum1 = 15;
		calculate calc1 = new calculate();
		String sum1 = calc1.calcombos(input1, target_sum1);
		System.out.println(sum1);
	}

}
