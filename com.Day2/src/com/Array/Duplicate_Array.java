package com.Array;

import java.util.Scanner;

public class Duplicate_Array 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        int i, j, number,count=0;
        
        System.out.println("Enter the size of the array:");
        number = sc.nextInt();
        
        int[] a = new int[number];
        
        System.out.println("Enter the elements of the array:");
        for (i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        
        System.out.println("Duplicate elements in the array are:");
        for (i = 0; i < a.length; i++) 
        {
            for (j = i + 1; j < a.length; j++) 
            {
                if (a[i] == a[j])
                {
                	 count++;
                    System.out.println("the element is ===> "+a[j]+" count is ====> "+count);
                    break;  
                }
            }
        }
    }
}
