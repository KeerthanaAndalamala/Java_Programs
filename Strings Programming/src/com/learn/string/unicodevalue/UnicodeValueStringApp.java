package com.learn.string.unicodevalue;

public class UnicodeValueStringApp 
{
	public static void unicodeString(String str)
	{
		for(int i=0;i<str.length();i++) {
			System.out.println((int)str.charAt(i));
		}
	}

}
