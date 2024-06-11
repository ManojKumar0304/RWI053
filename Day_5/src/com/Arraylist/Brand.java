package com.Arraylist;

import java.util.Comparator;

public class Brand  implements Comparator<SmartPhone>
{

	@Override
	public int compare(SmartPhone p1, SmartPhone p2) {
		
		return p1.getBrand().compareTo(p2.getBrand());
	}
	

}
