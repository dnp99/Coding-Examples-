/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deeppatel.codingexample;

import java.util.HashMap;

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
        HashMap<Integer,Boolean> cycleMap=new HashMap<Integer,Boolean>();
        Node current=head;
        while(current!=null)
        {
            cycleMap.put(current.data,true);
            if(cycleMap.containsKey(current.next))
            {
                return true;
            }
            current=current.next;
        }
        return false;
        
        //Without using hashtable- two pointers
//        if(head==null)
//            return false;
//        Node fast=head.next;
//        Node slow=head;
//        while(fast!=null && fast.next!= null && slow!=null)
//        {
//            if(fast==slow)
//            {
//                return true;
//            }
//            fast=fast.next.next;
//            slow=slow.next;
//        }
//        return false;
    }
    

    public LinkedList1(){
        head=new Node();
        size=10;
    }
    
    public static void main(String[] args) {
        LinkedList1 ll = new LinkedList1();
        ll.append(10);
        ll.append(20);
        ll.prepand(10);
        Node find=find(20);
        ll.printList(ll);
        System.out.println("Found: "+ find.data + " Next " + find.next);
        System.out.println(containsCycle(ll));
        
    }
}
