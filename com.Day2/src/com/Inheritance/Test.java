package com.Inheritance;

public class Test 
{

	public static void main(String[] args) 
	{
		String a="Manoj";
		String b="dinesh";
		
		if(a==b)
		{
			System.out.println("true");
		}
		
		else {
			System.out.println("false");
		}
		
		System.out.println(a==b);
		System.out.println(a.equals(b));

		b="kumar";
		System.out.println(b);
		
		String c=new String("kumar_1");
		System.out.println(c);
		c="kumar_2";
		System.out.println(c);
	}

}
