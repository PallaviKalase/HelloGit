package com.srccodes.example;

class Customer
{
	int amount=10000;
	synchronized public void withdraw(int amount)
	{
		System.out.println("\n Going to withdraw money...");
		if(this.amount<=amount)
		{
			System.out.println("Insufficient Balance...please wait...!!!..");
		}
		try 
		{
		wait();	
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	this.amount-=amount;
	System.out.println("AMOUNT WITHDRAW SUCCESSFULLY");
	}
	synchronized public void deposit(int amount)
	{
		System.out.println("\n Going to deposit money...");
		this.amount+=amount;
		System.out.println("\n AMOUNT DEPOSITED SUCCESSFULLY");
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
