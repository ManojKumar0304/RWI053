package com.Try_Catch;

import java.util.Scanner;

public class Examole_1
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		int number,sum;
		System.out.println("enter the number ");
		number=sc.nextInt();
		
		
		

		try {
			sum=number%0;
			
			System.out.println(sum);
			
		}
		catch (Exception e) 
		{
			System.out.println(e);
			
		}
		System.out.println("connection closed");
	}

}
