package com.csicodes.examples;
class Vehical
{
	void run()
	{
		System.out.println("Vehical is running...");
	}
}
	
 class MethodOverriding extends Vehical 
{
	 void run()
	 {
		 System.out.println("Method Overloading method");
	 }
	public static void main(String[] args)
	{
		MethodOverriding bb=new MethodOverriding();
		bb.run();
	}
}
