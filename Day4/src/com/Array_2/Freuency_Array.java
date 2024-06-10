package com.Array_2;

import java.util.Scanner;

public class Freuency_Array
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int number, i, element, count = 0;
        
        
        
        System.out.println("Enter the size of the array:");
        number = sc.nextInt();
        
        int[] a = new int[number];
        
        System.out.println("Enter the elements of the array:");
        for (i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        
        System.out.println("Enter the element to count its frequency:");
        element = sc.nextInt();
        
        for (i = 0; i < a.length; i++) {
            if (a[i] == element) {
                count++;
            }
        }
        
        System.out.println("Frequency of element ====>  " + element + " is ====> " + count);
    }
}
