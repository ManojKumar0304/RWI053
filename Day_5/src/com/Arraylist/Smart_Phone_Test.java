package com.Arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Smart_Phone_Test 
{

	public static void main(String[] args) 
	{
		ArrayList<SmartPhone>phones=new ArrayList<>();
		phones.add(new SmartPhone("I phone", "I phone 14", 25000.00));
		phones.add(new SmartPhone("Realme", "Realme_5 pro",260000.00));
		phones.add(new SmartPhone("Oppo","oppo neo ", 30000.00));
		phones.add(new SmartPhone("Vivo","Vivo 11", 50000.00));
		
		System.out.println(phones);
		
		for (SmartPhone smartPhone : phones) {
			
			System.out.println(smartPhone);
		}
		
		Collections.sort(phones,new Brand());
		
		System.out.println("\nAfter sorting by brand:");
		
		for (SmartPhone smartPhone_2 : phones) {
			System.out.println(smartPhone_2);
		}
		
	}

}
