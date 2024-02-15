package com.learn.strings.convertLetters;

import java.util.Scanner;

public class ConvertLettersApp {

	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter a string ");
		String s1 = scan.next();
		ConvertLetters.convertLetters(s1);
		ConvertLetters.convertLetter(s1);
		
	}

}
