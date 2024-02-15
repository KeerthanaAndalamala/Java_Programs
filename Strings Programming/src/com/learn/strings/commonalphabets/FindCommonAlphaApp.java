package com.learn.strings.commonalphabets;

import java.util.Scanner;

public class FindCommonAlphaApp {

	public static void main(String[] args) 
	{
		        // Create a scanner object
				Scanner scan = new Scanner(System.in);
				// Asking a user input
				System.out.println("Enter first string");
				// Reading and storing a string
				String str1 = scan.nextLine();
				// Asking a user input
				System.out.println("Enter second string");
				// Reading and storing a string
				String str2 = scan.nextLine();
				// Invoking a method
				FindCommonAlpha.findCommonAlpha(str1,str2);
				FindCommonAlpha.findCommonAlpha(str1,str2);

	}

}
