package com.Interface;

interface student
{
	public	void student();
}


public class Test_1 implements student
{

	public void student()
	{
		System.out.println("students.....");
	}
	
	public static void main(String[] args) 
	{
		Test_1 t=new Test_1();
		t.student();
		

	}

}
