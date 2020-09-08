package assignment_1;
/**
 * calculate class
 * @author tilic
 *
 */
public class calculate {
	/**
	 * calcombos function has 3 for loops to find combinations that add up to target_sum
	 * uses a string to keep track of combinations 
	 * @param input
	 * @param target_sum
	 * @return
	 */
	public String calcombos(int [] input, int target_sum ) {
		String holder = "";
		for (int i = 0; i < input.length; i++) {
			if(input[i] == target_sum) { //checks if element is equal to target_sum
				int isFound = holder.indexOf("[" + i + "]");//checks if element/combo is already present in holder
				if (isFound ==-1){ //adds element/combo to holder
					String temp1 = "[" + i +"]\n";
					holder += temp1;
				}
			}
			for (int j = 0; j < input.length; j++) {
				if(input[i]+input[j] == target_sum && i!=j) {
					int isFound = holder.indexOf("[" + j +", " + i + "]");
					if (isFound ==-1){
						String temp1 = "[" + i +", " + j + "]\n";
						holder += temp1;
					}
				}
				for (int k = 0; k < input.length; k++) {
					if(input[i]+input[j]+input[k] == target_sum && i!=j && j!=k && i!=k) {
						int isFound = holder.indexOf("[" + i + ", " + j + ", " + k + "]");
						int isFound1 = holder.indexOf("[" + i + ", " + k + ", " + j + "]");
						int isFound2 = holder.indexOf("[" + j + ", " + i + ", " + k + "]");
						int isFound3 = holder.indexOf("[" + j + ", " + k + ", " + i + "]");
						int isFound4 = holder.indexOf("[" + k + ", " + j + ", " + i + "]");
						int isFound5 = holder.indexOf("[" + k + ", " + i + ", " + j + "]");
						if (isFound ==-1 &&isFound1 ==-1 &&isFound2 ==-1 &&isFound3 ==-1 &&isFound4 ==-1 &&isFound5 ==-1){ //checks if any combo of the string array is in holder
							String temp1 = "[" + i + ", " + j + ", " + k + "]\n";
							holder += temp1;
						}
					}
				}
			}
			
		}
		return holder;
	}
}
