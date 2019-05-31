/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deeppatel.codingexample;

import com.sun.corba.se.impl.orbutil.graph.Graph;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author patel
 */
public class BFS {

    public static void main(String[] args) {
          //The tree:
        //   1
        //  / \
        // 7   9
        // \  / \
        //  8 2 3
        
        Node node1=new Node(1);
        Node node7=new Node(7);
        Node node9=new Node(9);
        Node node8=new Node(8);
        Node node2=new Node(2);
        Node node3=new Node(3);
        node1.left=node7;
        node1.right=node9;
        node7.right=node8;
        node9.left=node2;
        node9.right=node3;
        System.out.println("BFS: ");
        breadthFirstSearch(node1);  
       
    }
            

    private static void breadthFirstSearch(Node node1) {
        List<Node>al= new ArrayList<>();
        al.add(node1);
        while(!al.isEmpty())
        {
            node1=al.get(0);
            if(node1.left!=null)
            {
                int index=al.size();
                al.add(index, node1.left);
                
            }
            if(node1.right!=null)
            {
                int index=al.size();
                al.add(index, node1.right);
            }
            System.out.println(al.get(0).data+" " );
            al.remove(0);
                    
        }
    }
    static class Node{
            
        int data;
        Node left;
        Node right;
        boolean visited;
        //Constructor
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
            this.visited=false;
        }
        }
        

}
