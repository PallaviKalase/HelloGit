package com.csicodes.examples;

//import java.util.Scanner;

public class DuplicateElementinarr 
{

	public static void main(String[] args)
	{
		int arr[]={1,3,2,4,2,1,6};
		/*Scanner sc= new Scanner(System.in);
		System.out.println("\nEnter the array elements=");
		int n=sc.nextInt();
		int arr[]=new int[n];*/
		System.out.println("\n Duplicate elements in array are");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[j]);
				}
			}
		}

	}

}
