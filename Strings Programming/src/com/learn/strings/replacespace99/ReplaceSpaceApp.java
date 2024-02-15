package com.learn.strings.replacespace99;

import java.util.Scanner;

public class ReplaceSpaceApp {

	public static void main(String[] args) 
	{
		// Create a scanner object
		Scanner scan = new Scanner(System.in);
		// Asking a user input
		System.out.println("Enter a string");
		// Reading and storing a string
		String str=scan.nextLine();
		// Invoking a method
		ReplaceSpace.replaceSpace(str);
		
	}

}
