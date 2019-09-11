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
public class ReverseArray {
 
    public static void main(String[] args) {
        
   // int[] data= new int[]{1,2,8,4,5};
        String[] data= new String[]{"1","2","3","4","5"};
        System.out.println(Arrays.toString(data));
        int rotation=4;
        String[] temp=data;
        while(rotation>0)
        {
            temp=reverserArray(temp);
           
            rotation--;
        }
        System.out.println(Arrays.toString(temp));
    }

    private static String[] reverserArray(String[] data) {
    String[] res= new String[data.length];
    //int j=data.length-1;
    //rotate 1 time
    for(int i=0;i<data.length;i++)
    {
       int j=i-1;
              if(j==-1)
              {
                  j+=data.length;
                  res[j]=data[i];
              }
              else
              {
                  res[j]=data[i];
              }
    }
    return res;
    }
          
}
