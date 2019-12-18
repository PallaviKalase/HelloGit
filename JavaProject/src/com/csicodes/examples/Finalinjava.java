package com.csicodes.examples;

/*final*/ class Bike//final class
{
	/*final*/ void get()//final method
	{
		System.out.println("RUNNING");
	}
}
class Finalinjava extends Bike//If you make any class as final, you cannot extend it
{
	void get()//Compile time error as method declared final cannot be override it
	{
		System.out.println("RUNNING SAFELY");
	}

	public static void main(String[] args)
	{
		Finalinjava fc=new Finalinjava();
		fc.get();
	final int CAPACITY=6;
	System.out.println(CAPACITY);

	}

}
