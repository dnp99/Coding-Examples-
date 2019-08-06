/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deeppatel.codingexample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * @author patel
 */
public class LinkedList1 {

    public class Node {

        Node next;
        int data;

        public Node(int data) {
            this.data = data;
        }
        
        public Node(){
            this.data=-1;
            this.next=null;
        }
        
        public Node(int data, Node next)
        {
            this.data=data;
            this.next=next;
        }
    }

    //pointe to root node and size of LL
    static Node head;
    int size;

    public void append(int data) {
        if (head.data == -1) {
            head = new Node(data);
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node(data);
    }

    //Set new Head Value 
    public void prepand(int data) {
        Node newHead = new Node(data);
        newHead.next = head;
        head = newHead;
    }

    public void deleteWithValue(int data) {
        if (head == null) {
            return;
        }
        if (head.data == data) {
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                return;
            }
        }
    }
    
    public static  Node find(int data)
    {
        Node current=head;
        while(current.next!=null)
        {
            if(current.next.data==data){
                return current.next;
            }
            current=current.next;        
        }
        return null;
    }
    
    public void printList(LinkedList1 list)
    {
        Node current=head;
        while(current!=null)
        {
            System.out.print(current.data+" -> ");
            current=current.next;
        }
                
    }
    // Check if linkedlist contains cycle 
    public static boolean containsCycle(LinkedList1 list)
    {
        //Using hashtable
//        HashMap<Integer,Boolean> cycleMap=new HashMap<Integer,Boolean>();
//        Node current=head;
//        while(current!=null)
//        {
//            cycleMap.put(current.data,true);
//            if(cycleMap.containsKey(current.next))
//            {
//                return true;
//            }
//            current=current.next;
//        }
//        return false;
        
        //Without using hashtable- two pointers
        if(head==null)
            return false;
        Node fast=head.next;
        Node slow=head;
        while(fast!=null && fast.next!= null && slow!=null)
        {
            if(fast==slow)
            {
                return true;
            }
            fast=fast.next.next;
            slow=slow.next;
        }
        return false;
    }
    

    public LinkedList1(){
        head=new Node();
        size=10;
    }
    
    //middle of linked list
    public static void middleElement(LinkedList1 ll)
    {
        //Brute Force
//       Node current =head;
//       int size=0;
//       while(current!=null)
//       {
//           size++;
//           current=current.next;
//       }
//       int middle=size/2;
//       current = head;
//       int cnt=0;
//       while(current!=null)
//       {
//           
//           if(cnt==middle)
//           {
//               System.err.println(current.data);
//           }
//           cnt++;
//           current=current.next;
//       }
        
        //Two pointers
        
        Node slow=head;
        Node fast=head;
        
        while(fast!=null)
        {
            if(fast.next==null)
            {
                System.out.println("Middle element: " + slow.data);    
                break;
            }
            slow=slow.next;
            fast=fast.next.next;
        }
        
    }
    
    //Delete the elements in an linked list whose sum is equal to zero
    
    public static void delete(LinkedList1 ll)
    {
        LinkedList1 lltemp=ll;
//        HashMap<Integer,Boolean> temp= new HashMap<Integer,Boolean>();
        Node current=head;
        ArrayList<Integer> keys= new ArrayList<Integer>();
        while(current!=null)
        {
//            temp.put(current.data, Boolean.TRUE);
            keys.add(current.data);
            current=current.next;
        }
        
        ArrayList<Integer> posv= new ArrayList<Integer>();
        ArrayList<Integer> negv= new ArrayList<Integer>();
        for(int i=0;i<keys.size();i++)
        {
            for(int j=0;j<keys.size();j++)
            {
                //if 10,-10 are two elements
                if(keys.get(i)+keys.get(j)==0)
                {
                    System.out.println("Size "+ keys.size() + keys.get(i)+keys.get(j));
                   
                    keys.remove(keys.indexOf(keys.get(j)));
                    keys.remove(keys.indexOf(keys.get(i)));
                }
                
           }
        }
        
        //sep +ve and -ve
        for(int i=0;i<keys.size();i++)
        {
            if(keys.get(i)>0)
            {
                posv.add(keys.get(i));
            }
            else
                negv.add(keys.get(i));
        }
        
        for(int i=0;i<posv.size();i++)
        {
            for(int j=i+1;j<posv.size();j++)
            {
                if(negv.contains(-(posv.get(i)+posv.get(j))))
                {
                    negv.remove(negv.indexOf(-(posv.get(i)+posv.get(j))));
                    posv.remove(posv.indexOf(posv.get(i)));
                    posv.remove(posv.indexOf(posv.get(j)));
                }
            }
        }
        
        
        
        System.out.println(keys);
        System.out.println(posv);
        System.out.println(negv);
        
        
        
    }
    
    public static void main(String[] args) {
        LinkedList1 ll = new LinkedList1();
        ll.append(30);
        ll.append(-30);
        ll.append(8);
        ll.append(4);
        ll.append(-12);
       ll.append(9);
        ll.append(8);
        ll.append(-8);
         
        //ll.prepand(8);
        //Node find=find(-30);
        ll.printList(ll);
       // System.out.println("Found: "+ find.data + " Next " + find.next);
        System.out.println(containsCycle(ll));
        middleElement(ll);
        delete(ll);
    }
}
