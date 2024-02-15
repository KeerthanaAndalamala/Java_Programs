package com.strings.reversestring;

public class ReverseString 
{
	public static String reverseString(String str)
	{
		String reversed = new String();
		for (int i = str.length() - 1; i >= 0; i--) {
            reversed+=str.charAt(i);
		}
		return reversed;
	}
}
