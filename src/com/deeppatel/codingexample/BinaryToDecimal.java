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
public class BinaryToDecimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(getDecimal("100100"));
        System.out.println("RES:"+getResult(getDecimal("100100")));
    }

    public static int getDecimal(String binary) {
        int len = binary.length();
        len--;
        int dec = 0;
        int temp;
        for (int i = 0; i < binary.length(); i++) {
            // System.out.println(binary.charAt(i));                    
            dec += Character.getNumericValue(binary.charAt(i)) * (Math.pow(2, len));
            len--;
        }
        return (dec);
    }

    public static  int getResult(int decimal) {
        int flag = 0;
        int result=0;

        double temp = 0;
        for (int i = 0; Math.pow(2, i) < decimal; i++) {
            if (decimal % (int) (Math.pow(2, i)) == 0) {
                result=i;
            }

        }
        return result;
    }
}
