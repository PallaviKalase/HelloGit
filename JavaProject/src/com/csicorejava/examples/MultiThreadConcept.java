package com.csicorejava.examples;
class MultiThread extends Thread
{
	public void run()
	{
		try
		{
			//System.out.println("\n Thread "+Thread.currentThread().getId()+" is Running");
			System.out.println("\n Priority of Thread is: "+getPriority());
			//System.out.println("\n Thread: "+isDaemon());
		}
		catch(Exception e)
		{
			System.out.println("\n Exception is Caught ");
		}
	}
}

public class MultiThreadConcept
{

	public static void main(String[] args)
	{
		/*int n = 8; // Number of threads 
		for (int i=0; i<8; i++)   //for loop for current thread & Id
		{ */
			MultithreadingDemo object = new MultithreadingDemo(); 
			object.start(); 
	//	} 

	}

}
