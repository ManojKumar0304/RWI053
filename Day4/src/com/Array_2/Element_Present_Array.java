package com.Array_2;

import java.util.Scanner;

public class Element_Present_Array 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		int number,i;
		
		System.out.println("enter the size of the Array");
		number=sc.nextInt();
		
		int[] a=new int[number];
		
		System.out.println("enter the element of the Array ");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("enter the element");
		int element=sc.nextInt();
		
		for(i=0;i<a.length;i++)
		{
			if(element==a[i])
			{
				int position=i;
				System.out.println("The element is = "+element+"\n"+"Position = "+position);
			}
		}
		
	}

}
