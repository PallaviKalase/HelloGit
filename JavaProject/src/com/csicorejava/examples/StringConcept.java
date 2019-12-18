package com.csicorejava.examples;

public class StringConcept
{

	public static void main(String[] args)
	{
		String s1="CREDIT";
		//String s2="credit";
		String s3="INDIA";
		//char ch[]={'s','y','s','t','e','m','s'};
		String s2=new String("CREDIT SYSTEMS INDIA");
		System.out.println("S1==S2: "+(s1==s2));
		System.out.println("S1.equals(S2): "+s1.equals(s2));
		System.out.println("S2.equals(S3): "+s2.equals(s3));
		System.out.println("S1.equals(S2): "+s1.equalsIgnoreCase(s2));
		System.out.println("S1 charAT(3): "+s1.charAt(2));
		System.out.println("S1 length(): "+ s1.length());
		s1=s1.concat(s2);
		System.out.println(s1);
		s1=s1.replaceAll(s1, s2);
		System.out.println(s1);
		s1=s1.toLowerCase();
		System.out.println(s1);
		s1=s1.toUpperCase();
		System.out.println(s1);
		System.out.println(s1.replace('C','r'));
		System.out.println(s1.replaceFirst("CR", "HE"));
		System.out.println(s1.replace(s2, s1));
		int t=s2.lastIndexOf('T');
		System.out.println(t);
		int lastIndex=s2.lastIndexOf('I');
		System.out.println("Last index of S1 is: "+lastIndex);
		lastIndex=s2.lastIndexOf('S', 15);
		System.out.println("Last index of S is: "+lastIndex);
		lastIndex=s2.lastIndexOf("INDIA");
		System.out.println("Last index of INDIA is: "+lastIndex);
		System.out.println(s2.substring(7));
		System.out.println(s2.replace('Y', 'K'));
		System.out.println(s2.replace("CR", "AB"));
	}

}
