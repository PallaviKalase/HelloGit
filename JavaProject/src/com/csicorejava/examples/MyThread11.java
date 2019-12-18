package com.csicorejava.examples;
class MyThread9 extends Thread
{
	public void run()
	{
	System.out.println("CSI PUNE");
	}
}
class MyThread8 extends Thread
{
	public void run()
	{
	System.out.println("Credit Systems India");
	}
}
class MyThread7 extends Thread
{
	public void run()
	{
	System.out.println("CSI...");
	}
}

public class MyThread11
{

	public static void main(String[] args)
	{
		MyThread9 t9=new MyThread9();
		t9.setName("CSI1234...");
		t9.setPriority(10);
		System.out.println(t9.getName());
		MyThread8 t8=new MyThread8();
		t8.setPriority(1);
		MyThread7 t7=new MyThread7();
		t7.setPriority(5);
		t9.run();
		t7.run();
		t8.run();
	}
}
