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

//	Given a struct array of type Height, having two elements feet and inches. 
//	Find the maximum height, where height is calculated sum of feet and inches after converting feet into inches.
//
//	Input:
//	First line of input contains number of testcases. For each testcase, 
//	first line of input contains N, number of given heights. Next line contains 2*N number of elements (feet and inches for each N).
//
//	Output:
//	Output maximum height from array.
//
//	Your Task: Your task is to only complete the function of find maximum height from given array.
//
//	Constraints:
//	1<=T<=100
//	1<=N<=105
//	0<=Feet, Inches<=105
//
//	Example:
//	Input:
//	2
//	2
//	1 2 2 1
//	4
//	3 5 7 9 5 6 5 5
//	Output:
//	25
//	93
//
//	Explanation:
//	Testcase 1: (1, 2) and (2, 1) are respective given heights. 
//	After converting both heigths in to inches, we get 14 and 25 as respective heights. So, 25 is the maximum height.   
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
