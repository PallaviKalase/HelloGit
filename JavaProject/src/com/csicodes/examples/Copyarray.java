package com.csicodes.examples;

public class Copyarray 
{
	public static void main(String[] args) 
	{
	int arr1[]={10,20,30,40,50};
	int arr2[]=new int[arr1.length];
	
	for(int i=0;i<arr1.length;i++)
	{
		arr2[i]=arr1[i];
	}
	
	System.out.println("Elements of original array");
	
	for(int i=0;i<arr1.length;i++)
	{
	System.out.println(arr1[i]+"");
	}
	System.out.println("Elements of new array");
	
	for(int i=0;i<arr2.length;i++)
	{
		System.out.println(arr2[i]+"");
	}

	}
}
