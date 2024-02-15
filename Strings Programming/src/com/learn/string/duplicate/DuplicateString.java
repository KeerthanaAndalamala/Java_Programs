package com.learn.string.duplicate;

public class DuplicateString 
{
	public static void duplicateString(String str)
	{
		String duplicate = new String();
		for(int i=0;i<str.length();i++)
		{
			for(int j=0;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
		            System.out.println(str.charAt(j));
				}
			}
		}
	}

}
