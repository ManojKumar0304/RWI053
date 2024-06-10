package com.Array_2;

import java.util.Scanner;

public class RotateRight 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int number ,i,j,rightrotate;
		
		System.out.println("enter the size of the Array ");
		number=sc.nextInt();
		
		int [] a=new int[number];
		
		System.out.println("enter the element of the Array");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("enter the number of the Rotate ");
		rightrotate=sc.nextInt();
		
		
		for(i=0;i<rightrotate;i++)
		{
			int last=a[number-1];
			for( j=number-1;j>0;j--)
			{
				a[j]=a[j-1];
				
			}
			a[0]=last;
			
		}
		for(i=0;i<number;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		sc.close();
	}

}
