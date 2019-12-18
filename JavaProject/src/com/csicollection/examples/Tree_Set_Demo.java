package com.csicollection.examples;
import java.io.*; 
import java.util.Iterator; 
import java.util.TreeSet; 

public class Tree_Set_Demo { 
	public static void main(String[] args) 
	{ 

		// Creating an empty TreeSet 
		TreeSet<Integer> tree_set = new TreeSet<Integer>(); 

		// Adding the elements using add() 
		tree_set.add(5); 
		tree_set.add(1); 
		tree_set.add(50); 
		tree_set.add(10); 
		tree_set.add(20); 
		tree_set.add(6); 
		tree_set.add(20); 
		tree_set.add(18); 
		tree_set.add(9); 
		tree_set.add(30); 

		// Creating the subset tree 
		TreeSet<Integer> sub_set = new TreeSet<Integer>(); 

		// Limiting the values till 5 
		sub_set = (TreeSet<Integer>)tree_set.subSet(6, 30); 

		// Creating an Iterator 
		Iterator iterate; 
		iterate = sub_set.iterator(); 

		// Displaying the tree set data 
		System.out.println("The resultant values within the sub set: "); 

		// Iterating through the subset 
		while (iterate.hasNext()) { 
			System.out.println(iterate.next() + " "); 
		} 
	} 
} 
