package com.Array_2;

import java.util.Scanner;

public class Largest_Array 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		int number,i;
		
		System.out.println("enter the size of the Array");
		number=sc.nextInt();
		
		int[] a=new int[number];
		
		System.out.println("enter the element of the Array");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int largest=a[0];
		
		for(i=0;i<a.length;i++)
		{
			if(a[i]>largest)
			{
				largest=a[i];
			}
			
		}
		System.out.println("The Largest element of the Array is = "+largest);

	}

}
