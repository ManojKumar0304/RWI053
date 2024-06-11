package com.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test_Pla
{
	public static void main(String[] args)
	{
		Set<Plant> plants =new HashSet<>();
		
		plants.add(new Plant(1,"Mango_Tree",50.00));
		plants.add(new Plant(2,"Guava_Tree",60.00));
		plants.add(new Plant(3, "papaya_tree",80.00));
		plants.add(new Plant(4, "Apple_tree",1000.00));
		
		System.out.println(plants);
		
		for (Plant plant : plants) {
			
			System.out.println("Plants = "+plants);
		}
		
		Iterator<Plant> ps =plants.iterator();
		
		while(ps.hasNext())
		{
			System.out.println(ps.next());
		}
		
	}

}
