package com.csicorejava.examples;

public class ExceptionHandlingExample 

{
	public static void main(String[] args)
	{
		int result;
		try
		{
		result=10/0;
		System.out.println("\n Result:"+result);
		}
		catch(ArithmeticException|NullPointerException|ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		catch(Exception e)
		{
			
		}
		finally
		{
		System.out.println("INSPIRA MALL");	
		}
		isAgeValidforVote(17);
	}
	static void isAgeValidforVote(int age) throws NullPointerException,ArithmeticException
	{
		if(age<18)
		{
			throw new ArithmeticException("NOT ELIGIBLE");
		}
		else
		{
		System.out.println();
		}
	}

}
