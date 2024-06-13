package com.Throw;

import java.util.Scanner;


class InvalidAgeException extends RuntimeException 
{
    public InvalidAgeException(String message)
    {
        super(message);
    }
}

public class Example_1_Age {
    
    static void age_1(int Age) {
        if (Age >= 18) {
            System.out.println("Eligible for Marriage");
        } else {
            throw new InvalidAgeException("Age is not valid for marriage.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int Age;
        
        System.out.println("Enter the Age:");
        Age = sc.nextInt();
        
        try {
            Example_1_Age.age_1(Age);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}
