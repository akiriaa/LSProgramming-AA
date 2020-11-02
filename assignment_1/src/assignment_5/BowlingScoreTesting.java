package assignment_5;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BowlingScoreTesting {

	public BowlingScore correctFrame;
	public BowlingScore correctThrow;
	public BowlingScore invalidThrow;
	public BowlingScore perfectGame;
	public BowlingScore invalidFrame;

	@Before
	public void setUp() throws Exception {
		correctFrame = new BowlingScore();
		correctThrow = new BowlingScore();
		invalidThrow = new BowlingScore();
		perfectGame = new BowlingScore();
		invalidFrame = new BowlingScore();
	}

	@Test
	public void isCorrectFrameAndThrow(){
		String corFrame = "45-54-36-27-09-6/-81-18-90-72";
		assertEquals(correctFrame.scoreCalc(corFrame), 99);
	}
		
	@Test
	public void isInvalidThrow(){
		String invThrow = "45-57-36-27-62-63-81-18-90-72";
		assertEquals(invalidThrow.scoreCalc(invThrow), 0);
	}

	public void isPerfectGame(){
		String perfect = "X-X-X-X-X-X-X-X-X-XXX";
		assertEquals(perfectGame.scoreCalc(perfect), 300);
	}

	@Test
	public void isInvalidFrame(){
		String invFrame = "45-54-21-36-27-62-63-81-18-90-72";
		assertEquals(invalidFrame.scoreCalc(invFrame), 0);
	}
}

