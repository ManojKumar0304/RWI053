package com.HashTable;

import java.util.Hashtable;
import java.util.Map;

public class Test_Book 
{

	public static void main(String[] args) 
	{
		Hashtable<Integer,Book>books=new Hashtable<>();
		
		Book B1=new Book(1,"Java","James Gousling",2500.00);
		Book B2=new Book(2,"Java","James Gousling",2500.00);
		Book B3=new Book(3,"Java","James Gousling",2500.00);
		Book B4=new Book(4,"Java","James Gousling",2500.00);
		Book B5=new Book(5,"Java","James Gousling",2500.00);
		
		books.put(1, B1);
		books.put(2, B2);
		books.put(3, B3);
		books.put(4, B4);
		books.put(5, B5);
		
		for (Map.Entry<Integer,Book> books_1:books.entrySet()) 
		{
			int key =books_1.getKey();
			Book values=books_1.getValue();
			
			System.out.println(" key = "+key);
			System.out.println(values.Bookid+" "+values.Bookname+" "+values.Bookauthor+" "+values.BookPrice);
			
		}
		

	}

}
