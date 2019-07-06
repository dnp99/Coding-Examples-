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
public class Infor3 {
//    
//    Improve the following method as much as possible (preserving the function name and the inputs)
//Ensure that it returns true if and only if both arrays contain the given value.
//Note: The lists may be null and may contain null values.

    public boolean isInBoth(String value, String[] arrayA, String[] arrayB) {
        boolean found = false;

        try {
            if (arrayA.length != 0 && arrayB.length != 0) {
                for (int a = 0; a <= arrayA.length; a++) {
                    if (arrayA[a].equals(value)) {
                        for (int b = arrayB.length - 1; b > 0; b--) {
                            if (arrayB[b].equals(value)) {
                                throw new Exception("Found!");
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            if ("Found!".equals(e.getMessage())) {
                found = true;
            }
        }

        return found;
    }

}
