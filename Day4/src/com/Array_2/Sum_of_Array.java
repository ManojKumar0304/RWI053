package com.Array_2;

import java.util.Scanner;

public class Sum_of_Array 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int number,i,sum=0;
		
		
		System.out.println("enter the size of the Array");
		number=sc.nextInt();
		
		int [] a=new int[number];
		
		System.out.println("enter the element of the Array");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("The sum of the Array = "+sum);
		sc.close();

	}

}
