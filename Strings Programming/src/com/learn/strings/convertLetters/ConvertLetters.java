package com.learn.strings.convertLetters;

public class ConvertLetters 
{
	public static void convertLetters(String str)
	{
		char []arr = str.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>='A'&&arr[i]<='Z')
			arr[i]=(char)(arr[i]+32);
		}
		System.out.println(arr);
	}
	public static void convertLetter(String str)
	{
		char []arr = str.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>='a'&&arr[i]<='z')
			arr[i]=(char)(arr[i]-32);
		}
		System.out.println(arr);
	}
}
