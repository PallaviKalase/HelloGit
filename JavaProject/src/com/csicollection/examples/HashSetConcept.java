package com.csicollection.examples;

import java.util.HashSet;

public class HashSetConcept
{

	public static void main(String[] args)
	{
		HashSet<String> a1= new HashSet<>();//Print in UnOrder 
		a1.add("Sunday");
		a1.add("Monday");
		a1.add("Tuesday");
		a1.add("Wednesday");
		a1.add("Thursday");
		a1.add("Friday");
		a1.add("Saturday");
		a1.add("Monday");//does not add duplicate values
		/*for(String WeekDays:a1)
		{
			System.out.println(WeekDays);
		}*/
		a1.forEach(System.out::println);

	}

}
