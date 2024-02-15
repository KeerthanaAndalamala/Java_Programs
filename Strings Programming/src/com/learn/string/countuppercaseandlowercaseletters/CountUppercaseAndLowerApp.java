package com.learn.string.countuppercaseandlowercaseletters;

import java.util.Scanner;

public class CountUppercaseAndLowerApp {

	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter a string ");
		String s1 = scan.nextLine();
		CountUppercaseAndLower.countUpperandLowerCase(s1);
		CountUppercaseAndLower.countLowerCase(s1);
		
		
	}

}
