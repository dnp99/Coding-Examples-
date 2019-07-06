/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deeppatel.codingexample;

import java.util.ArrayList;

/**
 *
 * @author patel
 */
public class Infor2 {

    int[] id;

    

    public void findBadCommit(int[] id) {
        getMedian(0, id.length);

    }

    public int getMedian(int low, int high) {
        int result=0;
        int med = (low + high / 2);
        if (med > 0) {
            //Test Passed
            if (executeTest(id[med])) 
            {
                low = med;
                //Change lower limit to med
                getMedian(low, high);

            } else {
                //Test failed look where it last failed
                high = med;
                result = id[med];
                getMedian(low, high);
            }
            
        }
        return result;
    }

    public boolean executeTest(int id) {
        //if()
        return true;
         //elese
        // return false;
    }

}
