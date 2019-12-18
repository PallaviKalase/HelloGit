package com.csicollection.examples;

import java.util.ArrayList;

public class ArrayListExample
{
	public static void main(String[] args) 
	{
		ArrayList<String> top5companies=new ArrayList<>();
		System.out.println("\n Is Top 5 companies list empty: "+top5companies.isEmpty());
		top5companies.add("Google");
		top5companies.add("Apple");
		top5companies.add("Microsoft");
		top5companies.add("Amazon");
		top5companies.add("Facebook");
		
		//System.out.println(top5companies.size());
		System.out.println(top5companies);
		
		System.out.println("\n Size of top companies: "+top5companies.size());
		String top1company=top5companies.get(0);
		System.out.println("\n Top 1 Company is: "+top1company);
		String top2company=top5companies.get(1);
		System.out.println("\n Top 2 Company is: "+top2company);
		String lastcompany=top5companies.get((top5companies.size()-1));
		System.out.println("Last company in list is: "+lastcompany);
		top5companies.set(4, "TCS");
		System.out.println("\n Modified list top companies: "+top5companies);
		top5companies.removeIf(str->str.contains("F"));
		System.out.println("\n List after removing elements starting with A: "+top5companies);
		/*ArrayList<String> arnxt5=new ArrayList<>();
		arnxt5.add("F");
		arnxt5.add("G");
		arnxt5.add("H");
		arnxt5.add("I");
		arnxt5.add("J");
		
		ar5.addAll(arnxt5);*/
		
	}

}
