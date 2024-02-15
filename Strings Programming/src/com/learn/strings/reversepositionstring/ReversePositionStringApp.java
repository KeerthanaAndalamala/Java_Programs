package com.learn.strings.reversepositionstring;

import java.util.Scanner;

public class ReversePositionStringApp {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string");
		String str=scan.nextLine();
	    ReversePositionString.reversePosition(str);
		
	}

}
