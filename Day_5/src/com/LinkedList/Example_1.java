package com.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Example_1 
{
	public static void main(String[] args) 
	{
		LinkedList<String> fruits=new LinkedList<>();
		fruits.add("Mango");
		fruits.add("guava");
		fruits.add("grapes");
		fruits.add("banana");
		
		System.out.println(fruits);
		
		for (String string : fruits) 
		{
			
			System.out.println(string);
		}
		
		System.out.println("--------using pop method------");
		
		fruits.pop();
		
		System.out.println(fruits);
		
		System.out.println("--------using add index method------");
		fruits.add(2,"Orange");
		
		System.out.println(fruits);
		
		System.out.println("--------- add first object ---------");
		
		fruits.addFirst("Apple");
		
		System.out.println(fruits);
		
		System.out.println("--------- add last object--------");
		
		fruits.addLast("Mango");
		System.out.println(fruits);
		
		System.out.println("-------- remove using (index) the object ---------");
		 fruits.remove(0);
		 System.out.println(fruits);
		 
		 System.out.println("---------- remove using (Object) NAME ------------ ");
		 fruits.remove("Orange");
		 System.out.println(fruits);
		 
		 System.out.println("========= remove all object========");
		  fruits.clear();
		  System.out.println(fruits);
		  
		  System.out.println("========== get all object ==========="); 
		  
		  fruits.clone();
		  System.out.println(fruits);
		  
		  
		  fruits.add("Mango");
		  fruits.add("Grapes");
		 Iterator<String> fruit=fruits.iterator();
		 
		 
		 
		 while (fruit.hasNext())
		 {
			 System.out.println("fruits "+fruit.next());
			
			
		}
		 fruits.push("Guava");
		 System.out.println(fruits);
		 
		 fruits.poll();
		 
		 System.out.println(fruits);
		 
		 fruits.peekLast();
		 System.out.println(fruits);
		
	}

}
