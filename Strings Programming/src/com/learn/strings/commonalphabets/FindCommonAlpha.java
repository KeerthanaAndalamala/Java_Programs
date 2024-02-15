package com.learn.strings.commonalphabets;

public class FindCommonAlpha
{
	
	public static void findCommonAlpha(String str1,String str2)
	{
		String newstr1="";
		String newstr2="";
		for(int i=0;i<str1.length();i++)
		{
			if(!newstr1.contains(str1.charAt(i)+" ")) {
				newstr1 = newstr1+str1.charAt(i);
			}
		}
		for(int i=0;i<str2.length();i++)
		{
			if(!newstr2.contains(str2.charAt(i)+" ")) {
				newstr2 = newstr2+str2.charAt(i);
			}
		}
		System.out.println(newstr1);
		
	}
}
	
	
	