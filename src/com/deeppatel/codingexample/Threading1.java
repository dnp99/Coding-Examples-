/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deeppatel.codingexample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author patel
 */
public class Threading1 {
    
 public static void main(String args[]){  
//  TestCallRun2 t1=new TestCallRun2();  
//  TestCallRun2 t2=new TestCallRun2();  
//   TestCallRun2 t3=new TestCallRun2();  
// t1.start();  
// try{  
//  t1.join();  
// }catch(Exception e){System.out.println(e);}  
//  
// t2.start();  
// t3.start();
        ExecutorService executor = Executors.newFixedThreadPool(5);//creating a pool of 5 threads  
        for (int i = 0; i < 10; i++) {  
            Runnable worker = new WorkerThread("" + i);  
            executor.execute(worker);//calling execute method of ExecutorService  
          }  
        executor.shutdown();  
        while (!executor.isTerminated()) {   }  
  
        System.out.println("Finished all threads");  
 }  
} 
    
//class TestCallRun2 extends Thread{  
//   public void run(){  
//  for(int i=1;i<5;i++){  
//    try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}  
//    System.out.println(i);  
//  }  
// }
//}  

class WorkerThread implements Runnable {  
    private String message;  
    public WorkerThread(String s){  
        this.message=s;  
    }  
     public void run() {  
        System.out.println(Thread.currentThread().getName()+" (Start) message = "+message);  
        processmessage();//call processmessage method that sleeps the thread for 2 seconds  
        System.out.println(Thread.currentThread().getName()+" (End)");//prints thread name  
    }  
    private void processmessage() {  
        try {  Thread.sleep(2000);  } catch (InterruptedException e) { e.printStackTrace(); }  
    }  
}  