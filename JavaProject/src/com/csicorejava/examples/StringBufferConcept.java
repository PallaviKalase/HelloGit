package com.csicorejava.examples;

public class StringBufferConcept
{

	public static void main(String[] args) 
	{
		StringBuffer sb=new StringBuffer("CREDIT ");
		StringBuffer sb1=new StringBuffer(" SYSTEMS");
		sb.append(sb1);
		System.out.println("CS: "+sb);
		sb.insert(7,"INDIA");
		System.out.println(sb);
		sb.replace(6, 6, " INDIA");
		System.out.println(sb);
		sb.delete(7,12);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		System.out.println(sb.capacity());
		

	}

}
