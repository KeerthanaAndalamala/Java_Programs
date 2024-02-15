package com.learn.strings.reverseword;

public class ReverseWord {
	public static void reverseWord(String str)
	{
		String revstr[] = str.split(" ");
		String newstr ="";
		for(int i=revstr.length-1; i>=0 ; i--)
		{
			newstr = newstr+revstr[i]+" "; 
		}
		System.out.println(newstr);
	}
}
