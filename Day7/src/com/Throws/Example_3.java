package com.Throws;

public class Example_3 {
	
	void m1()
	{
		System.out.println(10/0);
	}
	
	void m2()
	{
		m1();
	}
	
	void m3()
	{
		try 
		{
			
		m2();
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}
		finally 
		{
			System.out.println("rest of the code executed");
		}
	}
	
	

	public static void main(String[] args)
	{
		Example_3 e =new  Example_3();
		
		e.m3();
		
		

	}

}
