package com.Inheritance;

public class Hierarchical_Level_Test 
{

	public static void main(String[] args) 
	{
		Medley m=new Medley();
		m.medley();
		m.Romatic();

	}

}
class Music
{
	public void Romatic()
	{
		System.out.println("I Like Romatic Songs....");
	}
}
class Singing_1 extends Music
{
	public void Failour()
	{
		System.out.println("Hot toching Songs.... ");
	}
}
class  Medley extends  Music 
{
	public void medley()
	{
		System.out.println("I Like Medley songs....");
	}
}