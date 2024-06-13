package com.file_Handling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Example_3 {

    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream("gn.jpeg");
            fos = new FileOutputStream("Manoj.jpeg");
            int b;
            while ((b = fis.read()) != -1) {
                fos.write(b);
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                if (fis != null) fis.close();
                if (fos != null) fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("Generated successfully");
        }
    }
}
