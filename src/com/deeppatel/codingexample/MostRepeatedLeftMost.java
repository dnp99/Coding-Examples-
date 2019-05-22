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
/*

Repeated Character Whose First Appearance is Leftmost
Given a string, find the repeated character present first in the string.
Input  : geeksforgeeks
Output : g
(mind that it will be g, not e.)

Input  : abcdabcd
Output : a

Input  : abcd
Output : -1
No character repeats


*/
public class MostRepeatedLeftMost {
    	public static void main(String[] args)
	{
		String temp="deeppzz";
		int pos=findLeftMostChar(temp);
		System.out.println("Most repeated left most character: "+temp.charAt(pos));
	}
	
	public static int findLeftMostChar(String temp) 
	{
		
		for(int i=0;i<temp.length();i++) 
		{
			for(int j=i+1;j<temp.length();j++) 
			{
				if(temp.charAt(i)==temp.charAt(j))
				{
					return i;
				}
				
			}
		}
		return -1;
	}
    
}
