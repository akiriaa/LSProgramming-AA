package final1;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.FileNotFoundException;
import java.util.List;

import org.junit.Test;
public class PersonTesting {
	/**
	 * tests readPerson method
	 * @throws FileNotFoundException
	 * @throws final1.FileNotFoundException
	 */
	@Test
	public void ReadPerson() throws FileNotFoundException, final1.FileNotFoundException {
		List<Person> list = Person.readPersons("final1\\Filename.csv");
		assertTrue(list.size() > 0);
	}
	/**
	 * tests equals method
	 * @throws FileNotFoundException
	 */
	@Test
	public void PersonEqual() throws FileNotFoundException {
	   Person p1 = new Person("Fred Smith", 29);
	   Person p2 = new Person("Fred Smith", 29);
	   boolean equalStatus = p1.equals(p2);
	   assertTrue(equalStatus);
	}
	/**
	 * tests equals method
	 * @throws FileNotFoundException
	 */
	@Test
	public void PersonNotEqual() throws FileNotFoundException {
		Person p1 = new Person("Red Smith", 34);
		Person p2 = new Person("Fred Smith", 34);
		boolean equalStatus = p1.equals(p2);
		assertFalse(equalStatus);
	}
}
