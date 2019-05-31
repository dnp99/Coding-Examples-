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
        String[] data= new String[]{"First","Second","third","fourth"};
        System.out.println(Arrays.toString(data));
        System.out.println(Arrays.toString(reverserArray(data)));
    }

    private static String[] reverserArray(String[] data) {
    String[] res= new String[data.length];
    int j=data.length-1;
    for(int i=0;i<data.length;i++)
    {
        res[j]=data[i];
        j--;
    }
    return res;
    }
          
}
