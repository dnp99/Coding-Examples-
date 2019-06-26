
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author patel
 */
public class Solution {



  
     public  static int[] rotLeft(int[] a, int d) {
     
        while(d>0)
        {
            int first=a[0];
            for(int i=1;i<a.length;i++)
            {
                a[i-1]=a[i];
                if(i==a.length-1)
                {
                    a[i]=first;
                }
            }
            d--;
        }
        return a;
    }
    

    public static void main(String[] args) throws IOException {
    int[] arr={73642};
        System.out.println( Arrays.toString(rotLeft(arr,60581)));
    }
}

    

