package com.csicollection.examples;

public class ToStringEmp 
{

	//public static void main(String[] args)
	//{
		private int empId;
		private String empName;
		private double empSalary;
		private long empUID;
		public ToStringEmp(int empId, String empName, double empSalary, long empUID)
		{
			super();
			this.empId = empId;
			this.empName = empName;
			this.empSalary = empSalary;
			this.empUID = empUID;
		}
		@Override
		public String toString()
		{
			return "ToStringEmp [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", empUID="
					+ empUID + "]";
		}
		
		
		
		

	}

//}
