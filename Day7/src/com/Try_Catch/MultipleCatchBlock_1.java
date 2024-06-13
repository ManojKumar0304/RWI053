package com.Try_Catch;

public class MultipleCatchBlock_1 
{

	public static void main(String[] args) 
	{
		
		try {
	    String s =null;
	    System.out.println(s.length());
		
		}
		catch (ArithmeticException e) {
			
			System.out.println("Arthematic execption");
		}
		catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("ArrayIndexOutOfBoundExecption");
			
		}
		catch (Exception e) 
		{
			System.out.println("Parent Exception ");
		}
		finally {
			System.out.println("rest of the code Executed Normally ");
			
		}
	}

}
