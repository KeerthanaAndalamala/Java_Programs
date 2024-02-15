package com.learn.string.palindromestring;

import java.util.Scanner;

public class PalindromeStringApp {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = scan.next();
		if(PalindromeString.palindrome(str))
		{
		System.out.println("String is palindrome");
		}
		else {
			System.out.println("String is not palindrome");
		}

	}

}
