package assignment_5;

/**
 * Execute class
 * @author tilic
 *
 */
public class Execute {
	/**
	 * Tests the BowlingScore class
	 * @param args
	 */
	public static void main(String[] args) {
		String scoreStr = "45-54-36-27-09-63-81-18-90-72"; 
		BowlingScore scor = new BowlingScore();
		
		String scoreStr1 = "X-X-X-X-X-X-X-X-X-XXX"; 
		BowlingScore scor1 = new BowlingScore();
		
		String scoreStr2 = "5/-5/-5/-5/-5/-5/-5/-5/-5/-5/5";
		BowlingScore scor2 = new BowlingScore();
		
		System.out.println("Final Score for game [" + scoreStr + "]: " + scor.scoreCalc(scoreStr));
		System.out.println("Final Score for game [" + scoreStr1 + "]: " + scor1.scoreCalc(scoreStr1));
		System.out.println("Final Score for game [" + scoreStr2 + "]: " + scor2.scoreCalc(scoreStr2));
	}

}
