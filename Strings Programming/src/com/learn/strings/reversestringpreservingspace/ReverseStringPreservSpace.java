package com.learn.strings.reversestringpreservingspace;

public class ReverseStringPreservSpace {
	public static String reverseStrinhPreservSpace(String str)
	{
		char[]arr = str.toCharArray();
		char[] revchar = new char[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!= ' ')
			{
				for(int j=arr.length-1;j>=0;j--)
				{
					if(revchar[j]==' ')
					{
						j--;
					}
					revchar[j] = arr[i];
					break;
				}
			}
		}
		return new String(revchar); 
	}	

}
