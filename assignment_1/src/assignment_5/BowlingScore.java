package assignment_5;

/**
 * 
 * @author tilic
 *
 */
public class BowlingScore {
	/**
	 * 
	 * @param game string
	 * @return score of game
	 */
	int scoreCalc(String game){
		int count = 0;
		int score = 0;
		int frameCnt = 0;
		for(int i=0;i<game.length();i++) {
			if (game.charAt(i) == '-') {
				frameCnt += 1;
			}
		}
		if (frameCnt > 9) {
			System.out.println("INVALID FRAMES");
			int finalScore = 0;
			return finalScore;
		}
		
		for(int i=0;i<game.length();i++) {
			if (count >= 9){
				int finalScore = finalFrame(score, game);
				return finalScore;
			}
			
			else if (game.charAt(i) == '-') {
				count +=1;
			}
			
			else if (game.charAt(i) == 'X' && count < 9) {
				score += 30;
			}
			
			else if (game.charAt(i) == '/') {
				score += spare(game.charAt(i+2));
			}
			
			else if (Character.getNumericValue(game.charAt(i)) + Character.getNumericValue(game.charAt(i+1)) <= 9) {
				char first = game.charAt(i);
				char second = game.charAt(i+1);
				score += open(first, second);
			}
			
			else if (Character.getNumericValue(game.charAt(i)) + Character.getNumericValue(game.charAt(i+1)) > 9) {
				System.out.println("INVALID SCORE");
				int finalScore = 0;
				return finalScore;
			}
		}
		return 0;
	}
	
	/**
	 * 
	 * @param i frame after spare
	 * @return spare sum
	 */
	int spare(char i) {
		int score = 0;
		if (i == 'X') {
			score += 20;
		}
		else {
			int spare = Character.getNumericValue(i);
			int total = spare + 10;
			score += total;
		}
		return score;
	}
	/**
	 * 
	 * @param first roll for frame
	 * @param second roll for frame
	 * @return sum of the frame
	 */
	int open(char first, char second) {
		int score1 = Character.getNumericValue(first);  
		int score2 = Character.getNumericValue(second);  
		if (score2 == -1){
			return 0;
		}
		int total = score1 + score2;
		return total;
	}
	/**
	 * 
	 * @param score before the final frame
	 * @param game
	 * @return final score
	 */
	int finalFrame(int score, String game) {
		String[] arrOfStr = game.split("-", 0);
		String finall = arrOfStr[arrOfStr.length-1];
		if (finall.length() == 3){
			for(int i=0;i<finall.length();i++) {
				if(finall.charAt(i) == '/') {
					int total = 10 + Character.getNumericValue(finall.charAt(i+1));
					score += total;
				}
				else if(finall.charAt(i) == 'X') {
					score += 10;
				}
			}
		}
		else if (finall.length() == 2) {
			for(int i=0;i<finall.length();i++) {
				int newSco = Character.getNumericValue(finall.charAt(i));
				score += newSco;
			}
		}
		if (score > 300) {
			System.out.println("INVALID SCORE");
			score = 0;
			return score;
		}
		return score;
	}
}
