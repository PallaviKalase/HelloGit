package com.csicodes.examples;

 class InheritanceEg
{
	int z;
	public void addition(int x,int y)
	{
		z=x+y;
		System.out.println("\n Addition of number is: ");
		System.out.println("\n ADDITION ="+z);
	}
	public void substraction(int x,int y)
	{
		z=x-y;
		System.out.println("\n SUBSTRACTION ="+z);
	}
}
  class My_InheritanceEg1 extends InheritanceEg
 {
	 public void multiplication(int x,int y)
	 {
	 z=x*y;
	 System.out.println("\n MULTIPLICATION ="+z);
	 }
 }
  public class My_InheritanceEg
  {
	public static void main(String[] args)
	{
		int a=10,b=30;
		My_InheritanceEg1 p=new My_InheritanceEg1();
		InheritanceEg q=new InheritanceEg();
		q.addition(a,b);
		q.substraction(a,b);
		p.multiplication(a,b);
	}
  }
 
