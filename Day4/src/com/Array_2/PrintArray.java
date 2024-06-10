package com.Array_2;

import java.util.Scanner;

public class PrintArray 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int number,i;
		
		System.out.println("enter the size of the array");
		number=sc.nextInt();
		
		int[] a=new int[number];
		
		System.out.println("elements of the array");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

	}

}
