package com.Array_2;

import java.util.Scanner;

public class Copy_Array 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int i;

       

        System.out.println("Enter the size of the array_1:");
        int number_1 = sc.nextInt();

        int[] a = new int[number_1];
        int[] b = new int[number_1]; // Ensure b has the same size as a

        System.out.println("Enter the elements of array_1:");
        for(i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        
        for(i = 0; i < a.length; i++) {
            b[i] = a[i];
        }

        System.out.println("Elements of array_1:");
        for(i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        System.out.println("----------------");

        System.out.println("Elements of array_2 :");
        for(i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
}
