
package com.Array_2;

import java.util.Scanner;

public class Descending_Array
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        int number, i, j;
        
        System.out.println("Enter the size of the array:");
        number = sc.nextInt();
        
        int[] a = new int[number];
        
        System.out.println(" Enter the elements of the array ");
        for (i = 0; i < a.length; i++) 
        {
            a[i] = sc.nextInt();
        }
        
        for (i = 0; i < a.length - 1; i++) 
        {
            for (j = 0; j < a.length - 1 - i; j++) 
            {
                if (a[j] < a[j + 1]) 
                {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        
        System.out.println("============> Array in descending order <===============");
        for (i = 0; i < a.length; i++) 
        {
            System.out.print(a[i] + " ");
        }
        
        sc.close(); 
    }
}
