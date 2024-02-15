package com.learn.string.convertlowertoupper;

import java.util.Scanner;

public class ConvertLowerToUpperCaseApp {

	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter a string ");
		String s1 = scan.next();
		ConvertLowerToUpperCase.convertLowerToUpper(s1);
	}

}
