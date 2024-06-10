package com.Array_2;

import java.util.Scanner;

public class Reverse_Array
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		int number,i;
		
		System.out.println("enter the size of the Array");
		number=sc.nextInt();
		
		int[] a=new int[number];
		
		System.out.println("enter the elements of the Array");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("============> Reverse the Array <======");
		for(i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
		

	}

}
