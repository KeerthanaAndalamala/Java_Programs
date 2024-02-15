package com.learn.strings.replacevowelswith99;

import java.util.Scanner;

public class ReplaceVowelNumberApp {

	public static void main(String[] args) 
	{
		 // Create a scanner object
		Scanner scan = new Scanner(System.in);
		// Asking a user input
		System.out.println("Enter a string");
		// Reading and storing a string
		String str = scan.nextLine();
		// Invoking a method
		ReplaceVowelNumber.replaceVowelNumber(str);
	}

}
