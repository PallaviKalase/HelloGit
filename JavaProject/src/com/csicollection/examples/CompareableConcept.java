package com.csicollection.examples;

import java.util.ArrayList;
import java.util.Collections;

class Employee implements Comparable<Employee>
{
	int empId;
	String empName;
	int empAge;
	public Employee(int empId, String empName, int empAge) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAge = empAge;
	}
	@Override
	public String toString() 
	{
		return "Employee [empId=" + empId + ", empName=" + empName + ", empAge=" + empAge + "]";
	}
	
	@Override
	/*public int compareTo(Employee e1) 
	{
		
		return this.empName.compareTo(e1.empName);
	}*/
		


	public int compareTo(Employee e1)
	{
		if(e1.empAge==empAge)
		{
			return 0;
		}
		else if(e1.empAge<empAge)
		{
		return 1;
		}
		else
		{
			return -1;
		}
	}
}
public class CompareableConcept
{

	public static void main(String[] args)
	{
		ArrayList<Employee> empList=new ArrayList<>();
		empList.add(new Employee(111, "JERRY", 23));
		empList.add(new Employee(121, "TOM", 33));
		empList.add(new Employee(131, "ANUJA", 20));
		empList.add(new Employee(141, "PALLAVI", 22));
		Collections.sort(empList);
	//	Collections.sort(empList,Collections.reverseOrder());
		empList.forEach(System.out::println);
	}

}
