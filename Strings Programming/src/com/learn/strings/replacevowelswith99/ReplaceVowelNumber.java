package com.learn.strings.replacevowelswith99;

public class ReplaceVowelNumber 
{
	public static void replaceVowelNumber(String str)
	{
		char[]arr = str.toCharArray();
		String newstr = "";
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]=='a'|| arr[i]=='e'|| arr[i]=='i' || arr[i]=='o'||arr[i]=='u')
			{
				newstr=newstr+99;
			}
			else
			{
				newstr+=arr[i];
			}
		}
		System.out.println(newstr);	
	}

}
