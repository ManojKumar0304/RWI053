package com.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Cities 
{

	public static void main(String[] args) 
	{
		Set<String> cities = new HashSet<>();
		
		cities.add("Hyderabad");
		cities.add("Chennai");
		cities.add("Mumbai");
		cities.add("Delhi");
		cities.add("Goa");
		
		System.out.println(cities);
		
		System.out.println("-------- using for each loop ------");
		
		for (String string : cities) {
		
			System.out.println("City = "+string);
		}
		
		System.out.println("----------- using While loop ----------");
		
	Iterator<String> city_1=cities.iterator();
	
	
	while(city_1.hasNext())
	{
		String s=   city_1.next();
		System.out.println(s);
		
	}
	
	System.out.println(" ---------- Adding object ---------");
	
	cities.add("Punjab");
	System.out.println(cities);
	
	System.out.println("-------------Removing Object ----------");
	cities.remove("Punjab");
	
	System.out.println(cities);
	
	
	System.out.println("----- Adding obj_1 all to Obj_2");
	HashSet<String> cities_2 =new HashSet<>();
	cities_2.add("Assam");
	cities_2.add("Bihar");
	cities_2.addAll(cities);
	
	System.out.println(cities_2);
	
		
		
		

	}

}
