package com.Array;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        TestEncapsulation t = new TestEncapsulation();
        Scanner scanner = new Scanner(System.in);
       
        System.out.print("Enter your account number: ");
        long accountNumber = scanner.nextLong();
        
        System.out.print("Enter your name: ");
        scanner.nextLine(); 
        String accountName = scanner.nextLine();
        
        System.out.print("Enter your amount: ");
        float amount = scanner.nextFloat();
        
        
        t.setAcccount_Number(accountNumber);
        t.setAccount_Name(accountName);
        t.setAmount(amount);

        
        System.out.println("YOUR ACCOUNT NUMBER ===> " + t.getAcccount_Number());
        System.out.println("YOUR NAME ====> " + t.getAccount_Name());
        System.out.println("YOUR AMOUNT =====> " + t.getAmount());
        
        scanner.close();
    }
}
