package com.csicollection.examples;

import java.util.LinkedList;

public class LinkListConcept 
{

	public static void main(String[] args) 
	{
	
		LinkedList<String> a1= new LinkedList<>();
		a1.add("Sunday");
		a1.add("Monday");
		a1.add("Tuesday");
		a1.add("Wednesday");
		a1.add("Thursday");
		a1.add("Friday");
		a1.add("Saturday");
		a1.add("Tuesday");//Allows duplicate values
		for(String WeekDays:a1)
		{
			System.out.println(WeekDays);
		}
	}

}
