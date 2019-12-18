package com.csicodes.examples;

class Adder
{
	static int add(int a,int b)
	{
		return a+b;
	}
	static int add(int a,int b,int c)//By changing argument list
	{
		return a+b+c;
	}
	static double add(double a,double b)//Method overloading by changing datatypes
	{
		return a+b;
	}
}
public class MethodOverloading
{

	public static void main(String[] args)
	{
		System.out.println(Adder.add(11, 11));
		System.out.println(Adder.add(11, 11, 11));
		System.out.println(Adder.add(11.11, 11.11));
	}

}
