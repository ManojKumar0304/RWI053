package com.Array_2;

import java.util.Scanner;

public class Left_Rotate
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int number, i, j, first, leftRotation;
        
        System.out.println("Enter the size of the array:");
        number = sc.nextInt();
        
        int[] a = new int[number];
        
        System.out.println("Enter the elements of the array:");
        for (i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        
        System.out.println("Enter the number of left rotations:");
        leftRotation = sc.nextInt();
        
        System.out.println("Original array:");
        for (i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        
        
        for (i = 0; i < leftRotation; i++) {
            first = a[0];
            for (j = 0; j < a.length - 1; j++) {
                a[j] = a[j + 1];
            }
            a[a.length - 1] = first;
        }
        
        System.out.println("Array after left rotation:");
        for (i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }
    }
}
