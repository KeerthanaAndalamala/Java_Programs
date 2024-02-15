package com.learn.string.unicodevalue;

import java.util.Scanner;

public class UnicodeValueString {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = scan.next();
		UnicodeValueStringApp.unicodeString(str);
	}
		
}
