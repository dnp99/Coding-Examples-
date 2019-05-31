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
public class RemoveDuplicateFromArray {
    
    public static void main(String[] args) {
        int[] data= new int[]{1,1,1,2,3,4,5,5};
        
        System.out.println(Arrays.toString(getArray(data)));
    }

    private static int[] getArray(int[] data) {
        int pre=data[0];
        Arrays.sort(data);
        int[] res= new int[data.length];
        System.out.println(res[0]);
        res[0]=data[0];
        for(int i=1;i<data.length;i++)
        {
            if(pre!=data[i])
            {
                res[i]=data[i];
            }
            pre=data[i];            
        }
        return res;
    }
}
