package com.csicodes.examples;

interface Dept12
{
	void get(int deptId,String deptName);
	default void set()
	{
		System.out.println("\n I AM DEFAULT");
	}
	static void net()
	{
		System.out.println("I AM FROM STATIC METHOD");
	}
}

interface Employee123
{
	void pop(int empId,String empName);
}
abstract class Company12
{
	abstract void show(int cId,String cName);
	void push()
	{
		System.out.println("\n I AM FROM PUSH");
	}
}
class Product extends Company12 implements Dept12,Employee123
{
	public void pop(int empId,String empName)
	{
		System.out.println("\nEmp id="+empId+"\nEmp Name="+empName);
	}
	public void get(int deptId,String deptName)
	{
		System.out.println("\nDepartment id="+deptId+"\nDepartment name="+deptName);
	}
	void show(int cId,String cName)
	{
		System.out.println("\nCompany Id="+cId+"\nCompany Name="+cName);
	}
}
public class InterfaceConcept 
{

	public static void main(String[] args)
	{
		Product pp=new Product();
		pp.get(101,"HR");
		pp.set();
		Dept12.net();
		pp.show(111111,"CSI PUNE");
		pp.push();
		pp.pop(121,"JERRY");
	}

}
