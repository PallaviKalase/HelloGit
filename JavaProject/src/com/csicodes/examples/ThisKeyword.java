package com.csicodes.examples;
class Student12
{
	int rollno;
	String name;
	float fee;
	Student12(int rollno,String name,float fee)
	{
		this.rollno=rollno;
		this.name=name;
		this.fee=fee;
	}
	void display()
	{
		System.out.println("\nRoll no="+rollno+"\n Name="+name+"\n Fees="+fee);
	}
}
public class ThisKeyword
{

	public static void main(String[] args)
	{
		Student12 s1=new Student12(11,"PALLAVI",20.20f);
		s1.display();
		Student12 s2=new Student12(12,"KALASE",30.30f);
		s2.display();
	}

}
