package com.file_Handling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Example_2 {

	public static void main(String[] args) throws IOException 
	{
		FileReader reader =new FileReader("man.txt");
		FileWriter witer =new FileWriter("Abhi.txt");
		
		int c;
		
		while((c=reader.read())!=-1)
		{
			System.out.print((char) c);
            witer.write(c);
		}
		
		reader.close();
		witer.close();
		
		
		

	}

}
