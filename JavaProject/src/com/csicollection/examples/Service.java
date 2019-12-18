package com.csicollection.examples;

import java.util.ArrayList;

public class Service
{

	public static void main(String[] args)
	{
		ArrayList<ToStringEmp> empList= new ArrayList<>();
		empList.add(new ToStringEmp(121, "JERRY", 505550, 123456789));
		empList.add(new ToStringEmp(122, "TOM", 560000, 123478956));
		empList.add(new ToStringEmp(123, "MARRY", 580021, 784596123));
		empList.forEach(emp->System.out.println(emp));

	}

}
