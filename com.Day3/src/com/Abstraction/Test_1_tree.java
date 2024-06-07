package com.Abstraction;

abstract class Tree
{
	
	abstract void run();
}

public class Test_1_tree  extends Tree
{

	void run()
	{
		System.out.println("Trees are usefull ...");
		System.out.println("Gives us fruits and oxygen...");
	}
	public static void main(String[] args) 
	{
		Tree t =new Test_1_tree();
		t.run();
	}

}
