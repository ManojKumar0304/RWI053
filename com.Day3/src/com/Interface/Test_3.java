package com.Interface;

interface Fan
{
	void run();
}
interface Cooler
{
	void print();
}
class Home implements Fan,Cooler
{

	@Override
	public void print()
	{
		System.out.println("USING ALL SEASONAL DAYS....");
		
	}

	@Override
	public void run()
	{
		System.out.println("ONLY IN SUMMER SEASON...");
	}
	
}

public class Test_3 
{

	public static void main(String[] args) 
	{
		Home h=new Home();
		h.run();
		h.print();
		
		

	}

}
