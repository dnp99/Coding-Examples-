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
public class PalindromString {
    public static void main(String[] args) {
        String input="hooh";
        String result=checkPalindrom(input);
        System.out.println("input: "+input+ "\nReversed String: "+result);
        System.out.println("Palindrom: "+input.equalsIgnoreCase(result));
        
    }

    private static String checkPalindrom(String input) {
        String res="";
        int k=input.length()-1;
        for(int i=0;i<input.length();i++)
        {
           // System.out.println(input.charAt(k));
            res+=input.charAt(k);
            k--;
        }
        
        return res;
    }
    
}
