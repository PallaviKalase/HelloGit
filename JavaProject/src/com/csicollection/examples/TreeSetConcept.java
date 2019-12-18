package com.csicollection.examples;

//import java.util.Iterator;
import java.util.TreeSet;


public class TreeSetConcept
{

	public static void main(String[] args)
	{
		TreeSet<String> a1= new TreeSet<>();//Print in Order i.e alphabetical order
		a1.add("Sunday");
		a1.add("Monday");
		a1.add("Tuesday");
		a1.add("Wednesday");
		a1.add("Thursday");
		a1.add("Friday");
		a1.add("Saturday");
		a1.add("Monday");//does not allow duplicate values
		System.out.println(a1);
		System.out.println("Last element in the list: "+a1.last());
		
		TreeSet clone_set=new TreeSet();
		clone_set=(TreeSet)a1.clone();
		System.out.println("\n Clone TreeSet is: "+clone_set);
		
		TreeSet head_set=new TreeSet();
		head_set=(TreeSet)a1.headSet("Wednesday");
		System.out.println("Head set: "+head_set);
		
		/*TreeSet<String> sub_set=new TreeSet<String>();
		sub_set=(TreeSet)a1.subSet("Sunday", "Friday");
		
		Iterator itr; 
        itr = sub_set.iterator(); */
  
		//System.out.println("\n SubSet of Treeset is: "+sub_set);
		/*for(String WeekDays:a1)
		{
			System.out.println(WeekDays);
		}*/
		//Iterator<String> itr=a1.iterator();
		/*while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		//a1.forEach(System.out::println);
	}
*/
}
}
