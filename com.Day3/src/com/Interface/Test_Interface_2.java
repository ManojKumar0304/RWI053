package com.Interface;

interface Music
{
	void draw();
}
class medley implements Music
{

	@Override
	public void draw() 
	{
		System.out.println("I LIKE MEDLEY SONGS ....");
		
	}
	
}

class Romatic implements Music
{

	@Override
	public void draw()
	{
		System.out.println("I like Romatic SOngs...");
		
		
	}
	
}




public class Test_Interface_2 
{

	public static void main(String[] args)
	{
		Music m=new medley();
		m.draw();
		
		Music m1=new Romatic();
		m1.draw();
		
		
	}

}
