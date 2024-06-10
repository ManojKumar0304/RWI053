package com.Array_2;

import java.util.Scanner;

public class Odd_Position
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		int number,i;
		
		System.out.println("enter the size of the array");
		number=sc.nextInt();
		
		int[] a=new int[number];
		
		System.out.println("enter the element of the Array");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("=========> Odd position <===========");
		
		for(i=0;i<a.length;i=i+2)
		{
			System.out.println(a[i]);
		}
		

	}

}
