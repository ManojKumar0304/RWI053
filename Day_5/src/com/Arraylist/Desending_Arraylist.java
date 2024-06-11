package com.Arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Desending_Arraylist
{
    public static void main(String[] args)
    {
        ArrayList<Integer> number = new ArrayList<>();
        
        number.add(10);
        number.add(8);
        number.add(6);
        number.add(7);
        number.add(9);
        
        
        Collections.sort(number, Collections.reverseOrder());
        
        
        for (int num : number)
        {
            System.out.println(num);
        }
    }
}
