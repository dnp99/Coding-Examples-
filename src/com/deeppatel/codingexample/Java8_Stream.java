/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deeppatel.codingexample;

import java.util.*;
import java.util.stream.Stream;

/**
 *
 * @author patel
 */
public class Java8_Stream {
    
    static String[] name={"ww","dd","rr","xx"};
    static Integer age[]={50,60,30,40};
    
    static List<String> names=Arrays.asList(name);
    static List<Integer> ages=Arrays.asList(age);
    
    public static void main(String[] args) {
        //ages.stream().sorted().forEach(System.out::println);        
        ages.stream().
                filter(s-> s>50).
                map(s->s*2).
                forEach(System.out::println);
        
    }
    
}
