package com.Try_Catch;

import java.util.Scanner;

public class Example_2_String 
{

	public static void main(String[] args) 
	{
		Scanner sc=new  Scanner(System.in);
		
		int number;
		
		System.out.println("enter the number ");
		number=sc.nextInt();
		
	  int [] a =new int[number];
	  
	  System.out.println("element of the Array");
	  
	  for(int i=0;i<a.length;i++)
	  {
		  a[i]=sc.nextInt();
	  }
	  
	  try {
		  System.out.println("connection open");
		
	  System.out.println(a[20]);
	  }
	  catch (ArrayIndexOutOfBoundsException e) 
	  {
		  System.out.println(e);
		
	  }
	  finally 
	  {
		System.out.println("connection closed");
	}

	}

}
