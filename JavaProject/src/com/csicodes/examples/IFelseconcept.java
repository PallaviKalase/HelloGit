package com.csicodes.examples;

import java.util.Scanner;

public class IFelseconcept 
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("\nEnter the age=");
		int age=sc.nextInt();
		if(age>18)
		{
			System.out.println("Eligible for voting...");
		}
		else
		{
			System.out.println("Not Eligible for voting...");
		}

	}

}
