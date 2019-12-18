package com.csicollection.examples;

import java.util.ArrayList;
import java.util.Scanner;

public class Product 
{

	public static void main(String[] args) 
	{
		ArrayList<String> productList=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("\n Enter the Product Name: ");
		String productName=sc.next();
		productList.add("MI");
		productList.add("LENOVO");
		productList.add("ASUS");
		productList.add("SAMSUNG");
		productList.add("APPLE");
		productList.add("HP");
		if(productList.contains(productName))
		{
			System.out.println("\n YUP..!!..Product is avaliable "+productName);
		}
		else
		{
			System.out.println("\n SORRY..!!..Product is Unavaliable "+productName);
		}
		

	}

}
