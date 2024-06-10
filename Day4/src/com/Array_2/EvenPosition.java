package com.Array_2;

import java.util.Scanner;

public class EvenPosition 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int number,i;
		
		System.out.println("enter the size of the Array");
		number=sc.nextInt();
		
		int[] a=new int[number];
		
		System.out.println("enter the size of the Array");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("=====> EvenPosition <========");
		for(i=1;i<a.length;i=i+2)
		{
			System.out.println(a[i]);
		}
		
	}

}
