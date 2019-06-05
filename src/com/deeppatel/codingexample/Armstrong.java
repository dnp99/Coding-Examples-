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
public class Armstrong {
    public static void main(String[] args) {
//        System.out.println("ArmStrong: "+checkArmstrong(15));
        String t="12 4";
        System.out.println(t.replaceAll(" ",""));
    }
    
    public static boolean checkArmstrong(int num)
    {
        int org=num;
//         System.out.println("1");
        if(num==0|| num==1)
        {
            
         System.out.println("2");
            return true;
        }
        else{
            
//         System.out.println("3");
            int temp=0;
            while(num>0)
            {
                temp+=(int)Math.pow((num%10), 3);
                System.out.println(temp);
                num=num/10;
                
            }
            if(temp==org)
                return true;
            else{
                return false;
            }
            
        }
        
    }
}
