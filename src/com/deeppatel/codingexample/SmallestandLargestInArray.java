/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deeppatel.codingexample;

/**
 *
 * @author patel
 */
public class SmallestandLargestInArray {
    
    public static void main(String[] args) {
        int[] data= new int[]{12,34,56,34,9};
        findSmallest(data);
        findLargest(data);
    }


    private static void findSmallest(int[] data) {
        int small=0;
        small=data[0];
        for(int i=0;i<data.length;i++)
        {
            if(data[i]<small)
            {
                small=data[i];
            }
        }
        System.out.println("Small : "+small);
    }

    private static void findLargest(int[] data) {
    int large=0;
        large=data[0];
        for(int i=0;i<data.length;i++)
        {
            if(data[i]>large)
            {
                large=data[i];
            }
        }
        System.out.println("Small : "+large);
    }
    
}
