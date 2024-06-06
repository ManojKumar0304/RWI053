package com.Inheritance;

public class Multi_Level_Test
{

	public static void main(String[] args) 
	{
		Travelling t=new Travelling();
		t.playing();
		t.Singing();
		t.Travelling();
		

	}
	

}
class Playing
{
	public void playing()
	{
		System.out.println("I like Cricket....");
	}
	
}
class Singing extends Playing
{
	public void Singing()
	{
		System.out.println("I Like Music....");
	}

}
class Travelling extends Singing
{
	public void Travelling()
	{
		System.out.println("I LIKE TRAVELLING....");
	}
}
