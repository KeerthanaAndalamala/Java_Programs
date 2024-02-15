package com.kodnest.strings;
import java.util.Scanner;
public class PrintUnicodeValue {
/*
	public static void main(String[] args) {
		// creating a object of scanner class
		Scanner scan =new Scanner(System.in);
		// Asking and storing a character
		System.out.println("Enter a character");
		// Reading a character
		int ch = scan.next().charAt(0);
		// displaying the data
		System.out.println(ch);
	}
*/
	
	
	public static void main(String[] args) {
		// creating a object of scanner class
		Scanner scan =new Scanner(System.in);
		// Asking and storing a character
		System.out.println("Enter a character");
		// Reading a character
		char ch = scan.next().charAt(0);
		int unicode = ch;
		// displaying the data
		System.out.println(unicode);
	}
}
