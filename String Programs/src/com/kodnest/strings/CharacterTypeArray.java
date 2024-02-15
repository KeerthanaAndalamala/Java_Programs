package com.kodnest.strings;

import java.util.Scanner;

public class CharacterTypeArray {

	public static void main(String[] args)
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter a string ");
		String s1 = scan.nextLine();
		System.out.println(s1);
		char[] s2 = s1.toCharArray();
		for(char str:s2)
		{
			System.out.println(str+" ");
		}
		
	}

}
