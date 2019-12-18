package com.csicodes.examples;

class ABC
{
	/*private*/ int a=10;
	/*private*/ void msg()
	{
		System.out.println("HEllo JAVA...."+a);
	}
}
public class AccessModifier 
{

	public static void main(String[] args)
	{
		ABC ab=new ABC();
		System.out.println(ab.a);//Private access specifier
		ab.msg();
		
	}

}
