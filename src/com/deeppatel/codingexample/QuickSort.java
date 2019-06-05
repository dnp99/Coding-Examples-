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
public class QuickSort {
    //Divide   
    static int partition(int[] arr,int low,int high)
        {
            int pivot=arr[high];
            int index=low-1;
            
            for(int j=low;j<high;j++)
            {
                
                if(arr[j]<=pivot)
                {
                    index++;
                    int temp=arr[index];
                    arr[index]=arr[j];
                    arr[j]=arr[index];
                }
            }
            int temp=arr[index+1];
            arr[index+1]=arr[high];
            arr[high]=temp;
            
            return index+1;
            
        }    
    static void qSort(int[] arr, int low, int high)
    {
        if(low<high)
        {
            int pi=partition(arr,low,high);
            //System.out.println(pi); 
                    
            //Recursive
            qSort(arr,low,pi-1);
            qSort(arr,pi+1,high);
            
        }
    }
    public static void main(String args[]) 
    { 
  
        int n = 5; 
        int arr[] = { 4, 2, 6, 9, 2 }; 
  
        qSort(arr, 0, n - 1); 
  
        for (int i = 0; i < n; i++) { 
            System.out.print(arr[i] + " "); 
        } 
    } 
      
    
}
