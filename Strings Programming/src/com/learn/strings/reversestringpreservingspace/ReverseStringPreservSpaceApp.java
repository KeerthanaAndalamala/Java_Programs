package com.learn.strings.reversestringpreservingspace;

import java.util.Scanner;

public class ReverseStringPreservSpaceApp {

	public static void main(String[] args)
	{
		// Create a scanner object
		Scanner scan = new Scanner(System.in);
		// Asking a user input
		System.out.println("Enter a string");
		// Reading and storing a string
		String str = scan.nextLine();
		// Invoking a method
		System.out.println(ReverseStringPreservSpace.reverseStrinhPreservSpace(str));
	}

}
