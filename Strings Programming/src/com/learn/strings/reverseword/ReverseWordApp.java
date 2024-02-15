package com.learn.strings.reverseword;
import java.util.*;
public class ReverseWordApp {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string");
		String str=scan.nextLine();
		ReverseWord.reverseWord(str);
				

	}

}
