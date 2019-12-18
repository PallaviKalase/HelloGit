package com.csicodes.examples;

class Employee12
{
	 private int empId;
	 private String empName;
	private double  empSalary;
	public int getEmpId() 
	{
		return empId;
	}
	public void setEmpId(int empId) 
	{
		this.empId = empId;
	}
	public String getEmpName() 
	{
		return empName;
	}
	public void setEmpName(String empName) 
	{
		this.empName = empName;
	}
	public double getEmpSalary()
	{
		return empSalary;
	}
	public void setEmpSalary(double empSalary) 
	{
		this.empSalary = empSalary;
	}
	
}


	public class EncapsulationConcept
	{
	public static void main(String[] args) 
	{
		Employee12 ee=new Employee12();
		ee.setEmpId(121);
		ee.setEmpName("PALLAVI");
		ee.setEmpSalary(200000);
System.out.println("Emp Id : "+ee.getEmpId());
System.out.println("Emp Name : "+ee.getEmpName());
System.out.println("Emp Salary : "+ee.getEmpSalary());

	}
	}
