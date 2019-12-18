package com.csicorejava.examples;

import java.util.ArrayList;
import java.util.List;

public class AutoboxingUnboxing
{
	private static int sumOfOddnumbers(List<Integer> list) 
	{

		int sum=0;
		for(Integer i:list)
		{
			if(i%2!=0)
				sum+=i;
		}
		return sum;
	}

public static void main(String[] args) 
{
	List<Integer> list=new ArrayList<>();
	for(int i=0;i<10;i++)
	list.add(i);
	int sumOdd=sumOfOddnumbers(list);
	System.out.println("\n Sum of odd number: "+sumOdd);
}

}