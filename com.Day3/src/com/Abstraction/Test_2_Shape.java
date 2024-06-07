package com.Abstraction;

abstract class Shape{

		abstract void print();
		
}
class Bike extends Shape{
	
	void print()
	{
		System.out.println("It contains two wheels..."+"\n"+"We can travell place to place....");
	}
}
class Car extends Shape
{
	void print()
	{
		System.out.println("It contains Four Wheel... "+"\n"+"We can travell place to Place");
	}
	
}
public class Test_2_Shape 
{

	public static void main(String[] args) 
	{
	
		Shape s=new Car();
		s.print();
		
		Shape s1=new Bike();
		s1.print();

	}

}
