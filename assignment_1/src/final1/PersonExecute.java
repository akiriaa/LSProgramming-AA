package final1;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class PersonExecute {
	/**
	 * Starts the test case
	 * @param args
	 */
	public static void main(String[] args) {
		Result results = JUnitCore.runClasses(PersonTesting.class);
	    System.out.println(results.wasSuccessful());
	}
}
