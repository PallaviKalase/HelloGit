package com.JDK8Features.examples;
interface Customer
{
	void push();
}
public class LambadaExpression
{

	public static void main(String[] args)
	{
		Customer cc=()->
		{
			System.out.println("CSI PUNE...");
		};
		cc.push();

	}

}
