package com.kodnest.strings;

public class ConcatenateString {
/*
	public static void main(String[] args)
	{
		String s1 = "Java";
		String s2 = "Sql";
		String s3 = s1+s2; // References are stored in outside of string pool
		String s4 = "Java"+"Sql";
		if(s3==s4)
		{
			System.out.println("References are equal");
	  	  }
	  	  else
	  	  {
	  		  System.out.println("References are not equal");
	  	  }
	  	  if(s3.equals(s4))
	  	  {
	  		  System.out.println("String values are equal");
	  	  }
	  	  else
	  	  {
	  		  System.out.println("String values are not equal");
	  	  }
	}
	*/
	
	/*
	public static void main(String[] args)
	{
		String s1 = "Java";
		String s2 = "Sql";
		String s3 = "Java"+"Sql"; // References are stored inside of string pool
		String s4 = "Java"+"Sql";
		if(s3==s4)
		{
			System.out.println("References are equal");
	  	  }
	  	  else
	  	  {
	  		  System.out.println("References are not equal");
	  	  }
	  	  if(s3.equals(s4))
	  	  {
	  		  System.out.println("String values are equal");
	  	  }
	  	  else
	  	  {
	  		  System.out.println("String values are not equal");
	  	  }
	}
	*/
	
	public static void main(String[] args)
	{
		String s1 = "Java";
		String s2 = "Sql";
		String s3 = s1+s2; // References are stored in outside of string pool
		String s4 = s1+s2;
		if(s3==s4)
		{
			System.out.println("References are equal");
	  	  }
	  	  else
	  	  {
	  		  System.out.println("References are not equal");
	  	  }
	  	  if(s3.equals(s4))
	  	  {
	  		  System.out.println("String values are equal");
	  	  }
	  	  else
	  	  {
	  		  System.out.println("String values are not equal");
	  	  }
	}

}
