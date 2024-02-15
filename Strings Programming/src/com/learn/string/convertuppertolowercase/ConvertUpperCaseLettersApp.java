package com.learn.string.convertuppertolowercase;

import java.util.Scanner;

public class ConvertUpperCaseLettersApp {

	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter a string ");
		String s1 = scan.next();
		ConvertUpperCaseLetters.convertUpperCase(s1);

	}

}
