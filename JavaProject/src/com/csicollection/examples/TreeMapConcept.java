package com.csicollection.examples;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapConcept 
{

	public static void main(String[] args)
	{
		TreeMap<String,String> hm=new TreeMap<>();
		hm.put("ID", "121");
		hm.put("NAME", "Pallavi");
		hm.put("SALARY", "300000");
		hm.put("ADDRESS", "Pune");
		//hm.put(null, "3434");  Null not allowed in TreeMap
		//hm.put(null, "1111");
		for(Map.Entry<String, String> m: hm.entrySet())
		{
			System.out.println(m.getKey()+": "+m.getValue());
		}

	}

}
