package com.learn.strings.substrings;

import java.util.Scanner;

public class SubStringApp {

	public static void main(String[] args) 
	{
		// Create a scanner object
		Scanner scan = new Scanner(System.in);
		// Asking a user input
		System.out.println("Enter a string");
		// Reading and storing a string
		String str1 = scan.nextLine();
		SubString.subString(str1);
	}

}
