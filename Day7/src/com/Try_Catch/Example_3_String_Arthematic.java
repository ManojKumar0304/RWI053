package com.Try_Catch;

import java.util.Scanner;

public class Example_3_String_Arthematic 
{

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		
		
		
		
		try 
		{
			String s =null;
			
			int number =10;
			
			int sum=number%0;
		System.out.println(sum);
		
		System.out.println(s.length());
		
		}
		catch (Exception e) {
			System.out.println(e);
		}
		finally
		{
			System.out.println("rest of the code executed normally");
		}
	}

}
