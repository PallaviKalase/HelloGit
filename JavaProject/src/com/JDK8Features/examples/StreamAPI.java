package com.JDK8Features.examples;
//import java.util.*;
import java.util.ArrayList;

class Product
{
	/*private*/ int productID;
	/*private*/  String productName;
	/*private*/  float productPrice;
	public Product(int productID, String productName, float productPrice)
	{
		//super();
		this.productID = productID;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	/*@Override
	public String toString()
	{
		return "Product [productID=" + productID + ", productName=" + productName + ", productPrice=" + productPrice
				+ "]";
	}*/
}
public class StreamAPI
{
	public static void main(String[] args)
	{
		ArrayList<Product> productList=new ArrayList<Product>();
		productList.add(new Product(111,"MI",999.9f));
		productList.add(new Product(222,"LENOVO",222.45f));
		productList.add(new Product(333,"APPLE",444.34f));
		productList.stream().filter(product->product.productPrice==999.9);
		productList.forEach(Product->System.out.println(Product.productName)); 
			
	

	}

}
