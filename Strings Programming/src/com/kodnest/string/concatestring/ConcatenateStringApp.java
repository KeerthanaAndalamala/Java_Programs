package com.kodnest.string.concatestring;

import java.util.Scanner;

public class ConcatenateStringApp {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a first string");
		String str = scan.next();
		System.out.println("Enter a second string");
		String str1 = scan.next();
		ConcatenateString.concatenateString(str,str1);

	}

}
