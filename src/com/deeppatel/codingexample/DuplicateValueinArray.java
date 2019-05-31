/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deeppatel.codingexample;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author patel
 */

public class DuplicateValueinArray {
    public static void main(String[] args) {
        int[] data= new int[]{1,1,3,3,4};
        // For only one duplicate value in array
        getDuplicate(data);
        //For more than one duplicate value
        getDuplicateSet(data);
    }
    
    private static void getDuplicateSet(int[] data)
    {
        Set<Integer> ary= new HashSet<Integer>();
        for(int temp:data)
        {
            if(!ary.add(temp)){
                System.out.println(temp);
            }
        }
        
    }
    
    
    
    //BruteForce
    private static void getDuplicate(int[] data)
    {
        
        
        int dup=0;
        boolean flag=false;
        for(int i=0;i<data.length;i++)
        {
            
            
            for(int j=0;j<data.length;j++)
            {
                if(j!=i)
                {
                    if(data[j]==data[i])
                    {
                        dup=data[i];
                        flag=true;
                        break;
                    }
                }
            }
        }
        if(flag)
        {
            System.out.println("Duplicate value found "+dup);
        }
        else{
            System.out.println("No duplicate value found");
        }
    }
}
