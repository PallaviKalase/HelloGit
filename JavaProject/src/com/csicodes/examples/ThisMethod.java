package com.csicodes.examples;
class A
{
	void m()
	{
		System.out.println("HELLO m...");
	}
	void n()
	{
		System.out.println("HELLO n...");
		this.m();
	}
}
public class ThisMethod 
{

	public static void main(String[] args) 
	{
		A a=new A();
		a.n();

	}

}
