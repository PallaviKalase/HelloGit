package com.csicorejava.examples;

class Customer
{
	int amount;
	synchronized public void withdraw(int amount)
	{
		System.out.println("\n GOING TO WITHDRAW...");
		if(this.amount<=amount)
		{
			System.out.println("\n INSUFFICIENT BALANCE...PLEASE WAIT...");
			try
			{
				wait();
			}
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
	this.amount-=amount;
	System.out.println("AMOUNT WITHDRAW SUCCESSFULLY....");		
	}
	synchronized public void deposit(int amount)
	{
		System.out.println("\n GOING TO DEPOSIT MONEY...");
		this.amount+=amount;
		System.out.println("\n AMOUNT DEPOSITED SUCCESSFULLY...");
		//notifyAll();
		notify();
	}
}
public class InterThreadCommunication
{

	public static void main(String[] args)
	{
		Customer cc=new Customer();
		new Thread()
		{
			public void run()
			{
				cc.withdraw(15000);
			}
		}.start();
		new Thread()
		{
			public void run()
			{
				cc.deposit(10000);
			}
		}.start();

	}
}

