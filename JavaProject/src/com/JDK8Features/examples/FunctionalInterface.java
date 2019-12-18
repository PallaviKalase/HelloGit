package com.JDK8Features.examples;
//Java program to demonstrate lamda expressions to implement 
//a user defined functional interface. 

@FunctionalInterface
interface Square 
{ 
	int calculate(int x); 
} 

class Test 
{ 
	public static void main(String args[]) 
	{ 
		int a = 5; 

		// lambda expression to define the calculate method 
		Square s = (int x)->x*x; 

		// parameter passed and return type must be 
		// same as defined in the prototype 
		int ans = s.calculate(a); 
		System.out.println(ans); 
	} 
} 
/*import java.util.*;
@FunctionalInterface

interface Department
{
	
	void show();
	void net();
	default void get()
	{
		System.out.println("DEFAULT METHOD..");
	}
	static void set()
	{
		System.out.println("STATIC METHOD..");
	}
}

class Employee implements Department
{
	public void show(int deptID,String deptName)
	{
		System.out.println("\nDEPARTMENT ID: "+deptID+"\nDEPARTMENT NAME: "+deptName);
	}

	@Override
	public void show()
	{
		System.out.println("\n SHOW METHOD FROM DEPARTMENT...");
	}

	@Override
	public void net() 
	{
	System.out.println("\n NET METHOD FROM DEPARTMENT...");	
	}
}
public class FunctionalInterface
{
	public static void main(String[] args)
	{
	Employee e1=new Employee();
	e1.show();
	e1.get();
	e1.net();
	Department.set();
	}

}
*/