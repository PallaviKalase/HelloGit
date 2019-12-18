
package com.csicodes.examples;
class Bank
{
	int getRateOfInterest()
	{
		return 0;
	}
}
class SBI extends Bank
{
	int getRateOfInterest()
	{
		return 8;
	}
}
class ICIC extends Bank
{
	int getRateOfInterest()
	{
		return 9;
	}
}
class AXIS extends Bank
{
	int getRateOfInterest()
	{
		return 10;
	}
}
public class MethodOverridingEg 
{

	public static void main(String[] args)
	{
		SBI s=new SBI();
		ICIC i=new ICIC();
		AXIS a=new AXIS();
		System.out.println("\n SBI RATE OF INTEREST="+s.getRateOfInterest());
		System.out.println("\n ICIC RATE OF INTEREST="+i.getRateOfInterest());
		System.out.println("\n AXIS RATE OF INTEREST="+a.getRateOfInterest());
	}

}
