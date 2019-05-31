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
public class PairofSumEqualToNumber {

    public static void main(String[] args) {
        int[] data = new int[]{1, 2, 3, 4, 5};
        //Sum to be find
        int sum = 7;
        getPairs(data, sum);
    }

    private static void getPairs(int[] data, int total) {
        int count = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = i+1; j < data.length; j++) {
                //if (i != j)
                {
                    if (data[i] + data[j] == total) {
                        System.out.println(" Pair : " + data[i] + " " + data[j]);
                        count++;
                    }
                }
            }
        }
        System.out.println("Total Count: " + count);
    }
}
