package com.Throws;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Example_2 
{
	
	void Student() throws FileNotFoundException
	{
		FileInputStream fil =new  FileInputStream("abc.txt");
	}
	void hod() throws FileNotFoundException
	{
		Student();
	}
	void principle() throws FileNotFoundException
	{
		hod();
	}
	
	void officeboy() throws FileNotFoundException
	{
		principle();
	}
	
	
	public static void main(String[] args) throws FileNotFoundException
	{
		Example_2 e=new Example_2();
		
		e.principle();
		

	}

}
