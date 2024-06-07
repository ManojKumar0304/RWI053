package com.Abstraction;

abstract class Bank
{
	abstract int rateofInterest();
}

class UnionBank extends Bank
{
	int rateofInterest() 
	{
		return 5;
	}
	
}

class Sbi extends Bank
{
	int rateofInterest() 
	{
		return 6;
		
	}
	
}





public class Test_3_Bank 
{

	public static void main(String[] args) 
	{
		
		Bank b1= new UnionBank();
		System.out.println("Rate of Interest of UnionBank ====> "+b1.rateofInterest()+"%");
		
		Bank b2= new Sbi();
		System.out.println("Rate of Interest of SBi =====> "+b2.rateofInterest()+"%");
	}

}
