package com.Abstraction_2;


abstract class Parent
{
	abstract  void subject();
	abstract void career();
}

class Son extends Parent
{

	@Override
	void subject()
	{
		System.out.println("subject");
		
	}

	@Override
	void career() 
	{
		System.out.println("career");
		
	}
	
}

public class Main_1
{
	public static void main(String[] args)
	{
		Son s=new Son();
		s.subject();
		s.career();
		
	}
	
}
