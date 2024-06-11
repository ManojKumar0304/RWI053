package com.HashTable;

import java.util.Hashtable;
import java.util.Map;

public class Example_1_Hashtable
{

	public static void main(String[] args)
	{
		Hashtable<Integer,String> fruits=new Hashtable<>();
		
		fruits.put(1,"Mango");
		fruits.put(2,"Apple");
		fruits.put(3,"Grapes");
		fruits.put(4,"Kiwi");
		fruits.put(5, "Orange");
		
		for (Map.Entry entry :fruits.entrySet()) 
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
			
			
		}
		
		System.out.println("==========> Removing the value of key <=======");
		
		fruits.remove(3);
		System.out.println(fruits);
		
		
		
	}

}
