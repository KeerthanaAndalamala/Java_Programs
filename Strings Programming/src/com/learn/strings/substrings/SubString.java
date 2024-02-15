package com.learn.strings.substrings;

public class SubString 
{
	public static void subString(String str)
	{
		char [] arr = str.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			String newstr = "";
			for(int j=i;j<arr.length;j++)
			{
				newstr+=arr[j];
				System.out.println(newstr);
				
			}
		}
	}

}
