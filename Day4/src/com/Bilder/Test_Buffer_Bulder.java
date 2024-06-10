package com.Bilder;

public class Test_Buffer_Bulder
{

	public static void main(String[] args) 
	{
		long startTime=System.currentTimeMillis();
		StringBuffer sb =new StringBuffer("Welcome ");
		
		for(int i=0;i<=10;i++)
		{
			sb.append("Railworld");
			System.out.println(" ..... "+i);
			
		}
		System.out.println("========= ");
		System.out.println("StringBuffer======> "+(System.currentTimeMillis()-startTime+" <======="));
		
		startTime = System.currentTimeMillis();
		StringBuilder sb_1 = new StringBuilder("Welcome_1");
		
		for(int j=0;j<=10;j++)
		{
		    sb_1.append("Railworld_1");
		    System.out.println(" ...... "+j);
		}
		
		System.out.println("StringBuilder =======> "+(System.currentTimeMillis()-startTime)+" <========");
		
	}

}
