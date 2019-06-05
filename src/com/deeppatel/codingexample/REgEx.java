/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deeppatel.codingexample;

import java.util.regex.Pattern;

/**
 *
 * @author patel
 */
public class REgEx {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("[7]{1}[8]{1}[9]{1}[0-9]{7}", "7893038949"));
    }
    
}
