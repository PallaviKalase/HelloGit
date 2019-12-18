package com.JDK8Features.examples;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTimeAPI 
{
	public static void main(String[] args) 
	{
		//DateTimeAPI dt=new DateTimeAPI();
		System.out.println("CURRENT DATE: "+LocalDate.now());
		System.out.println("CURRENT TIME: "+LocalTime.now());
		System.out.println("CURRENT DATE & TIME: "+LocalDateTime.now());

	}

}
