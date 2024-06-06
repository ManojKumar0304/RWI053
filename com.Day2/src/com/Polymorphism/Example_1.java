package com.Polymorphism;

class Book
{
	public void run()
	{
		System.out.println("Presenting a short story.... ");
	}
}



public class Example_1 extends Book
{

	public void run()
	{
		System.out.println("Writing many stories...");
	}
	public static void main(String[] args) 
	{
		Book b=new Example_1();
		b.run();
		
	}

}
