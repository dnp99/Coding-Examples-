/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deeppatel.codingexample;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author patel
 */
public class StuctMaxArray {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int heghts;
        List<int[]> test = new ArrayList<int[]>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Heights");
        heghts = Integer.valueOf(sc.nextLine());
        for (int i = 0; i < heghts; i++) {
            System.out.println("For input height :" + i);
                for (int j = 0; j < 1; j++) {
                    int temp = 0;
                    {
                        System.out.println("Enter feet");
                        temp = sc.nextInt();
                        System.out.println("Enter inch");
                        test.add(new int[]{temp, sc.nextInt()});
                    }
                    
                }
        }
        System.out.println("Max Height : "+getMaxHeight(test));
        sc.close();
    }
    
    public static int getMaxHeight(List<int[]> input)
    {
        List<Integer> convertedHeight = new ArrayList<Integer>();
        for(int i=0;i<input.size();i++)
        {
            int[] temp=(input.get(i));
            int formula=(temp[0]*12)+temp[1];
            System.out.println(formula);
            convertedHeight.add(formula);
        }
        Collections.sort(convertedHeight,Collections.reverseOrder());
        return convertedHeight.get(0);
    }

}
