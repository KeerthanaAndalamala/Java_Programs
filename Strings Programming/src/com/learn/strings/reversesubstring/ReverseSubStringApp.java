package com.learn.strings.reversesubstring;

import java.util.Scanner;

public class ReverseSubStringApp {

	public static void main(String[] args)
	{
		// Create a scanner object
		Scanner scan = new Scanner(System.in);
		// Asking a user input
	    System.out.println("Enter a string");
		// Reading and storing a string
		String str1 = scan.nextLine();
		ReverseSubString.reverseSubString(str1);

	}

}
