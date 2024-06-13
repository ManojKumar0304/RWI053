package com.Throws;

public class Example_1 {
	
	void StudentDetails() throws InterruptedException 
	{
		System.out.println("shiva is Sleeping");
		Thread.sleep(2000);
		System.out.println("shiva is Swimming ");
	}
	
	void hod() throws InterruptedException
	{
		StudentDetails();
	}
	
	void principle()
	{
		try
		{
			hod();
		} 
		catch (InterruptedException e)
		{
			System.out.println(e);
			e.printStackTrace();
			
		}
	}
	
	void officeboy()
	{
		principle();
	}
	public static void main(String[] args) 
	{
		Example_1 e =new Example_1();
		
		e.principle();

	}

}
