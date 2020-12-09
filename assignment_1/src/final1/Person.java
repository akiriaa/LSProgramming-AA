package final1;

import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.util.Scanner;
import java.util.Collections;
/**
 * 
 * @author tilic
 *
 */
public class Person implements Comparable<Person>{
	private String name; 
    private int age; 
    
    /**
     * 
     * @param name of person
     * @param age of person
     */
    public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
    /**
     * 
     * @return age
     */
    public int getAge() {
        return age;
    }
    /**
     * 
     * @param fileName csv file
     * @return list of Person objects
     * @throws FileNotFoundException
     * @throws java.io.FileNotFoundException
     */
	public static List<Person> readPersons(String fileName) throws FileNotFoundException, java.io.FileNotFoundException {
		List<Person> names = new ArrayList<>();
		System.out.println(fileName);
		Scanner file = new Scanner(new File(fileName));
		System.out.println("here1");
		while (file.hasNext()){
			String line = file.next();
			String[] person = line.split(",");
			int pAge = Integer.parseInt(person[1]);
			Person list = new Person(person[0], pAge);
			System.out.println("here2");
			names.add(list);
		}	
		file.close();
		Collections.sort(names);
		return names;
	}
	/**
	 * Override method that checks if two people are the same
	 * return true if persons equal, otherwise false
	 */
	@Override
	public boolean equals(Object obj) {
		Person otherPerson = (Person) obj; 
		if (name.equals(otherPerson.name) && age==otherPerson.age) {
	    	return true;
	    }
	    return false;
	}
	
	/**
	 * Override method that returns person name and age in string form
	 */
	@Override
	public String toString() {
		String info = "";
		info += name + " ";
		info += age;
		return info;
	}
	
	/**
	 * Override method that complements Comparable<Person>
	 */
	@Override
	public int compareTo(Person other) {
		return this.getAge()-other.getAge();
	}
	
}
