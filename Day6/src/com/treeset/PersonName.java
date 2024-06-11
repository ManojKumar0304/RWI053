package com.treeset;

import java.util.Comparator;

public class PersonName implements Comparator<Person> 
{

	@Override
	public int compare(Person o1, Person o2) {
		
		return  o1.getPersonName().compareTo(o2.getPersonName()) ;
	}

}
