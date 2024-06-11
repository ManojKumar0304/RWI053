package com.Arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SortArrayList
{

	public static void main(String[] args)
	{
		ArrayList<String> list_1=new ArrayList<>();
		list_1.add("Mango");
		list_1.add("Apple");
		list_1.add("Banana");
		list_1.add("Grapes");
		
		Collections.sort(list_1);
		
		for(String list:list_1)
		{
			System.out.println(list);
		}
		
		System.out.println("==========> Sorting Numbes <=====");
		
		ArrayList<Integer> number=new ArrayList<>();
		number.add(21);
		number.add(5);
		number.add(11);
		number.add(4);
		number.add(1);
	
		Collections.sort(number);
		
		for (Integer integer : number)
		{
			System.out.println(integer);
		}
	
	}

}
