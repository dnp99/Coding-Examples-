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
public class Mutitasking  {
    
 public static void main(String args[]){  
  Runnable r1=new Runnable(){  
    public void run(){  
      System.out.println("task one");  
    }  
  };  
  
  Runnable r2=new Runnable(){  
    public void run(){  
      System.out.println("task two");  
    }  
  };  
      
  Thread t1=new Thread(r1);  
  Thread t2=new Thread(r2);  
  
  t1.start();  
  t2.start();  
 }  


}  
