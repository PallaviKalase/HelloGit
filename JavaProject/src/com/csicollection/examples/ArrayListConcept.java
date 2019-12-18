package com.csicollection.examples;

import java.util.ArrayList;
import java.util.Collections;
//import java.util.Scanner;


//import java.util.Iterator;

public class ArrayListConcept
{

	public static void main(String[] args) 
	{
		//System.out.println("Even Numbers in Array are: ");
		//Scanner s=new Scanner(System.in);
		/*System.out.println("\n Enter the Array Integers: ");
		n =s.nextInt();
		int a[]=new int[n];*/
		//int n, sum = 0;
       /*Scanner s = new Scanner(System.in);
        System.out.print("\n Enter no. of elements you want in array:");
        int n = s.nextInt();
        int a[] = new int[n];
        System.out.println("\n Enter all the elements: ");
		 for(int i = 0; i < n; i++)
	        {
	            a[i] = s.nextInt();
	           // sum = sum + a[i];
	            System.out.println(a[i]);
	        }
		
		/**/
		ArrayList<Integer> a1= new ArrayList<>();
		a1.add(6);
		a1.add(4);
		a1.add(2);
		a1.add(8);
		a1.add(1);
		a1.add(12);
		a1.add(14);
		a1.add(3);
		a1.add(41);//adds duplicate values
		System.out.println("\n Array list in Ascending Order");
		Collections.sort(a1);
		System.out.println(a1);
		System.out.println("\n Array list in Decending order: ");
		Collections.sort(a1,Collections.reverseOrder());
		System.out.println(a1);
		
	
		
		//a1.remove(5);
		/*Iterator<String> itr=a1.iterator();
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}*/
		//a1.forEach(WeekDays->System.out.println(WeekDays));
	//	a1.forEach(System.out::println);
		/*for(String WeekDays:a1)
		{
			System.out.println(WeekDays);
		}*/
	}
}
