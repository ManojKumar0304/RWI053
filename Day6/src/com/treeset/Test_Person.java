package com.treeset;


import java.util.Set;
import java.util.TreeSet;

public class Test_Person
{

	public static void main(String[] args) 
	{ 
		Set<Person> persons = new TreeSet<>(new personAddressComparator());
		
		persons.add(new Person(1,"Manoj","Gadwal"));
		persons.add(new Person(2,"Dinesh","Hyderabad"));
		persons.add(new Person(3,"Abhilash","delhi"));
		persons.add(new Person(4, "Karthick", "Mumbai"));
		
		System.out.println(persons );
		
		for (Person person : persons) 
		{
			System.out.println(person);
		}
		
		
		
		
		
	}

}
