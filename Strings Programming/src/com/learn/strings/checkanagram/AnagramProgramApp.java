package com.learn.strings.checkanagram;

import java.util.Scanner;

public class AnagramProgramApp {

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
		System.out.println(AnagramProgram.checkAnagram(str1,str2));
		System.out.println(AnagramProgram.CheckAnagram(str1,str2));
	}

}
