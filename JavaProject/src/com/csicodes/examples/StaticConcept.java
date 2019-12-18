
package com.csicodes.examples;
class Employee//creating static class
{
	void push()
	{
		System.out.println("PUSH");
	}
	static class Department//class static
	{
		void pop()
		{
		System.out.println("Static Class POP");
		}
	}
}
public class StaticConcept
{
static String empName="PALLAVI";
static int empId=121;
	public static void main(String[] args)
	{
		StaticConcept sc= new StaticConcept();
		System.out.println("WOWW..");
		set();
		sc.get();//call non-static method
		net();
		Employee ee=new Employee(); // Employee class Push method
		ee.push();
		Employee.Department dd=new Employee.Department(); //Calling static class pop method
		dd.pop();
		
	}
	void get()
	{
		System.out.println("Hey");
		System.out.println("Employee Name="+empName);
	}
	static void set()//static method
	{
		System.out.println("INDIA");
	}
	static void net()
	{
		System.out.println("Pune");
		System.out.println("Employee ID="+empId);
	}
	static//static block
	{
		System.out.println("INSPIRA MALL");
	}
}
