/**
 * 
 */
package org.tutorial.java.lambda.person;

import java.util.ArrayList;
import java.util.List;

import org.tutorial.java.lambda.entity.Person;

/**
 * @author deepa
 *
 */
public class PersonService {

	public List<Person> getPersonList(){
		List<Person> persons = new ArrayList<>();
		
		persons.add(new Person("Sachin",43));
		persons.add(new Person("Saurav",43));
		persons.add(new Person("Rahul",44));
		
		persons.add(new Person("Rohit",27));
		persons.add(new Person("Hardik",25));
		persons.add(new Person("Dhoni",33));
		
		
	
		
		return persons;
	}
	
	
}
