package com.file_Handling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Example_1 {

    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("abc.txt");
        FileWriter writer = new FileWriter("Manoj.txt");

        int c;

        while ((c = reader.read()) != -1) {
            System.out.print((char) c);
            writer.write(c);
        }
        
        reader.close();
        writer.close();
        
        System.out.println("Operation closed");
    }
}
