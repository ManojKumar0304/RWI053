package com.Arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Eample 
{

	public static void main(String[] args)
	{
		ArrayList<String>fruits=new ArrayList<>();
		
		fruits.add("Mango");
		fruits.add("banana");
		fruits.add("guava");
		fruits.add("grapes");
		
		
		System.out.println("Fruits = "+fruits);
		
		for (String fruit : fruits) {
			
			System.out.println(fruit);
		}
		
		System.out.println("========> Sorting order_1 <=======");
		Collections.sort(fruits);
		
		System.out.println(fruits);
		
		
		System.out.println("========> Adding fruits <=======");
		fruits.add("Kiwi");
		fruits.add(1,"Papaya");
		
		System.out.println(fruits);
		
		System.out.println("========> Sorting order_2 <=======");
		
		Collections.sort(fruits);
		
		System.out.println(fruits);
		
		System.out.println("========> Iteration of the Fruits <========");
		
		for(int i=0;i<fruits.size();i++)
		{
			System.out.println("Fruits = "+fruits);
		}
		
		
		
		System.out.println(fruits.get(0));
	}

}
