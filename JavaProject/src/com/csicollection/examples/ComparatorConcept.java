package com.csicollection.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Customer implements Comparator<Customer>
{
	int CustomerId;
	String CustomerName;
	int CustomerAge;
	double CustomerSal;
	
	public Customer(int customerId, String customerName, int customerAge, double customerSal) 
	{
		super();
		CustomerId = customerId;
		CustomerName = customerName;
		CustomerAge = customerAge;
		CustomerSal = customerSal;
	}
	

	@Override
	public String toString() {
		return "Customer [CustomerId=" + CustomerId + ", CustomerName=" + CustomerName + ", CustomerAge=" + CustomerAge
				+ ", CustomerSal=" + CustomerSal + "]";
	}


	@Override
	public int compare(Customer o1, Customer o2) 
	{
		return o1.CustomerName.compareTo(CustomerName);
	}
	
}

class AgeComparator implements Comparator<Customer>
{
	@Override
	public int compare(Customer o1, Customer o2) 
	{
		if(o1.CustomerAge==o2.CustomerAge)
		{
		return 0;
		}
		else if(o1.CustomerAge>o2.CustomerAge)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
	
}
class SalComparator implements Comparator<Customer>
{

	@Override
	public int compare(Customer o1, Customer o2)
	{
		if(o1.CustomerSal==o2.CustomerSal)
		{
		return 0;
		}
		else if(o1.CustomerSal>o2.CustomerSal)
		{
		return 1;
		}
		else
		{
		return -1;
		}
	}
	
}
public class ComparatorConcept
{

	public static void main(String[] args)
	{
		ArrayList<Customer> custList=new ArrayList<>();
		custList.add(new Customer(111,"JERRY",22,40000));
		custList.add(new Customer(121,"TOM",21,70000));
		custList.add(new Customer(131,"ANUJA",23,30000));
		custList.add(new Customer(141,"PALLAVI",25,80000));
		custList.add(new Customer(151,"TANUJA",21,10000));
		System.out.println("\n Age Sorting");
		Collections.sort(custList, new AgeComparator());
		custList.forEach(cc->System.out.println(cc));
		System.out.println("\n Name Sorting");
		custList.forEach(cc->System.out.println(cc));
		System.out.println("\n Salary Sorting");
		Collections.sort(custList, new SalComparator());
		custList.forEach(cc->System.out.println(cc));
		
	}

}
