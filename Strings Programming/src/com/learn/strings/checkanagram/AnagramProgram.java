package com.learn.strings.checkanagram;

import java.util.Arrays;

public class AnagramProgram 
{
	public static String checkAnagram(String str1,String str2)
	{
		// Traversing string 
		for(int i=0;i<str1.length();i++) {
		// check if both strings length are same 
		if(str1.length()==str2.length())
		{
			// check if both strings characters are not same 
			if(str1.charAt(i)!=str2.charAt(i))
			{
				return "Both strings are same anagrams";
			}
		}
		
		}
		return "Both strings are not same anagrams";
	}
	
	
	
	public static String CheckAnagram(String str1,String str2)
	{
		   // Converting the strings into char type array
			char[] s1 = str1.toCharArray();
			char[] s2 = str2.toCharArray();
			// sort the strings using Array.sort()
			Arrays.sort(s1);
			Arrays.sort(s2);
			// converting the char type array into the string
			String newstr = new String(s1);
			String newstr1 = new String(s2);
			// check whether the both strings are same or not
			if(newstr.equals(newstr1))
			{
				return "Both strings are same anagrams";
			}
			else {
				return "Both strings are not same anagrams";
			}
	}
}


