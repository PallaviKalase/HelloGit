package com.csicodes.examples;

class Dept
{
	int deptCode=1001;
	void get(int deptId,String deptName)
	{
		System.out.println("\nDepartment Id="+deptId +"\nDepartment Name="+deptName);
	}
	void push()
	{
		System.out.println("\n I AM PUSH");
	}
}
class Emp extends Dept
{
	int deptCode=22;
	void set(int empId,String empName)
	{
		System.out.println("\nEmployee ID="+empId +"\nEmployee Name"+empName );
	}
	void net(String empAddress,double empSalary)
	{
		System.out.println("\n Employee Address="+empAddress +"\n Employee Salary"+empSalary +"\nEmployee Department Code="+super.deptCode);
		super.push();
	}
}

public class SingleInheritance 
{
	public static void main(String[] args) 
	{
		Emp ee=new Emp();
		ee.get(101,"HR");
		ee.set(121,"Pallavi");
		ee.net("PCMC", 463214.78);	

	}

}
