package com.strings.reversestring;

import java.util.Scanner;

public class ReverseStringApp {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = scan.next();
        String reversed = ReverseString.reverseString(str);
       
        System.out.println("Reversed string: " + reversed);
	}

}
