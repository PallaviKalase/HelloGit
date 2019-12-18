package com.csicodes.examples;

import java.util.Scanner;

public class Nestedifelse 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marks =");
		int marks=sc.nextInt();
		if(marks>68)
		{
			System.out.println("DISTINCTION");
		}
		else if(marks<68&&marks>=60)
		{
			System.out.println("FIRST CLASS");
		}
		else if(marks<60&&marks>=55)
		{
			System.out.println("HIGHER SECOND CLASS");
		}
		else if(marks<55&&marks>=50)
		{
			System.out.println("SECOND CLASS");
		}
		else if(marks<50&&marks>=40)
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
	}

}
