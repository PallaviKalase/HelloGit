package com.csicollection.examples;

import java.util.HashMap;
import java.util.Map;

public class HashMapConcept
{

	public static void main(String[] args)
	{
		HashMap<String,String> hm=new HashMap<>();
		hm.put("ID", "121");
		hm.put("NAME", "Pallavi");
		hm.put("SALARY", "300000");
		hm.put("ADDRESS", "Pune");
		hm.put(null, "3434");
		hm.put(null, "1111");
		for(Map.Entry<String, String>m:hm.entrySet())
		{
			System.out.println(m.getKey()+": "+m.getValue());
		}
		
	}

}
