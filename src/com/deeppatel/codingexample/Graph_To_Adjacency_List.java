/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deeppatel.codingexample;

import java.util.LinkedList;

/**
 *
 * @author patel
 */
public class Graph_To_Adjacency_List {
    public static void main(String[] args) {
        
        Graph graph = new Graph(5); 
        addEdge(graph, 0, 1); 
        addEdge(graph, 0, 4); 
        addEdge(graph, 1, 2); 
        addEdge(graph, 1, 3); 
        addEdge(graph, 1, 4); 
        addEdge(graph, 2, 3); 
        addEdge(graph, 3, 4); 
       
        // print the adjacency list representation of  
        // the above graph 
        printGraph(graph); 
    }
    
    static class Graph{
        int v;
        LinkedList<Integer> adjList[];
        
        Graph(int data)
        {
            this.v=data;
            this.adjList=new LinkedList[v];
            
            for(int i=0;i<v;i++)
            {
                adjList[i]=new LinkedList<>();
            }
        }
    }
    
    //Add Edge to graph
    static void addEdge(Graph graph,int src, int dest)
    {
        //Edge from source to destination
        graph.adjList[src].add(dest);
        //Unidirectional so des to src
        graph.adjList[dest].add(src);
    }
    
    //Print Graph
    static void printGraph(Graph graph)
    {
        int i1;
        //i1.println();
        for(int i=0;i<graph.v;i++)
        {
            
            System.out.println("Adjacency list of vertex : "+i);
            System.out.println(" Head");
            for(Integer data  : graph.adjList[i])
            {
                System.out.println(" --> " +data);
            }
            System.out.println("\n");
        }
    }
    
}
