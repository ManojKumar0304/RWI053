package com.treeset;

import java.util.Comparator;

public class Personid implements Comparator<Person>
{

	@Override
	public int compare(Person p1, Person p2) {
        return Integer.compare(p1.getPersonid(), p2.getPersonid());
    }

}
