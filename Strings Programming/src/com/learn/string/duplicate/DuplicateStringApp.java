package com.learn.string.duplicate;

import java.util.Scanner;

public class DuplicateStringApp {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = scan.next();
	    DuplicateString.duplicateString(str);
	
	}

}
