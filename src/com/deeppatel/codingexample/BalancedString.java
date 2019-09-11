/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deeppatel.codingexample;

import java.util.HashMap;
import java.util.Objects;
import java.util.Stack;

/**
 *
 * @author patel
 */
public class BalancedString {
    
    public static void main(String[] args) {
        String inp="abc{}[]";
        System.out.println(isBalanced(inp));
    }
    
    public static boolean isBalanced(String inp){
       //Stack To store last found paranthesis 
       Stack open=new Stack();
       //Hashmap to check if coressponding open paranthesis exist in stack
       HashMap<Character,Character> close = new HashMap<Character,Character>();
       close.put('}', '{');
       close.put(']', '[');
       close.put(')', ')');
       //counter for number of paranthesis
       int count=0;
        //For loop to traverse the input String
       for(int i=0;i<inp.length();i++)
       {
           if(inp.charAt(i)=='('||inp.charAt(i)=='['||inp.charAt(i)=='{'){
               count++;
               open.push(inp.charAt(i));
              
           }
           if(inp.charAt(i)==')'||inp.charAt(i)==']'||inp.charAt(i)=='}'){             
               if(!open.empty())
               {
                    if(((Character)open.pop()== close.get(inp.charAt(i))))
                    count--;
               }
              
           }
       }
        if(count==0)
            return true;
        else
            return false;
    }
    
}
