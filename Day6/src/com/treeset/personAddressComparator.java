package com.treeset;

import java.util.Comparator;

public class personAddressComparator implements Comparator<Person>
{

	@Override
	public int compare(Person o1, Person o2) {
		
		return -o1.personAddress.compareTo(o2.getPersonAddress());
	}

}
