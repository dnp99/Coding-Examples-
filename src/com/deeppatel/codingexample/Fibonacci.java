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
public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(5));
        System.out.println(median(new int[]{1,3,5},new int[]{2,44,65}));
    }
      public static int fibonacci(int number){
       if(number==0||number==1)
           return 1;
       else
           return fibonacci(number-1)+fibonacci(number-2);
    }
      public static double median(int[] inp1,int[] inp2)
      {
          int[] res= new int[inp1.length+inp2.length];
          int j=0;
          if(inp1.length==inp2.length)
          {
              for(int i=0;i<inp1.length;i++)
              {
                  if(inp1[i]<inp2[i]){
                    res[j]=inp1[i];
                    j++;
                    res[j]=inp2[i];
                    j++;
                  }
                  else
                  {
                    res[j]=inp2[i];
                    j++;
                    res[j]=inp1[i];
                    j++;
                  }
              }
              System.out.println(Arrays.toString(res));
              int len=res.length;
              if(len%2!=0)
              {
                  return res[len/2];
              }
              else
              {
                  return (double)(res[(len-1)/2]+res[(len)/2])/2;
              }
          }
          else
              return 0;
      }
}
