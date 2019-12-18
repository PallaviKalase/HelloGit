package com.csicorejava.examples;
class ImpRunn implements Runnable
{
	public void run()
	{
		int i;
		for(i=1;i<=5;i++)
		{
			try
			{
				Thread.sleep(10000);
			}
			catch(InterruptedException e)
			{
			e.printStackTrace();	
			}
		System.out.println("CSI PUNE");
		}
	}
}
public class ImpRunnableConcept 
{
	public static void main(String[] args) 
	{
		ImpRunn rr=new ImpRunn();
		Thread tt=new Thread(rr);
		tt.start();

	}

}
