package com.HashTable;

import java.util.Hashtable;

public class Example_2
{

	public static void main(String[] args)
	{
		Hashtable<Integer,String>names=new Hashtable<>();
		
		names.put(1,"Manoj");
		names.put(2,"Abhilash");
		names.put(3,"vikas");
		names.put(4,"Naveen");
		names.put(5,"Karthick");
		
		System.out.println(names);
		
		System.out.println(names.getOrDefault(2,"not found"));
		
		
		System.out.println("=========> Put if Absent <=======");
		names.putIfAbsent(6,"Dinesh");
		System.out.println(names);

	}

}
