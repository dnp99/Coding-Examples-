/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deeppatel.codingexample;

import java.util.Arrays;

/**
 *
 * @author patel
 */

//Find missing number from cont. array
public class MissingNumberFromArray {
    static int k=0;
    public static void main(String[] args) {
        //missing 1 number
        int[] data1 = new int[]{1,2,3,5};
        //missing 2 number
        int[] data2 = new int[]{1,2,3};
        int size=5;
         System.out.println("input: "+Arrays.toString(data2)+" Size:"+size);
        getMissingNumber(data2, size);
        
    }
    
    private static void getMissingNumber(int[] data,int size)
    {
        if(size-1==data.length)
        {
            //use n*(n+1)/2
            double total=size*(size+1)/2;
            int missingNum=0;
            for(int i=0;i<data.length;i++)
            {
                if(i==0)
                    missingNum=(int)total-data[i];
                else
                    missingNum-=data[i];
                 
            }
            System.out.println(missingNum);
        }
        else
        {
            int count=size-data.length;
            k=count-count;
            System.out.println("total missing num: "+count);
            double total=size*(size+1)/2;
             int missingNumTotal=0;
            for(int i=0;i<data.length;i++)
            {
                if(i==0)
                    missingNumTotal=(int)total-data[i];
                else
                    missingNumTotal-=data[i];
                 
            }
            System.out.println("Sum of missing numbers: "+missingNumTotal);
            int[] num= new int[count];
            System.out.println("Missing Numbers are: ");
            for(int i=1;i<=size;i++)
            {
                boolean flag=true;
                for(int j=0;j<data.length;j++)
                {
                    if(data[j]==i)
                    {
                       flag=false;
                       break;
                    }
                    
                }
                //if flag=true missing number found
                if(flag==true)
                {
                    System.out.println((i));
                }
            }
        }
        
        
    }
    
}
