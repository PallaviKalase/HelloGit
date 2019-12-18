package com.csicorejava.examples;

class ExMyThread extends Thread
{
	public void run()
	{
		int i;
		for(i=1;i<=5;i++)
		{
			try
			{
				System.out.println("\n NAME of thread is: "+getName());
				//System.out.println("\n Priority of Thread is: "+getPriority());
				//Thread.sleep(10000);
			}
			catch(/*Interrupted*/Exception e)
			{
				e.printStackTrace();
			}
		//	System.out.println("CSI PUNE");
		}
	}
}
public class ExtendThreadConcept 
{

	public static void main(String[] args)
	{
		ExMyThread t1=new ExMyThread();
		t1.start();
		t1.start();

	}

}
