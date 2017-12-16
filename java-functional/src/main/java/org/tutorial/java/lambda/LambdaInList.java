package org.tutorial.java.lambda;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.tutorial.java.lambda.entity.Person;
import org.tutorial.java.lambda.person.PersonService;

public class LambdaInList {

	public static void main(String []args) {
		PersonService personService = new PersonService();
		// Print all the Person Name
		List<Person> person = personService.getPersonList();
		System.out.println("ALL THE PERSON");
		person.forEach(p -> System.out.println(p.getName()));
		
		// Sum of Age 
		System.out.println("PERSON WITH AGE>30");
		List<Person> person2 = person.stream().
				filter( p -> p.getAge()>30).collect(Collectors.toList());
		
		person2.forEach(p -> System.out.println(p.getName() +" --->  "
				+ "" + p.getAge()));
		
		//Sorting by Name
		Comparator<Person> nameComparator = (Person s1, Person s2) -> (s1.getName().compareTo(s2.getName()));
		//Collections.sort(person, nameComparator);
		
		//System.out.println("SORTED  PERSON");
		//person.forEach(p -> System.out.println(p.getName()));
		
		//
		List<Person> sortedPerson = person.stream().sorted(nameComparator).collect(Collectors.toList());
		System.out.println("SORTED  PERSON");
		sortedPerson.forEach(p -> System.out.println(p.getName()));
		
		sortedPerson = person.stream().sorted((p1, p2) -> (Integer.compare(p1.getAge(), p2.getAge()))).collect(Collectors.toList());
		System.out.println("SORTED  PERSON WITH AGE");
		sortedPerson.forEach(p -> System.out.println(p.getName() +" --->  "
				+ "" + p.getAge()));
	}
}
