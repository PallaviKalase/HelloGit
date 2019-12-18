package com.csicorejava.examples;

import java.beans.Transient;
import java.io.Serializable;

public class SerializationConcept implements Serializable
{

	public static void main(String[] args) 
	{
		Transient empId;//we can't serialize it using Transient
		String empName;
		SerializationConcept sc=new SerializationConcept();//serialized object
		
	}

}
